package Codeforces.Codeforces.Div2.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem268A {

    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws Exception{
           int n=Integer.parseInt(bf.readLine());
           int teamhost[]=new int[n];
           int colors[]=new int[101];

           for(int i=0;i<n;i++){
            StringTokenizer stk=new StringTokenizer(bf.readLine());
            int hi=Integer.parseInt(stk.nextToken());
            teamhost[i]=hi;
            int ai=Integer.parseInt(stk.nextToken());
            colors[ai]+=1;
           }

           int total=0;
           for(int i=0;i<n;i++){
                total+=colors[teamhost[i]];
           }

           System.out.println(total);
        }


}
