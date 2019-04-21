package HackerEarth.Lenskart;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class ChargedUpArray {
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer stk;
    static int count;
    static long arr[];
    static long mod=1000000007;
    public static void main(String args[])throws Exception{
        int t =Integer.parseInt(bf.readLine());
        while(t-->0) {
            count=0;
            int n = Integer.parseInt(bf.readLine());
            stk=new StringTokenizer(bf.readLine());
            arr=new long[n+1];
            arr[n]=-1;
            for(int i=0;i<n;i++){
                arr[i]=Long.parseLong(stk.nextToken());
            }
            findsubset(0,0,n);
            long total=0;
            for(int i=0;i<n;i++){
                if(arr[i]>=count){
                    total=(total+arr[i])%mod;
                }
            }
            System.out.println(total);
        }
    }

    public static void findsubset(int i,long val,int n){
    //    System.out.println(i+"  "+n+"  "+val);
        if(val==-1) {
            count++;
            return ;
        }

        for(int j=i+1;j<=n;j++){
            findsubset(j,arr[j],n);
        }


    }


}
