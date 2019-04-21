package Codeforces.Codeforces.Div2.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class YoungPhysicist {
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws Exception{
        int n=Integer.parseInt(bf.readLine());

        int x=0;
        int y=0;
        int z=0;


        for(int i=0;i<n;i++){
            StringTokenizer str=new StringTokenizer(bf.readLine());
            x+=Integer.parseInt(str.nextToken());
            y+=Integer.parseInt(str.nextToken());
            z+=Integer.parseInt(str.nextToken());
        }

        if(x==0 && y==0 && z==0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
