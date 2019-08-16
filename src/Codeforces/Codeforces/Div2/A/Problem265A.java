import java.util.*;
import java.io.*;

public class Problem265A{
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String args[]) throws Exception{
        String stonesposition=bf.readLine();
        String movesseq = bf.readLine();
        int ans=0;
        int position=0;
        for(int i=0;i<movesseq.length();i++){
            char c=movesseq.charAt(i);
            if(c == stonesposition.charAt(position)){
                position++;
            }
        }
        out.println(position+1);
        out.close();
    }


}
