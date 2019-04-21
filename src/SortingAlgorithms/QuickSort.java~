import java.util.*;
import java.lang.*;
import java.io.*;

class QuickSort{
	
	static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out=new PrintWriter(System.out);
	public static void main(String args[])throws Exception{
		int T=Integer.parseInt(bf.readLine());
		while(T-->0){
		int N=Integer.parseInt(bf.readLine());
		int arr[]=new int[N];
		StringTokenizer stk=new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++){
			arr[i]=Integer.parseInt(stk.nextToken());
		}
		
		mergeSort(0,arr.length-1,arr);
		print(arr);
		}
	}
	
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static int sortAroundPivot(int[] arr,int strt,int end){
		int pivotindex=strt;
		for(int i=strt+1;i<=end;i++){
			if(arr[i]<arr[pivotindex]){
				if((i-pivotindex)>1){
					//swap arr[i] with arr[pivotindex]
					int temp=arr[pivotindex+1];
					arr[pivotindex+1]=arr[i];
					arr[i]=temp;
					temp=arr[pivotindex];
					arr[pivotindex]=arr[pivotindex+1];
					arr[pivotindex+1]=temp;
					pivotindex++;
				}else if((i-pivotindex)==1){
					int temp=arr[pivotindex];
					arr[pivotindex]=arr[i];
					arr[i]=temp;
					pivotindex++;
				}
			}
		}
		return pivotindex;
	}

	public static void mergeSort(int strt ,int end,int[] arr){
		if(strt==end)
			return ;
		
		if(end<strt)
			return;
		
		int pivot=sortAroundPivot(arr,strt,end);
		//System.out.println(strt+" "+end+" "+pivot);
		mergeSort(strt,pivot-1,arr);
		mergeSort(pivot+1,end,arr);
	}
}
