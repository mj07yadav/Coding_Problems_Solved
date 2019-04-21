import java.util.*;
import java.io.*;

class DecreasingArray {

	static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out=new PrintWriter(System.out);
	static StringBuilder finalstring=new StringBuilder("");
	public static void main(String args[])throws Exception{
		int T=Integer.parseInt(bf.readLine());
		while(T-->0){
			int N=Integer.parseInt(bf.readLine());
			int arr[]=new int[N+1];
			int leftmin[]=new int[N+1];
			int leftmax[]=new int[N+1];
			int rightmin[]=new int[N+1];
			int rightmax[]=new int[N+1];
			StringTokenizer stk=new StringTokenizer(bf.readLine());
			for(int i=1;i<=N;i++){
				arr[i]=Integer.parseInt(stk.nextToken());
			}
			
			leftmin[1]=arr[1];
			leftmax[1]=arr[1];
			//System.out.println(leftmin[1]+" "+leftmax[1]);
			for(int i=2;i<=N;i++){
				if(arr[i]>leftmax[i-1])
					leftmax[i]=arr[i];
				else 
					leftmax[i]=leftmax[i-1];
				
				if(arr[i]<leftmin[i-1])				
					leftmin[i]=arr[i];
				else
					leftmin[i]=leftmin[i-1];		
			}
			rightmin[N]=arr[N];
			rightmax[N]=arr[N];
			for(int i=N-1;i>0;i--){
				if(arr[i]>rightmax[i+1])
					rightmax[i]=arr[i];
				else 
					rightmax[i]=rightmax[i+1];
				
				if(arr[i]<rightmin[i+1])				
					rightmin[i]=arr[i];
				else
					rightmin[i]=rightmin[i+1];
			}
			int Q=Integer.parseInt(bf.readLine());	
			int[] querytype=new int[Q];
			int[] value=new int[Q];
			stk=new StringTokenizer(bf.readLine());
			for(int i=0;i<Q;i++)
				querytype[i]=Integer.parseInt(stk.nextToken());
			
			stk=new StringTokenizer(bf.readLine());
			for(int i=0;i<Q;i++)
				value[i]=Integer.parseInt(stk.nextToken());
			
			for(int i=0;i<Q;i++){
				if(querytype[i]==1){
					int values=value[i];
					int mininrange=leftmin[values];
					int maxinrange=leftmax[values];
					int maxoutrange=0;
					if(values!=N){
						maxoutrange=rightmax[N-(N-values)+1];
						//System.out.println(mininrange+" "+maxinrange+" "+maxoutrange);
						if(mininrange==maxinrange)
							finalstring.append(maxinrange+maxoutrange).append('\n');
						else if(mininrange!=maxinrange && (maxinrange-mininrange)>maxoutrange)
							finalstring.append(maxinrange).append('\n');
						else if(mininrange!=maxinrange && (maxinrange-mininrange)==maxoutrange)
							finalstring.append(mininrange+maxoutrange).append('\n');
						else if(mininrange!=maxinrange && (maxinrange-mininrange)<maxoutrange)
							finalstring.append(mininrange+maxoutrange).append('\n');
					}else{
						finalstring.append(maxinrange).append('\n');
					}
					
				}else{
					int values=value[i];
					int mininrange=rightmin[N-values+1];
					int maxinrange=rightmax[N-values+1];
					int maxoutrange=0;
					if(values!=N){
						maxoutrange=leftmax[(N-values)];
						//System.out.println(mininrange+" "+maxinrange+" "+maxoutrange);
						if(mininrange==maxinrange)
							finalstring.append(maxinrange+maxoutrange).append('\n');
						else if(mininrange!=maxinrange && (maxinrange-mininrange)>maxoutrange)
							finalstring.append(maxinrange).append('\n');
						else if(mininrange!=maxinrange && (maxinrange-mininrange)==maxoutrange)
							finalstring.append(mininrange+maxoutrange).append('\n');
						else if(mininrange!=maxinrange && (maxinrange-mininrange)<maxoutrange)
							finalstring.append(mininrange+maxoutrange).append('\n');
					}else{
						finalstring.append(maxinrange).append('\n');
					}
					
				}
			}
		}
		out.println(finalstring.toString());
		out.close();
	}
}
