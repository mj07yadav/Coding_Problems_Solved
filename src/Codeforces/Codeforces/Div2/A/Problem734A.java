import java.util.*;
import java.io.*;

public class Problem734A{

    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String args[]) throws Exception {
        int N = Integer.parseInt(bf.readLine());
        String ss = bf.readLine();
        int antoncount=0;
        int danikcount=0;

        for(int i=0;i<ss.length();i++){
            if(ss.charAt(i)=='A')
                antoncount++;
            else
                danikcount++;

        }
        if(antoncount>danikcount)
            out.println("Anton");
        else if(antoncount < danikcount)
            out.println("Danik");
        else
            out.println("Friendship");

        out.close();

    }

}
