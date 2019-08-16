import java.util.*;
import java.io.*;

public class Problem59A{

    static BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static StringBuilder sb = new StringBuilder("");
    public static void main(String args[]) throws Exception {
        String word = bf.readLine();
        out.println(solver(word));
        out.close();
    }


    public static String solver(String word){
        int countcapital=0;
        for(int i=0;i<word.length();i++){
            if((int)word.charAt(i)<=90){
                countcapital++;
            }
        }

        if(countcapital>word.length()/2){
            return word.toUpperCase();
        }else if(countcapital==word.length()/2){
            return word.toLowerCase();
        }else{
            return word.toLowerCase();
        }
    }
}
