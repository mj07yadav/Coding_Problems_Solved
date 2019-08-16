import java.util.*;
import java.io.*;

public class Problem427A{

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String args[]) throws Exception{
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer stk = new StringTokenizer(bf.readLine());
        int[] arr = new int[N];
        boolean check = true;
        int count=0;
        int temp=0;
        for(int i=0 ; i<N ;i++){
            arr[i]=Integer.parseInt(stk.nextToken()); 
            if(temp>0 && arr[i]<0){
                temp--;
            }else{
                if(arr[i]>0)
                    temp+=arr[i];
                else
                    count++;
            }

        }
        out.println(count);
        out.close();

    }



}
