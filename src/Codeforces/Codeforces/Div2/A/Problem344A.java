import java.util.*;
import java.io.*;

public class Problem344A{

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String args[]) throws Exception {
        int N = Integer.parseInt(bf.readLine());
        String arr[] = new String[N+1];
        arr[0]= bf.readLine();
        arr[N]= "88";
        int groups=0;
        for(int i=1 ;i<=N ;i++){
            if(i<N)
                arr[i]=bf.readLine();
            if(!arr[i].equals(arr[i-1])){
                groups++;
                //System.out.println(groups+" "+ );
            }
        }
        out.println(groups);
        out.close();
    }


}
