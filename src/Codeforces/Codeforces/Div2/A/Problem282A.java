package Codeforces.Codeforces.Div2.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem282A {

    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws Exception{
            int n=Integer.parseInt(bf.readLine());
            int value=0;
            for(int i=0;i<n;i++){
                String s=bf.readLine();
                if(s.contains("+"))
                    value++;
                else
                    value--;
            }
            System.out.println(value);

    }


}
