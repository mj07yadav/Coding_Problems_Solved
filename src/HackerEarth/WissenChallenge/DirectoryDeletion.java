import java.util.*;
import java.io.*;
import java.lang.*;

class DirectoryDeletion{
	static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out=new PrintWriter(System.out);
	static int count=0;
	public static void main(String args[])throws Exception{
		int N=Integer.parseInt(bf.readLine());
		HashMap<Integer,ArrayList<Integer>> edgelist=new HashMap<>();
		HashMap<Integer,Integer> find=new HashMap<>();
		StringTokenizer stk=new StringTokenizer(bf.readLine());
		for(int i=1;i<=N;i++){
			int value=Integer.parseInt(stk.nextToken());
			if(value==-1){
				ArrayList<Integer> al=new ArrayList<>();
				edgelist.put(i,al);
			}else{
				//value is parent and index is child  
				if(edgelist.containsKey(value)){
					edgelist.get(value).add(i);
				}else{
					ArrayList<Integer> al=new ArrayList<>();
					al.add(i);
					edgelist.put(value,al);
				}
			}
		}
		
		int Q=Integer.parseInt(bf.readLine());
		stk=new StringTokenizer(bf.readLine());
		ArrayList<Integer> alist=new ArrayList<>();
		for(int i=0;i<Q;i++){
		    int value=Integer.parseInt(stk.nextToken());
		    alist.add(value);
		    find.put(value,0);
		}
		Collections.sort(alist);
		
		for(int i=0;i<Q;i++){
			dfs(1,alist.get(i),edgelist,1,find);
		}
		
		out.println(count);
		out.close();		
	}
	
	public static void dfs(int src,int des,HashMap<Integer,ArrayList<Integer>> adjlist,int parent,HashMap<Integer,Integer> find){
		//System.out.println(src+" "+des+" "+adjlist+" "+parent);
		if(find.containsKey(src) || src==des){
			adjlist.get(parent).remove(new Integer(src));
			if(adjlist.containsKey(src)){
				adjlist.remove(src);
			}
			count++;
			return ;
		}
		
		if(adjlist.containsKey(src)){
		for(int i=0;i<adjlist.get(src).size();i++){
			dfs(adjlist.get(src).get(i),des,adjlist,src,find);	
		}
		}
	}

}
