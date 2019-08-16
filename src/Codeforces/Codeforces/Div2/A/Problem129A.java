import java.util.*;
import java.io.*;

public class Problem129A{

	static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out=new PrintWriter(System.out);
	static StringBuilder sb = new StringBuilder("");
	public static void main(String args[])throws Exception{
		
		int N=Integer.parseInt(bf.readLine());
		StringTokenizer stk=new StringTokenizer(bf.readLine());
		int evencount=0;
		int oddcount=0;
		int totalcount=0;
		
		for(int i=0;i<N;i++){
			
			int temp=Integer.parseInt(stk.nextToken());
			totalcount+=temp;
			
			if(temp%2==0){
				
				evencount++;
			
			}else{
				
				oddcount++;
			
			}
		
		}

		if(totalcount%2==0){

			sb.append(evencount).append("\n");

		}else{

			sb.append(oddcount).append("\n");

		}

		System.out.println(sb.toString());
	}
}