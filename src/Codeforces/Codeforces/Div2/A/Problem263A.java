package Codeforces.Codeforces.Div2.A;

import java.util.*;
import java.io.*;

public class Problem263A {

    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String arfs[])throws Exception{
            int xx=0;
            int yy=0;
        for(int i=1;i<=5;i++){
            StringTokenizer stk=new StringTokenizer(bf.readLine());
            for(int j=1;j<=5;j++){
                int temp=Integer.parseInt(stk.nextToken());
                if(temp==1){
                xx=i;
                yy=j;
                }
            }

        }

        int tt=xx-3;
        int mm=yy-3;
        if(tt<0){
            tt*=-1;
        }
        if(mm<0)
            mm*=-1;

        System.out.println((tt+mm));

    }
}
