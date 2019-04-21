package Codeforces.Codeforces.Div2.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Problem116A  {

    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws Exception{

        int n=Integer.parseInt(bf.readLine());
        int max=Integer.MIN_VALUE;
        int temp=0;
        for(int i=0;i<n;i++){
            StringTokenizer stk=new StringTokenizer(bf.readLine());
            temp+=-Integer.parseInt(stk.nextToken())+Integer.parseInt(stk.nextToken());
           // System.out.println(temp);
            if(temp>max)
                max=temp;
        }
        System.out.println(max);
    }

}
