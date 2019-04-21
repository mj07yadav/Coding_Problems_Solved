package DataStructures.Heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.TreeMap;

public class MaximiseTheScore {

	public static InputReaderMaximise bf = new InputReaderMaximise(System.in);

	public static void main(String[] args) {


		int t = bf.nextInt();
		while(t-->0) {
		int n = bf.nextInt();
		int k = bf.nextInt();
		long arr[] = new long[n];
		HashMap<Long, Integer> count = new HashMap<>(1000000);
		TreeMap<Long,Long> tr= new TreeMap();

		for (int i = 0; i < n; i++) {
			arr[i] = bf.nextLong();
			if(count.containsKey(arr[i])) {
				int temp=count.get(arr[i]);
				count.put(arr[i],temp++);
			}else {
				count.put(arr[i],1);
			}
		}
		
		String flag=bf.readString();
		
		Arrays.sort(arr);
		for(int i=0;i<n;i++){
			long temp=arr[i];
			long sum=0;
			while(temp>0) {
				long digit=temp%10;
				temp/=10;
				sum+=digit;
			}
			tr.put(sum,arr[i]);
		}
		boolean flags=false;
		if(flag.equals("TAILS")) {
			flags=true;
		}
			
		long whatsonsum=0;
		long sherlocksum=0;
		while(n-->0) {
			long tt=0;
			long val=0;
		//	System.out.println(val+" "+tr );
		if(flags==true) {
			//watson
			if(!tr.isEmpty()) {
			tt=tr.lastKey();
			val=tr.get(tt);
			}
		//	System.out.println(n+"  "+tt+" "+val);
			int turn=k;
			while(turn>0 && n>=0 && !tr.isEmpty()) {
				//System.out.println("hello ");
			//	System.out.println(count.get(val)+" s "+val+"  "+tr+"  "+count);
				if(count.get(val)>0) {
				whatsonsum+=val;
				int temp=count.get(val);
				count.put(val,temp-1);
				if(count.get(val)<=0) {
					tr.remove(tt);
					if(!tr.isEmpty())
					val=tr.get(tr.lastKey());
				}
				turn--;
			}else{
				tr.remove(tt);
				if(!tr.isEmpty()) {
					tt=tr.lastKey();
					val=tr.get(tr.lastKey());
				}
				turn++;
			}
			}
			flags=false;
		}else{
			//sherlock
			//System.out.println(n);
		//	System.out.println("ss");
			int turn=k;
				for(int i=arr.length-1;i>=0;i--) {
				if(count.get(arr[i])>0 && turn>0) {
				//	System.out.println(count.get(arr[i])+"  "+arr[i]+"    "+tr+"  "+count);
					sherlocksum+=arr[i];
					int temp=count.get(arr[i]);
					count.put(arr[i],temp-1);
					
//					if(count.get(arr[i])<=0) {
//						long g=tr.lastKey();
//						tr.remove(g);
//						if(!tr.isEmpty()) {
//							tt=tr.lastKey();
//							val=tr.get(tr.lastKey());
//						
//						}
//					}
					turn--;
				}
				
				
				if(turn==0)
					break;
				}
				//System.out.println("    "+tr+"  "+count);
				flags=true;
		}	
		}
		System.out.println(sherlocksum+" "+whatsonsum);
		
		}
	
	}


}

//Fast IO 

class InputReaderMaximise {

	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;

	public InputReaderMaximise(InputStream stream) {
		this.stream = stream;
	}

	public int read() {
		if (numChars == -1) {
			throw new InputMismatchException();
		}

		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}

			if (numChars <= 0) {
				return -1;
			}
		}
		return buf[curChar++];
	}

	public String nextLine() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}

	public int nextInt() {
		int c = read();

		while (isSpaceChar(c)) {
			c = read();
		}

		int sgn = 1;

		if (c == '-') {
			sgn = -1;
			c = read();
		}

		int res = 0;
		do {
			if (c < '0' || c > '9') {
				throw new InputMismatchException();
			}
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));

		return res * sgn;
	}

	public long nextLong() {
		int c = read();
		while (isSpaceChar(c)) {
			c = read();
		}
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		long res = 0;

		do {
			if (c < '0' || c > '9') {
				throw new InputMismatchException();
			}
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public double nextDouble() {
		int c = read();
		while (isSpaceChar(c)) {
			c = read();
		}
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		double res = 0;
		while (!isSpaceChar(c) && c != '.') {
			if (c == 'e' || c == 'E') {
				return res * Math.pow(10, nextInt());
			}
			if (c < '0' || c > '9') {
				throw new InputMismatchException();
			}
			res *= 10;
			res += c - '0';
			c = read();
		}
		if (c == '.') {
			c = read();
			double m = 1;
			while (!isSpaceChar(c)) {
				if (c == 'e' || c == 'E') {
					return res * Math.pow(10, nextInt());
				}
				if (c < '0' || c > '9') {
					throw new InputMismatchException();
				}
				m /= 10;
				res += (c - '0') * m;
				c = read();
			}
		}
		return res * sgn;
	}

	public String readString() {
		int c = read();
		while (isSpaceChar(c)) {
			c = read();
		}
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));

		return res.toString();
	}

	public boolean isSpaceChar(int c) {
		if (filter != null) {
			return filter.isSpaceChar(c);
		}
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}

	public String next() {
		return readString();
	}

	public interface SpaceCharFilter {

		public boolean isSpaceChar(int ch);
	}
}
