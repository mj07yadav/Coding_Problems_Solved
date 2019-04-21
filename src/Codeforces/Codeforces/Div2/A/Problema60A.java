package Codeforces.Codeforces.Div2.A;
import java.util.*;
import java.io.*;


public class Problema60A {

    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws Exception{
        int n=Integer.parseInt(bf.readLine());
        int arr[]=new int[n];

        StringTokenizer stk=new StringTokenizer(bf.readLine());
        int total =0;
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(stk.nextToken());
            total+=arr[i];
        }

        int value=total/2;

        Arrays.sort(arr);
        int temp=0;
        int numberofcoins=0;
        for(int i=arr.length-1;i>=0;i--){
            numberofcoins++;
            temp+=arr[i];
            if(temp>value)
                break;
        }

    System.out.println(numberofcoins);
    }

}
