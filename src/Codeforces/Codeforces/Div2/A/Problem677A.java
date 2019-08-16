import java.util.*;
import java.io.*;

public class Problem677A{

    static BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String args[]) throws Exception {
        StringTokenizer stk = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int H = Integer.parseInt(stk.nextToken());
        stk=new StringTokenizer(bf.readLine());
        int count=0; 
        for(int i=0;i<N;i++){
            int temp=Integer.parseInt(stk.nextToken());
            if(temp>H){
                count++; 
            }
            
        }
        
        out.println(count*2 + (N-count));
        out.close();
    }



}
