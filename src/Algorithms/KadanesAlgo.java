package Algorithms;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStream;
    import java.io.InputStreamReader;
    import java.util.HashSet;
    import java.util.InputMismatchException;
    import java.util.StringTokenizer;
     
     
     class KadaneAlgo {
    	
    	static InputReaderKadane ir=new InputReaderKadane(System.in);
    	/**
    	 * @param args
    	 * @throws Exception
    	 */
    	public static void main(String[] args) throws Exception{
    		int n=ir.nextInt();
    		long arr[]=new long[n];
    		long min=Integer.MIN_VALUE;
    		for(int i=0;i<n;i++){
    			arr[i]=ir.nextLong();
    			if(min<arr[i])
    				min=arr[i];
    		}
    		
    		//Kadane's Algorithm
    		if(min<=0){
    			System.out.println(min);
    		}else{
    		long maxsum=arr[0];
    		long tempsum=arr[0];
    		HashSet hs=new HashSet();
    		hs.add(arr[0]);
    		for(int i=1;i<n;i++){
    			if(hs.contains(arr[i])){
    				if(arr[i-1]!=arr[i]){
    					i=i-2;
    					hs.clear();
    					tempsum=0;
    				}
    			}else{
    			tempsum=tempsum+arr[i];
    			//System.out.println(tempsum+"  "+maxsum);
    			hs.add(arr[i]);
    			
    			if(tempsum<0){
    				tempsum=0;
    				hs.clear();
    			}
    			
    			if(tempsum>maxsum)
    				maxsum=tempsum;
    			}
    		}
    		System.out.println(maxsum);
    		}
    	}
     
    	
    }
     
     
     //Fast IO 
     
     class InputReaderKadane {
    	 
         private InputStream stream;
         private byte[] buf = new byte[1024];
         private int curChar;
         private int numChars;
         private SpaceCharFilter filter;
      
         public InputReaderKadane(InputStream stream) {
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
      