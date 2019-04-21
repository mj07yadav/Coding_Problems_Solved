package Codeforces.Codeforces.Div2.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem451A {
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws Exception {
        StringTokenizer stk = new StringTokenizer(bf.readLine());
        int row = Integer.parseInt(stk.nextToken());
        int col = Integer.parseInt(stk.nextToken());

        if(row%2!=0 && col%2!=0) {
            System.out.println("Akshat");
        }else if(row%2!=0){
            if(row<col)
            System.out.println("Akshat");
            else
                System.out.println("Malvika");
        }else if(col%2!=0){
            if(row<col)
                System.out.println("Malvika");
            else
                System.out.println("Akshat");
        }else{
            System.out.println("Malvika");
        }
    }

}
