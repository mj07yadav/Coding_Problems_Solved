import java.util.*;
import java.io.*;

public class Problem443A {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static StringBuilder sb = new StringBuilder("");

    public static void main(String args[]) throws Exception {
        String pattern = bf.readLine();
        HashSet<Character> hs = new HashSet<Character>();       
        for(int i=0 ;i<pattern.length() ; i++){
            if(pattern.charAt(i) != '{' && pattern.charAt(i) != ',' && pattern.charAt(i) != ' ' && pattern.charAt(i) != '}'  ){
                hs.add(pattern.charAt(i));
            }
        }
        sb.append(hs.size());
        out.println(sb.toString());
        out.close();
    }

}
