import java.util.*;
import java.io.*;

public class Problem405Aactual{

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static StringBuilder sb = new StringBuilder("");
    public static void main(String args[]) throws Exception {
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer stk = new StringTokenizer(bf.readLine());
        int[] arr = new int[N];
        for(int i=0 ; i<N ;i++){
            arr[i]=Integer.parseInt(stk.nextToken());

        }

        Arrays.sort(arr);

        for(int i=0;i<N ;i++){
            sb.append(arr[i]+" ");
        }
        
        out.println(sb.toString());
        out.close();
    }
}

 
