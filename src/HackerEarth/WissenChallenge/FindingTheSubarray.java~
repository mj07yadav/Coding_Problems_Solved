import java.util.*;
import java.io.*;
import java.lang.*;

class FindingTheSubarray{
	
	static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out=new PrintWriter(System.out);
	static StringBuilder sb=new StringBuilder("");
	static StringBuilder finalstring=new StringBuilder("");
	static int count=0;
	public static void main(String args[])throws Exception{
		int n=Integer.parseInt(bf.readLine());
		int arr[]=new int[n+1];
		StringTokenizer stk=new StringTokenizer(bf.readLine());
		for(int i=1;i<=n;i++){
			int value=Integer.parseInt(stk.nextToken());
			arr[i]=arr[i-1]+value;
		}
		
		for(int i=1;i<=n;i++){
			double prevaverage=0.0;
			double currentaverage=0.0;
			double nextaverage=0.0;
			for(int j=i;j<=n;j++){
				currentaverage=(double)(arr[j]-arr[i-1])/(j-i+1);
				prevaverage=(double)(arr[i-1]-arr[0])/(((i-1)==0)?1:(i-1));
				nextaverage=(double)(arr[n]-arr[j])/(((n-j)==0)?1:(n-j));
				System.out.println(currentaverage+" "+prevaverage+" "+nextaverage);
				if(Double.compare(currentaverage,prevaverage)==1 && Double.compare(currentaverage,nextaverage)==1){
					count++;
					sb.append(i+" "+j).append('\n');
				}
			}
		}
		finalstring.append(count).append('\n').append(sb.toString());
		out.println(finalstring.toString());
		out.close();
	}
}
