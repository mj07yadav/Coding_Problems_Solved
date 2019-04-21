package DataStructures.Heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


class MyComparator implements Comparator<Integer>{
	
	public int compare(Integer ob1,Integer ob2){
		Integer obb1=(int)ob1;
		Integer obb2=(int)ob2;
		return obb2.compareTo(obb1);
	}
}

public class OptimisedMonkQuery {


	static InputReader bf=new InputReader(System.in);
	static PriorityQueue pr1=new PriorityQueue();
	static PriorityQueue pr2=new PriorityQueue(new MyComparator());
	static int[] arr=new int[100005];
	public static void main(String[] args) throws Exception{
		int n=bf.nextInt();
		while(n-->0){
			//StringTokenizer stk=new StringTokenizer(bf.read);
			int in=bf.nextInt();
			if(in==1){
				//add X
				
			int val=bf.nextInt();	
			arr[val]++;
			pr1.add(val);
			pr2.add(val);
			
			}else if(in==2){
				//remove one instance X
				int val=bf.nextInt();
				if(arr[val]==0)
					System.out.println(-1);
				else
				arr[val]--;
				
			}else if(in==4){
				
				//find maximunm element of the array
				if(!pr1.isEmpty()){
					int temp=(int)pr1.peek();
					int intrepresent =temp;
					if(arr[temp]<=0){
					while(!pr1.isEmpty() && arr[temp]<=0){
						pr1.poll();
						if(!pr1.isEmpty()){
							temp=(int)pr1.peek();
							if(temp!=intrepresent)
								break;
						}
					}	
						if(pr1.isEmpty())
							System.out.println(-1);
						else
							System.out.println(pr1.peek());
					}else{
					System.out.println(pr1.peek());
					}
				
				}else
					System.out.println(-1);
				
				
				//System.out.println(pr1+"  "+pr2);
				
			}else{
				//find minimum element of the array
				if(!pr2.isEmpty()){
					int temp=(int)pr2.peek();
					int intrepresent=temp;
					if(arr[temp]<=0){
					while(!pr2.isEmpty() && arr[temp]<=0){
						pr2.poll();
						if(!pr2.isEmpty())
						temp=(int)pr2.peek();
						if(temp!=intrepresent)
							break;
					}	
						if(pr2.isEmpty())
							System.out.println(-1);
						else
							System.out.println(pr2.peek());
					}else{
					System.out.println(pr2.peek());
					}
				
				}else
					System.out.println(-1);
			}
		}	

	}

}


//Fast IO 

class InputReader {
	 
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
 