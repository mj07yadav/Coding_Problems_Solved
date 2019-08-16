import java.util.*;
import java.io.*;

public class Problem318A{

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String args[]) throws Exception{
        StringTokenizer stk= new StringTokenizer(bf.readLine());
        long N = Long.parseLong(stk.nextToken());
        long K = Long.parseLong(stk.nextToken());

        if(N%2==0){
            long oddpart = N/2;
            long evenpart = N/2;

            if(K>oddpart){
                
                out.println(2+(K-1-oddpart)*2);
            }else{
                out.println(1+(K-1)*2);
            }     
        }else{
            long oddpart = (N/2)+1;
            long evenpart = N/2;

            if(K>oddpart){
                out.println(2+(K-1-oddpart)*2);
            }else{
                out.println(1+(K-1)*2);
            }     

        }
        out.close();
    }

}
