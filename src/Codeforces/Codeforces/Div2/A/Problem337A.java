package Codeforces.Codeforces.Div2.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Problem337A {

    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer stk;
    public static void main(String args[])throws Exception{
        stk=new StringTokenizer(bf.readLine());
        int n=Integer.parseInt(stk.nextToken());
        int m=Integer.parseInt(stk.nextToken());
         stk=new StringTokenizer(bf.readLine());
        int arr[]=new int[m];
         for(int i=0;i<m;i++){
            arr[i]=Integer.parseInt(stk.nextToken());

        }

         Arrays.sort(arr);
         int min=Integer.MAX_VALUE;
         int count=0;
         for(int i=n-1;i<m;i++){
             int temp=(arr[i]-arr[count]);
            if(min>temp){
                min=temp;
            }
            count++;
         }

         System.out.println(min);
    }

}
