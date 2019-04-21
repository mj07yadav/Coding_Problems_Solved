package Codeforces.Codeforces.Div2.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem136A {
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws Exception{
        int n=Integer.parseInt(bf.readLine());
        int arr[]=new int[n+1];

        StringTokenizer stk=new StringTokenizer(bf.readLine());
        for(int i=1;i<=n;i++){
            arr[Integer.parseInt(stk.nextToken())]=i;
        }

        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
            }
    }
}
