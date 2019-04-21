package Codeforces.Codeforces.Div2.A;
import java.util.*;
import java.io.*;

public class Problem71A {
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws Exception{
        int t=Integer.parseInt(bf.readLine());
        while(t-->0){
            String s=bf.readLine();
           // System.out.println(s);
            if(s.length()>10){
                System.out.println(s.charAt(0)+""+s.substring(1,s.length()-1).length()+""+s.charAt(s.length()-1));
            }
            else
                System.out.println(s);
        }
    }


}
