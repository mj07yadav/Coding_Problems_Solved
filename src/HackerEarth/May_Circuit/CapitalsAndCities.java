import java.util.*;
import java.io.*;
import java.math.*;
 
class CapitalsAndCities{
	static InputReader bf=new InputReader(System.in);
	static PrintWriter out=new PrintWriter(System.out);
	static StringBuilder finalprint=new StringBuilder("");
	public static void main(String args[])throws Exception{
	int N=bf.nextInt();
	int K=bf.nextInt();
	int arr[]=new int[N];
	int sortedarr[]=new int[N];
	long[] prefixsumarr=new long[N+1];
	HashMap<Integer,Integer> minindex=new HashMap<>();
	
	for(int i=0;i<N;i++){
		arr[i]=bf.nextInt();
		sortedarr[i]=arr[i];
	}
	Arrays.sort(sortedarr);
	
	for(int i=1;i<=N;i++){
		if(minindex.containsKey(sortedarr[i-1])){
			if(minindex.get(sortedarr[i-1])>i-1){
				minindex.put(sortedarr[i-1],i-1);
			}
		}else{
			minindex.put(sortedarr[i-1],i-1);
		}
		prefixsumarr[i]+=prefixsumarr[i-1]+sortedarr[i-1];
	}
	
	boolean flag=false;
	int minindexvalue=Integer.MAX_VALUE;
	long ansvalue=Long.MAX_VALUE;
	for(int i=0;i<N;i++){
		int index=minindex.get(arr[i]);
		long leftvalue=(long)Math.abs(prefixsumarr[index]-prefixsumarr[0]-(long)((long)arr[i]*(long)index));
		long rightvalue=(long)Math.abs(prefixsumarr[N]-prefixsumarr[index+1]-(long)((long)arr[i]*(long)(N-(index+1))));
		//System.out.println((leftvalue+rightvalue)+" "+index);
		if((leftvalue+rightvalue)<=K){
		    long tempvalue=((K-leftvalue-rightvalue)%2)==0?0:1;
		    if(tempvalue<ansvalue){
                ansvalue=tempvalue;
                minindexvalue=i;
		    }
		}else{
			if((leftvalue+rightvalue-K)<ansvalue){
				ansvalue=leftvalue+rightvalue-K;
				minindexvalue=i;
			}
		}
	}
	
	finalprint.append((minindexvalue+1)+" "+ansvalue).append("\n");
	
	
	out.println(finalprint.toString());
	out.close();
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
