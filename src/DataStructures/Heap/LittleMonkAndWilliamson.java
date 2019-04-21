package DataStructures.Heap;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStream;
    import java.io.InputStreamReader;
    import java.io.PrintWriter;
    import java.util.Comparator;
    import java.util.InputMismatchException;
    import java.util.PriorityQueue;
     
     class LittleMonkAndWilliamson {
    	static PriorityQueue small;
    	static PriorityQueue high;
    	static final InputReaderMaximise2William bf = new InputReaderMaximise2William(System.in);
    	static final PrintWriter out = new PrintWriter(System.out);
    	static int arr[] = new int[100001];
     
    	public static void main(String[] args) throws Exception {
    		int q = bf.nextInt();
     
    		small = new PriorityQueue<Integer>(100001);
    		high = new PriorityQueue<Integer>(100001,new Comparator<Integer>() {
     
    			@Override
    			public int compare(Integer arg0, Integer arg1) {
     
    				return arg1.compareTo(arg0);
    			}
     
    		});
     
    		while (q-- > 0) {
    			String type = bf.next();
    			if (type.equals("CountHigh")) {
    				if (!high.isEmpty()) {
    					if (arr[(int) high.peek()] > 0) {
    						out.println(arr[(int) high.peek()]);
    					} else {
    						int tempval = arr[(int) high.peek()];
    						while (tempval <= 0) {
    							high.poll();
    							if (!high.isEmpty())
    								tempval = arr[(int) high.peek()];
    							else {
    								tempval = -1;
    								break;
    							}
    						}
    						out.println(tempval);
    					}
    				} else {
    					out.println(-1);
    				}
    				}else if (type.equals("CountLow")) {
    					if (!small.isEmpty()) {
    						if (arr[(int) small.peek()] > 0) {
    							out.println(arr[(int) small.peek()]);
    						} else {
    							int tempval = arr[(int) small.peek()];
    							while (tempval <= 0) {
    								small.poll();
    								if (!small.isEmpty())
    									tempval = arr[(int) small.peek()];
    								else {
    									tempval = -1;
    									break;
    								}
    							}
    							out.println(tempval);
    						}
    					} else {
    						out.println(-1);
    					}
     
    				} else if (type.equals("Push")) {
     
    					int val = bf.nextInt();
    					arr[val]++;
    					high.add(val);
    					small.add(val);
     
    				} else {
    					if(!high.isEmpty() && !small.isEmpty()) {
    						int highval=0;
    						int smallicount=0;
    						int highount=0;
    						int smallval=0;
    						
    						if(arr[(int)high.peek()]<=0) {
    							highount=arr[(int)high.peek()];
    						
    							while (highount<= 0) {
    							high.poll();
    							if (!high.isEmpty()) {
    								highount = arr[(int)high.peek()];
    								highval=(int)high.peek();
    							}else {
    								highval= -1;
    								break;
    							}
    						}
    						}else {
    							highval=(int)high.peek();
    						}
    					//small
    						if(arr[(int)small.peek()]<=0) {
    							smallicount=arr[(int)small.peek()];
    						
    							while (smallicount<= 0) {
    							small.poll();
    							if (!small.isEmpty()) {
    								smallicount = arr[(int)small.peek()];
    								smallval = (int)small.peek();
    							}else {
    								smallval= -1;
    								break;
    							}
    						}
    						}else {
    							smallval=(int)small.peek();
    						}
    					
    						if(smallval==highval && smallval!=-1 && highval!=-1) {
    							out.println(highval-smallval);
    							arr[smallval]--;
    							high.poll();
    							small.poll();
    						}else if(smallval!=highval && smallval!=-1 && highval!=-1){
    							out.println(highval-smallval);
    							arr[smallval]--;
    							arr[highval]--;
    							small.poll();
    							high.poll();
    						}else {
    							out.println(-1);
    						}
    						
    						
    					}else {
    						out.println(-1);
    					}
    					
    					
    				}
     
    			}
    		
    		
    		}
    	}
     
    	// Fast IO
     
    	 class InputReaderMaximise2William {
     
    		private InputStream stream;
    		private byte[] buf = new byte[1024];
    		private int curChar;
    		private int numChars;
    		private SpaceCharFilter filter;
     
    		public InputReaderMaximise2William(InputStream stream) {
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