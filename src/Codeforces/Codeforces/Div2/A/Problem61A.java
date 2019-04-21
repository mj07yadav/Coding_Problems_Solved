package Codeforces.Codeforces.Div2.A;
import java.util.*;
import java.io.*;


public class Problem61A {
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws Exception{
        String s1=bf.readLine();
        String s2=bf.readLine();
        StringBuilder sb=new StringBuilder("");

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i))
                sb.append('0');
            else
                sb.append('1');
        }

        System.out.println(sb.toString());
    }

}
