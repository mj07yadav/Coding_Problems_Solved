package Codeforces.Codeforces.Div2.A;
import java.util.*;
import java.io.*;

public class BitSetProblem467B {
    
    public static void main(String args[])throws Exception{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk=new StringTokenizer(bf.readLine());
        int n=Integer.parseInt(stk.nextToken());
        int m=Integer.parseInt(stk.nextToken())+1;
        int k=Integer.parseInt(stk.nextToken());
        BitSet arr[]=new BitSet[m];

       // System.out.println(n+" "+m+ " "+k);
        for(int j=0;j<m;j++) {
         //   System.out.println(arr[j]+"  ss");
            int nm = Integer.parseInt(bf.readLine());
            String ss = Integer.toBinaryString(nm);

            String stemp="";
            if(ss.length()<n){
                int temp=n-ss.length();
                while((temp)-->0){
                    stemp+='0';
                }
            ss=stemp+ss;
            }
            //System.out.println(ss);
            BitSet b1 = new BitSet(n);
            for (int i = 0; i < n; i++) {
                if (i < ss.length() && ss.charAt(i) == '1')
                    b1.set(i);
            }

            arr[j]=b1;

        }

        BitSet fero=arr[m-1];
        //System.out.println(fero);
        int friends=0;
        for(int i=0;i<m-1;i++){
            BitSet b=arr[i];
            b.xor(fero);
           // System.out.println(fero.cardinality()+"  "+b.cardinality());
            if(b.cardinality()<=k)
                friends++;

        }


        System.out.println(friends);
    }

}
