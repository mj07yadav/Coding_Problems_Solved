package Codeforces.Codeforces.Div2.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Problem122A {
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    static final int[] arr={4,7,44,77,47,74,444,447,474,744,477,747,774,777};
    public static void main(String args[])throws Exception{
        int t=Integer.parseInt(bf.readLine());
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(t%arr[i]==0) {
                flag=true;
                break;
            }
            }

            if(flag==true)
            System.out.println("YES");
            else
                System.out.println("NO");

    }
}
