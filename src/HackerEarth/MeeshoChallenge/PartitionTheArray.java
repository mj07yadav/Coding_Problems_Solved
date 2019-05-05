import java.util.*;
import java.io.*;
import java.math.*;


class PartitionTheArray{

	static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out=new PrintWriter(System.out);
	static StringBuilder finalstring=new StringBuilder("");
	public static void main(String args[])throws Exception{
		int N=Integer.parseInt(bf.readLine());
		int index=-1;
		BigInteger minabs=new BigInteger(""+Integer.MAX_VALUE);
		BigInteger[] arr=new BigInteger[N+1];
		StringTokenizer stk=new StringTokenizer(bf.readLine());
		arr[0]=new BigInteger("1");
		for(int i=1;i<=N;i++){
			arr[i]=arr[i-1].multiply(new BigInteger(""+Long.parseLong(stk.nextToken())));
		}
		
		for(int i=1;i<=N;i++){
			BigInteger left=arr[i].divide(arr[0]);
			BigInteger right=arr[N].divide(arr[i]);
			BigInteger  minabstemp=left.subtract(right);
			minabstemp=minabstemp.abs();
			if(minabstemp.compareTo(minabs)<0){
				minabs=minabstemp;
				index=i;
			}
		}
		
		out.println(index);
		out.close();
	}

}
