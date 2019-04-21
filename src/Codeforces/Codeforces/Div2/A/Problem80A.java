package Codeforces.Codeforces.Div2.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Problem80A  {

    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    static int arr[] ={ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
    public static void main(String args[])throws Exception{
        StringTokenizer stk=new StringTokenizer(bf.readLine());
        int n=Integer.parseInt(stk.nextToken());
        int m =Integer.parseInt(stk.nextToken());
        int index1=Arrays.binarySearch(arr,n);
        int index2=Arrays.binarySearch(arr,m);

        if((index2-index1)==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}
