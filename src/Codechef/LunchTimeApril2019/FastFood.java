/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FastFood
{
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out=new PrintWriter(System.out);
	static StringBuilder finalstring=new StringBuilder("");
	public static void main (String[] args) throws java.lang.Exception
	{
		int T=Integer.parseInt(bf.readLine());
    		while(T-->0){
    	    		int N=Integer.parseInt(bf.readLine());
    			int[] A=new int[N+1];
    			int[] B=new int[N+1];
    			StringTokenizer stk=new StringTokenizer(bf.readLine());
    			for(int i=1;i<=N;i++){
    				A[i]=A[i-1]+Integer.parseInt(stk.nextToken());
    			}
    			stk=new StringTokenizer(bf.readLine());
    			for(int i=1;i<=N;i++){
    				B[i]=B[i-1]+Integer.parseInt(stk.nextToken());
    			}
    			long ans=0L;
    			boolean flag=false;
    			for(int i=1;i<=N;i++){
    				int asum=A[N]-A[i-1];
    				int bsum=B[N]-B[i-1];
    				
    				if(asum>=bsum && flag==false){
    					ans+=A[i]-A[i-1];
    				}
    				
    				if((A[i]-A[i-1])>=B[i]-B[i-1]){
    					ans+=A[i]-A[i-1];
    				}else{
    					ans+=B[i]-B[i-1];
    				}
    				
    			}
    			System.out.println(ans);    
    	 	}   
    	}
	
}

