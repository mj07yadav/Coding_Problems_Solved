package Codeforces.Codeforces.Div2.A;
import java.util.*;
import java.io.*;


public class Problem148A {
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String rgsp[])throws Exception{
        int k=Integer.parseInt(bf.readLine());
        int l=Integer.parseInt(bf.readLine());
        int m=Integer.parseInt(bf.readLine());
        int n=Integer.parseInt(bf.readLine());
        int d=Integer.parseInt(bf.readLine());
        int[] arr=new int[d+1];

        int count=0;

        for(int i=0;i<=d;i+=k){
            if(arr[i]!=1 && i!=0){
                arr[i]=1;
                count++;
            }
        }

        for(int i=0;i<=d;i+=l){
            if(arr[i]!=1 && i!=0){
                arr[i]=1;
                count++;
            }
        }
        for(int i=0;i<=d;i+=m){
            if(arr[i]!=1 && i!=0){
                arr[i]=1;
                count++;
            }

        }
        for(int i=0;i<=d;i+=n){
            if(arr[i]!=1 && i!=0){
                arr[i]=1;
                count++;
            }

        }

        System.out.println(count);

    }

}
