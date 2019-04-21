package Codeforces.Codeforces.Div2.A;
import java.util.*;
import java.io.*;


public class Problem233A {
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String argsp[]) throws Exception{
        int n=Integer.parseInt(bf.readLine());

        if(n%2!=0)
            System.out.println(-1);
        else{
            for(int i=1;i<=n;i++){
                if(i%2==0)
                    System.out.print(i-1+" ");
                if(i%2!=0)
                    System.out.print(i+1+" ");
            }

            }
    }
}