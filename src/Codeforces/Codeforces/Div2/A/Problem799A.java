import java.util.*;
import java.io.*;

public class Problem799A{
   
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String args[]) throws Exception {
        StringTokenizer stk = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int t = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());
        int d = Integer.parseInt(stk.nextToken());
        solver(n,t,k,d);
        out.close();
    }
    
    public static void solver(int n,int t, int k ,int d){
        double turns = Math.ceil((double)n/(double)k);
        double totaltimewithoneoven=turns*t;
        double turnsforovencreation = (double)d/(double)t;
        //out.println(turns + "   "+ totaltimewithoneoven + "  "+ turnsforovencreation ); 
        if(turns == 1){
            out.println("NO");

        }else if(turns == 2){
            if(turnsforovencreation >= 1){
                out.println("NO");
            }else{
                out.println("YES");
            }
        }else {
            if(turnsforovencreation < turns-1){
                out.println("YES");
            }else{

                out.println("NO");
            }
        }

    }

}
