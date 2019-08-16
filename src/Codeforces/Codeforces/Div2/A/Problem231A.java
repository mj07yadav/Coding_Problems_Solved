import java.util.*;
import java.io.*;

public class Problem231A{

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String args[]) throws Exception {
        int N = Integer.parseInt(bf.readLine());
        int count=0;
        for(int i=0; i<N ;i++){
            StringTokenizer stk = new StringTokenizer(bf.readLine());
            String a = stk.nextToken();
            String b = stk.nextToken();
            String c = stk.nextToken();
            int tempcount=0; 
            if(a.equals("1")){
                tempcount++;
            }
            if(b.equals("1"))
                tempcount++;

            if(c.equals("1"))
                tempcount++;

            if(tempcount>=2)
                count++;

        }
        out.println(count);
        out.close();
    }

}
