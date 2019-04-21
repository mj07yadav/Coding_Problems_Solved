package Codeforces.Codeforces.Div2.A;
import java.util.*;
import java.io.*;


public class Problem275A {
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    static int[][] arr=new int[3][3];
    static int[][] arr1=new int[3][3];
    public static void main(String args[])throws Exception{
        StringTokenizer stk;

        for(int i=0;i<3;i++){
            stk=new StringTokenizer(bf.readLine());
            for(int j=0;j<3;j++){
                arr[i][j]=Integer.parseInt(stk.nextToken());
                arr1[i][j]=1;
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                changeWorld(i,j);
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }

    }

    public static void changeWorld(int i,int j){
        if(arr[i][j]%2!=0){

            if(arr1[i][j]==1)
                arr1[i][j]=0;
            else
                arr1[i][j]=1;


            if ((i-1) >= 0) {
                if(arr1[i-1][j]==1)
                arr1[i-1][j]=0;
                else
                    arr1[i-1][j]=1;
            }
            if ((i + 1) <= 2) {
                if(arr1[i+1][j]==1)
                    arr1[i + 1][j]=0;
                else
                    arr1[i + 1][j]=1;

            }
            if ((j + 1) <= 2) {
                if(arr1[i][j+1]==1)
                    arr1[i][j+1]=0;
                else
                    arr1[i][j+1]=1;

            }
            if ((j - 1) >= 0) {
                if(arr1[i][j-1]==1)
                    arr1[i][j-1]=0;
                else
                    arr1[i][j-1]=1;
            }

        }
    }
}
