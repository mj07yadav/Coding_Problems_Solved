import java.util.*;
import java.io.*;

class Triplet{
    int starttime;
    int endtime;
    int vertexid;

    public Triplet(int starttime,int endtime,int vertexid){
        this.starttime=starttime;
        this.endtime=endtime;
        this.vertexid=vertexid;
    }
}

class RestoringTrees{
	static InputReader bf=new InputReader(System.in);
	static PrintWriter out=new PrintWriter(System.out);
	static StringBuilder sb=new StringBuilder("");
	public static void main(String rgas[])throws Exception
	{	
		TreeMap<Integer,Triplet> data=new TreeMap<>();
      	int N=bf.nextInt();
      	int[] parent=new int[N+1];
      	StringTokenizer stk1=new StringTokenizer(bf.nextLine());
      	StringTokenizer stk2=new StringTokenizer(bf.nextLine());
      	for(int i=1;i<=N;i++){
			int starttime=Integer.parseInt(stk1.nextToken());
            	int endtime=Integer.parseInt(stk2.nextToken());
            	Triplet tem=new Triplet(starttime,endtime,i);
            	data.put(starttime,tem);
		}
		
		int lastvalue=data.lastKey();
		while(data.size()>1){
			//System.out.println(data);
			//System.out.println((data.get(lastvalue).endtime-data.get(lastvalue).starttime)+" "+lastvalue+" "+data.lowerKey(lastvalue));
			if((data.get(lastvalue).endtime-data.get(lastvalue).starttime)>1){
				int starttime=data.get(lastvalue).starttime;
				int lasttime=data.get(lastvalue).endtime;
				int vertexidparent=data.get(lastvalue).vertexid;
				//System.out.println(starttime+" "+lasttime+" "+vertexidparent);
				int condition=starttime;
				while(data.higherKey(condition)!=null && data.higherKey(condition)!=lasttime){
					condition=data.higherKey(condition);
					parent[data.get(condition).vertexid]=vertexidparent;
					data.remove(condition);
				}
			}
			if(data.lowerKey(lastvalue)!=null){
				lastvalue=data.lowerKey(lastvalue);
			}
		}
		
		for(int i=1;i<=N;i++){
			sb.append(parent[i]+" ");
		}
		out.println(sb.toString());
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

