import java.util.*;
import java.io.*;

class PRIME1{
	static InputReader bf=new InputReader(System.in);
	static PrintWriter out=new PrintWriter(System.out);
	static StringBuilder finalprint=new StringBuilder("");
	
	public static void main(String args[])throws Exception{
		int T=bf.nextInt();
		while(T-->0){
			int strt=bf.nextInt();
			int end=bf.nextInt();
			numberOfPrimesInRange(strt,end);
			finalprint.append('\n');
		}
		out.println(finalprint.toString());
		out.close();
	}

/*
	public static void primeGenerator( int strt,int end){
		boolean arr[]=new boolean[end+1];
		int m=(int)Math.sqrt(end);
		for(int i=2;i<=m;i++){
			if(arr[i]==false){
				for(int j=i;j*i<=end;j++){
					arr[i*j]=true;
				}
			}
	      }
	      numberOfPrimesInRange(strt,end,arr);
	}
*/
	public static void numberOfPrimesInRange(int strt,int end){
		for(int i=strt;i<=end;i++){
			if(isPrime(i) && i!=1){
				finalprint.append(i);
				finalprint.append('\n');
			}
		}
	}
	
	public static boolean isPrime(int number){
		boolean flag=true;
		for(int i=2;i<=(int)Math.sqrt(number);i++){
			if(number%i==0){
				flag=false;
				break;
			}
		}

		return flag;
	}

}







//Fast IO

class InputReader{

	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;

	public InputReader(InputStream stream) {
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

