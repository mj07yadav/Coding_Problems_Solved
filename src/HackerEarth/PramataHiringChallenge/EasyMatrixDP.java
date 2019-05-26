import java.util.*;
import java.io.*;

class EasyMatrixDP{
	static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out=new PrintWriter(System.out);
	static int N;
	static int M;
	static char[][] arr;
	static List<String> arrstring=new ArrayList<>(N*M);
	public static void main(String args[])throws Exception{
		StringTokenizer stk=new StringTokenizer(bf.readLine());
		N=Integer.parseInt(stk.nextToken());
		M=Integer.parseInt(stk.nextToken());
		String lexicographically="";
		arr=new char[N][M];
		
		
		for(int i=0;i<N;i++){
			stk =new StringTokenizer(bf.readLine());
			for(int j=0;j<M;j++){
				String s=stk.nextToken();
				arr[i][j]=s.charAt(0);
			}
		}
		
		backtrackOnMatrix(0,0,new StringBuilder("").append(arr[0][0]));
		for(int i=0;i<arrstring.size();i++){
			String s=countSort(arrstring.get(i));
			if(i==0)
				lexicographically=s;
			else{
				if(s.compareTo(lexicographically)<0)
					lexicographically=s;
			}
		}
		
		out.println(lexicographically);
		out.close();	
	}


	public static void backtrackOnMatrix(int x ,int y,StringBuilder tempstring){
		//System.out.println(tempstring.toString());
		if(x==N-1 && y==M-1){
			arrstring.add(tempstring.toString());
			//System.out.println(" here ");
			return ;
		}
		
		if(x+1<N){
			backtrackOnMatrix(x+1,y,tempstring.append(arr[x+1][y]));
			tempstring.delete(tempstring.length()-1,tempstring.length());		
		}
		
		if(y+1<M){
			backtrackOnMatrix(x,y+1,tempstring.append(arr[x][y+1]));
			tempstring.delete(tempstring.length()-1,tempstring.length());		
		}
		
	}
	
	public static String countSort(String s){
		int arr[]=new int[26];
		for(int i=0;i<s.length();i++){
			arr[(int)s.charAt(i)%97]++;
		}
		
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<26;i++){
			int temp=arr[i];
			while(temp-->0){
				sb.append((char)(i+97));
			}
		}
		
		return sb.toString();
	}
} 
