package Codeforces.Codeforces.Div2.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem208A {
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws Exception{
        String s=bf.readLine();
        StringBuilder sb=new StringBuilder("");
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            if(i<s.length() && s.charAt(i)=='W' ){
                if( i+1<s.length() && s.charAt(i+1)=='U' ){
                    if(i+2<s.length() && s.charAt(i+2)=='B' ){
                        if(i!=0 && flag!=true )
                        sb.append(" ");
                        i=i+2;
                        flag=true;
                    }else{
                        flag=false;
                        sb.append(s.charAt(i));
                    }
                }else{
                    flag=false;
                    sb.append(s.charAt(i));
                }
            }else{
                flag=false;
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());

    }


}
