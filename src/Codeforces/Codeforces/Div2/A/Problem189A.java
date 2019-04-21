package Codeforces.Codeforces.Div2.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem189A {
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer stk;
    static int universalcount=0;

    public static void main(String args[])throws Exception{
        stk=new StringTokenizer(bf.readLine());
        TreeSet<Integer> ts=new TreeSet<>();
        int n=Integer.parseInt(stk.nextToken());
        ts.add(Integer.parseInt(stk.nextToken()));
        ts.add(Integer.parseInt(stk.nextToken()));
        ts.add(Integer.parseInt(stk.nextToken()));

        if(ts.contains(1))
            System.out.println(n);
        else {
            findmin(ts, n, 0, 0);
            System.out.println(universalcount);
        }
        }

    public static int findmin(TreeSet ts,int n,int count,int value){
       //System.out.println(n+" "+count+" "+value);
        if(value>n)
            return -1;
        if(value==n){
            //System.out.println("");
            if(count>universalcount)
                universalcount=count;

            return 0;
        }

        int temp=-1;
        Iterator itr=ts.iterator();
        while(itr.hasNext()){
            int ttt=(int)itr.next();
       //    System.out.print(ttt+" ");
           temp=findmin(ts,n,count+1,value+ttt);
        }

        return temp;
    }


}
