package Codeforces.Codeforces.Div2.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem32B {
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws Exception{
        String ss=bf.readLine();
        for(int i=0;i<ss.length();i++){
            if(ss.charAt(i)=='.'){
                System.out.print('0');
            }
            if(ss.charAt(i)=='-' && i!=ss.length()-1){
                    if(ss.charAt(i+1)=='.') {
                        System.out.print('1');
                        i++;
                        }
                    else{
                        System.out.print('2');
                        i++;
                    }
            }

        }


    }

}
