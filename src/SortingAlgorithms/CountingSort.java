import java.util.*;
import java.io.*;

class FriendlyString{
	static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out=new PrintWriter(System.out);
	static StringBuilder finalstring=new StringBuilder("");
	public static void main(String args[])throws Exception{
		int T=Integer.parseInt(bf.readLine());
		while(T-->0){
			int countpairs=0;
			int N=Integer.parseInt(bf.readLine());
			HashMap<String,Integer> hm=new HashMap<>();
			String[] list=new String[N];
			for(int i=0;i<N;i++){
				list[i]=bf.readLine();
			}
			Arrays.sort(list,(s1,s2)->{			
					if(s1.length()<s2.length())
						return -1;
					else if(s1.length()>s2.length())
						return 1;
					else
						return 0;
			});
			
			for(int i=0;i<N;i++){
				String[] temp=sortString(list[i]);
				if(temp[1]!=null){
					if(hm.containsKey(temp[1])){
						countpairs+=hm.get(temp[1]);
						if(hm.containsKey(temp[0])){
							hm.put(temp[0],hm.get(temp[0])+1);
						}else{
							hm.put(temp[0],1);
						}						
					}else{
						if(hm.containsKey(temp[0])){
							hm.put(temp[0],hm.get(temp[0])+1);
						}else{
							hm.put(temp[0],1);
						}
					}
				}else{
					if(hm.containsKey(temp[0])){
						hm.put(temp[0],hm.get(temp[0])+1);
					}else{
						hm.put(temp[0],1);
					}
				}
				//System.out.println(hm);
			}
			
			finalstring.append(countpairs).append('\n');
		}
		out.println(finalstring.toString());
		out.close();
	}
	
	
	//sorting algorithm
	
	public static String[] sortString(String ss){
		int[] charfreq=new int[256];
		for(int i=0;i<ss.length();i++){
			charfreq[ss.charAt(i)]++;
		}
		
		boolean flag=true;
		for(int i=0;i<256;i++){
			if(charfreq[i]%2!=0){
				flag=false;
				break;	
			}	
		}
		
		StringBuilder actualstring=new StringBuilder("");
		StringBuilder trimmedstring=new StringBuilder("");
		for(int i=0;i<256;i++){
			int temp=charfreq[i];
			int temptrimmed=charfreq[i]/2;
			while(temp-->0){
				actualstring.append((char)i);
			}
			while(temptrimmed-->0){
				trimmedstring.append((char)i);	
			}
		}
		String[] sett=new String[2];
		if(flag==true)
			sett[1]=trimmedstring.toString();
		else
			sett[1]=null;
		sett[0]=actualstring.toString();
		
		//System.out.println(sett[1]+" "+sett[0]);
		return sett;
	}
}
