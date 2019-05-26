import java.util.*;
import java.io.*;
import java.math.*;
 
class Pair{
    int value;
    int index;
    public Pair(int value,int index){
        this.value=value;
        this.index=index;
    }
}
 
class TestClass {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[] ) throws Exception {
        StringTokenizer stk=new StringTokenizer(bf.readLine());
        int N=Integer.parseInt(stk.nextToken());
        int K=Integer.parseInt(stk.nextToken());
        int arr[]=new int[N];
        HashMap<Integer,Integer> minindex=new HashMap<>();
        Pair pairarr[]=new Pair[N];
        stk=new StringTokenizer(bf.readLine());
        for(int i=0;i<N;i++){
            int value=Integer.parseInt(stk.nextToken());
            arr[i]=value;
            if(minindex.containsKey(value)){
                if(minindex.get(value)>i)
                    minindex.put(value,i);
            }else{
                minindex.put(value,i);
            }
            Pair p=new Pair(value,i);
            pairarr[i]=p;
        }
        
        Arrays.sort(pairarr, (p1,p2)->{
            
            if(p1.value<p2.value){
                return -1;
            }else if(p1.value>p2.value){
                return 1;
            }else{
                if(p1.index<p2.index)
                    return -1;
                else
                    return 1;
            }
        });
        
        if(N%2==0){
            int mid1=(N-1)/2;
            int mid2=mid1+1;
            if(minindex.get(pairarr[mid1].value)>minindex.get(pairarr[mid2].value)){
                int mainvalue=pairarr[mid2].value;
                long ans=0;
                for(int i=0;i<N;i++){
                    ans+=Math.abs(arr[i]-mainvalue);
                }
                System.out.println((minindex.get(pairarr[mid2].value)+1)+" "+(((ans-K)<0)?((Math.abs(ans-K)%2)==0?0:1):(ans-K)));
                
            }else{
                int mainvalue=pairarr[mid1].value;
                long ans=0;
                for(int i=0;i<N;i++){
                    ans+=Math.abs(arr[i]-mainvalue);
                }
                System.out.println((minindex.get(pairarr[mid1].value)+1)+" "+(((ans-K)<0)?((Math.abs(ans-K)%2)==0?0:1):(ans-K)));
            }
        }else{
            int mid=(N-1)/2;
            int mainvalue=pairarr[mid].value;
            int index=minindex.get(pairarr[mid].value);
            long ans=0;
                for(int i=0;i<N;i++){
                    ans+=Math.abs(arr[i]-mainvalue);
                }
                System.out.println((index+1)+" "+(((ans-K)<0)?((Math.abs(ans-K)%2)==0?0:1):(ans-K)));
        }
    }
}
