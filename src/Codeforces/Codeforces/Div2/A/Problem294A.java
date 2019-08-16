import java.util.*;
import java.io.*;

public class Problem294A{

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String args[]) throws Exception {
        int wires=Integer.parseInt(bf.readLine());
        int arr[]=new int[wires];
        StringTokenizer stk = new StringTokenizer(bf.readLine());

        for(int i=0 ;i< wires;i++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        int shoots = Integer.parseInt(bf.readLine());
        if(wires==1 && shoots>0){
            stk= new StringTokenizer(bf.readLine());
            arr[0]=0;
        }else{
            for(int i=0;i<shoots;i++){
                stk = new StringTokenizer(bf.readLine());
                int x = Integer.parseInt(stk.nextToken());
                int y = Integer.parseInt(stk.nextToken());
                if(x==1){
                    arr[x]+=arr[x-1]-y;
                    arr[x-1]=0;
                }else if(x==wires){
                    arr[x-2]+=y-1;
                    arr[x-1]=0;
                }else{
                    arr[x-2]+=y-1;
                    arr[x]+=arr[x-1]-y;
                    arr[x-1]=0;
                }
            }
        }
        for(int i=0;i<wires;i++)
            out.println(arr[i]);

        out.close();
    }

}
