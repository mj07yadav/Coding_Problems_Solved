import java.util.*;
import java.io.*;

public class Problem266A{

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String args[]) throws Exception {
        int N=Integer.parseInt(bf.readLine());
        String sequence = bf.readLine();
        int count =0;
        for(int i=0;i<sequence.length()-1;i++){
            if(sequence.charAt(i)==sequence.charAt(i+1)){
                count++;
            }
        }

        out.println(count);
        out.close();

    }



}
