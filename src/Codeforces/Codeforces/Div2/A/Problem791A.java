import java.util.*;
import java.io.*;

public class Problem791A{

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String args[]) throws Exception {
        StringTokenizer stk = new StringTokenizer(bf.readLine());
        int a=Integer.parseInt(stk.nextToken());
        int b=Integer.parseInt(stk.nextToken());

        double value= (double)a/(double)b;
        int countyear=1;
        double calculatedvalue=(double)2/3;
        double temp= calculatedvalue;    
        while(temp>=value){
            countyear++;
            temp*=calculatedvalue;
        }
        out.println(countyear);
        out.close();    
    }


}
