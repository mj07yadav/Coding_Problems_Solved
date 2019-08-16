import java.util.*;
import java.io.*;

public class Problem405A{

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

        solve(arr,N);        

        for(int i=0;i<N ;i++){
            sb.append(arr[i]+" ");
        }
        out.println(sb.toString());
        out.close();
    }

    public static void solve(int[] arr, int N){
        boolean flag=true;
        while(flag){
            boolean unsaturated=false;
            for(int i=1;i<N;i++){

                if(arr[i]<=arr[i-1] && arr[i-1]>1){
                    unsaturated=true;
                    int temp=arr[i]+arr[i-1];
                    if(temp%2==0){
                        arr[i-1]=(temp/2) -1;
                        arr[i]=(temp/2) + 1;   
                    }else{
                        arr[i-1]=(temp/2);
                        arr[i]=(temp/2)+1;
                    }
                }



            }
            for(int i=0;i<N ;i++){
                System.out.print(arr[i]+" t ");
            }
            System.out.println("");
            if(unsaturated==false){
                flag=false;
                break;
            }

        }

    }
}
