package Codeforces.Codeforces.Div2.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem112A {

    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws Exception{

        String a1=bf.readLine();
        String a2=bf.readLine();

            String ctemp=a1.toLowerCase();
            String ctemp2=a2.toLowerCase();

            if(ctemp.compareTo(ctemp2)<0)
            System.out.println(-1);
            else if(ctemp.compareTo(ctemp2)>0)
                 System.out.println(1);
            else
                System.out.println(0);


    }



}
