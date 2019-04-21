package Codeforces.Codeforces.Div2.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem133A {
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws Exception{
        String s=(bf.readLine());
        if(s.contains("H") || s.contains("Q") || s.contains("9") )
            System.out.println("YES");
        else
            System.out.println("NO");


    }


}
