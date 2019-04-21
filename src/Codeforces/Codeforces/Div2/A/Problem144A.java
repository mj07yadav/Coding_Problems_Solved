package Codeforces.Codeforces.Div2.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem144A{
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws Exception{
        int n=Integer.parseInt(bf.readLine());
        int arr[]=new int[n];

        StringTokenizer stk=new StringTokenizer(bf.readLine());
        int max=Integer.MIN_VALUE;
        int maxindex=-1;
        int min=Integer.MAX_VALUE;
        int minindex=-1;

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(stk.nextToken());
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
            if(arr[i]<=min){
                min=arr[i];
                minindex=i;
            }
        }

        int total =0;
        if(minindex<maxindex){
            total+=maxindex+(n-1-minindex-1);
            System.out.println(total);
        }else{
            total+=maxindex+(n-1-minindex);
        System.out.println(total);

        }
     //   System.out.println(max+"  "+maxindex+"  "+min+"  "+minindex);
    }

}
