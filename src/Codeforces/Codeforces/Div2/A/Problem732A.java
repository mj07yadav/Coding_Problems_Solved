import java.util.*;
import java.io.*;

public class Problem732A{

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static StringBuilder sb = new StringBuilder("");
    public static void main(String args[]) throws Exception {
        StringTokenizer stk = new StringTokenizer(bf.readLine());
        int K = Integer.parseInt(stk.nextToken());
        int r = Integer.parseInt(stk.nextToken());
        solver(K,r); 
        out.close();
    }

    public static void solver(int k , int r){
        int lastdigit = k%10;
        int minshovelswoc=Integer.MAX_VALUE;
        int minshovelwc=Integer.MAX_VALUE;
        for(int i=1;i<11;i++){
            int templastdigit=(lastdigit*i)%10;
            //out.println(templastdigit+"  "+lastdigit+"  "+minshovelswoc+"  "+minshovelwc+"  "+r);
            if(templastdigit==0){
                minshovelswoc=i;
                break;
            }
            if(templastdigit==r){
                //  out.println("here");
                minshovelwc=i;
                break;
            }
        }        
        out.println(Math.min(minshovelwc,minshovelswoc));
    }

    // public static int getLeastSigDigit(int k){


    // }

}
