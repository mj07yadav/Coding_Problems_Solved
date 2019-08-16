import java.util.*;
import java.io.*;

class UnionDisjointSet{
	int value[];
	int root[];
	int max[];
	int min[];
	int rank[];
	
	public UnionDisjointSet(int arr[],int n){
		value=new int[n];
		root=new int[n];
		max=new int[n];
		min=new int[n];
		rank=new int[n];
		
		for(int i=0;i<n;i++){
			value[i]=arr[i];
			root[i]=i;
			max[i]=arr[i];
			min[i]=arr[i];
			rank[i]=1;
		}
	}
	
	public void mergeSet(int index1,int index2){
		int A_parentindex=parentIndex(index1);
		int B_parentindex=parentIndex(index2);
		
		if(A_parentindex!=B_parentindex){
			if(rank[A_parentindex]>rank[B_parentindex]){
				root[B_parentindex]=A_parentindex;
				rank[A_parentindex]+=rank[B_parentindex];
				max[A_parentindex]=Math.max(max[A_parentindex],max[B_parentindex]);
				min[A_parentindex]=Math.min(min[A_parentindex],min[B_parentindex]);
			}else{
				root[A_parentindex]=B_parentindex;
				rank[B_parentindex]+=rank[A_parentindex];
				max[B_parentindex]=Math.max(max[A_parentindex],max[B_parentindex]);
				min[B_parentindex]=Math.min(min[A_parentindex],min[B_parentindex]);
			}
		}
	}
	
	public int absoluteDiff(int index1){
		int index=parentIndex(index1);
		return Math.abs(max[index]-min[index]);
	}
	
	public int parentIndex(int index1){
		if(root[index1]==index1){
			return index1;
		}
		
		root[index1]=parentIndex(root[index1]);
		return root[index1];
	}

}

class MergeTheGroups{
static InputReader bf=new InputReader(System.in);
static PrintWriter out=new PrintWriter(System.out);
static StringBuilder finalstring=new StringBuilder("");

public static void main(String args[])throws Exception{
	int N=bf.nextInt();
	int arr[]=new int[N];
	for(int i=0;i<N;i++){
		arr[i]=bf.nextInt();
	}
	UnionDisjointSet union=new UnionDisjointSet(arr,N);
	
	int Q=bf.nextInt();
	while(Q-->0){
		if(bf.nextInt()==1){
			int X=bf.nextInt()-1;
			int Y=bf.nextInt()-1;
			union.mergeSet(X,Y);
		}else{
			int X=bf.nextInt()-1;
			finalstring.append(union.absoluteDiff(X)).append('\n');
		}
	}
out.println(finalstring.toString());
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

