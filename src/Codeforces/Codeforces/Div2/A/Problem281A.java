package Codeforces.Codeforces.Div2.A;
import java.io.*;

public class Problem281A {

    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws Exception{
        StringBuilder st=new StringBuilder(bf.readLine());
        int c=st.charAt(0);
        if(c>=97){
            c-=32;
        }
        st.setCharAt(0,(char)c);
        System.out.println(st);
    }
}