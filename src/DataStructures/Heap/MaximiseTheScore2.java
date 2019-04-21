package DataStructures.Heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

class MyComparator1 implements Comparator<Long>{
	
	public int compare(Long ob1,Long ob2){
		Long obb1=(long)ob1;
		Long obb2=(long)ob2;
		
		long sum1=0;
		while(obb1>0) {
			long digit=obb1%10;
			obb1/=10;
			sum1+=digit;
		}
		
		long sum2=0;
		while(obb2>0) {
			long digit=obb2%10;
			obb2/=10;
			sum2+=digit;
		}
		Long suml=new Long(sum1);
		Long sum2l=new Long(sum2);
		return suml.compareTo(sum2l);
	}
}



public class MaximiseTheScore2 {

	public static InputReaderMaximise2 bf = new InputReaderMaximise2(System.in);

	public static void main(String[] args) {
		solver(bf);
	}

	public static void solver(InputReaderMaximise2 bf) {

		int t = bf.nextInt();
		while(t-->0) {
		int n = bf.nextInt();
		int k = bf.nextInt();
		long arr[] = new long[n];
		PriorityQueue pr=new PriorityQueue(new MyComparator1());
		
		for (int i = 0; i < n; i++) {
			arr[i] = bf.nextLong();
			pr.add(arr[i]);
			}
		
		String flag=bf.readString();
		boolean indi=false;
		if(flag.equals("TAILS"))
			indi=true;
		
		
		System.out.println();
		while(n-->0) {
			if(indi==true) {
				//watson
				int turn=k;
				while(turn-->0 && !pr.isEmpty()) {
					
					
				}
				
			}else{
				//sherlock
				int turn=k;
				while(turn-->0 && !pr.isEmpty()) {
					
					
				}
				
				
			}	
			}
		
				}
	}
}



//Fast IO 

class InputReaderMaximise2 {

	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;

	public InputReaderMaximise2(InputStream stream) {
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
