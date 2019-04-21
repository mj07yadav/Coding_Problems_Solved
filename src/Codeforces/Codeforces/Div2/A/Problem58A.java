package Codeforces.Codeforces.Div2.A;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem58A {
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[])throws Exception{
       String ss=bf.readLine();
        boolean flag=false;
       if(ss.contains("h")){
            int tt=ss.indexOf('h');
                if(ss.indexOf('e',tt+1)>0){
                int ee=ss.indexOf('e',tt+1);
                    if(ee>tt){
                        if(ss.indexOf('l',ee+1)>0){
                            int ll1=ss.indexOf('l',ee+1);
                            if(ll1>ee){
                                if(ss.indexOf('l',ll1+1)>0){
                                    int ll2=ss.indexOf('l',ll1+1);
                                        if(ll2>ll1){
                                            if(ss.indexOf('o',ll2+1)>0){
                                                int oo=ss.indexOf('o',ll2+1);
                                                if(oo>ll2)
                                                    flag=true;
                                            }
                                        }
                                }
                            }
                        }
                    }
                }
       }

       if(flag==true)
           System.out.println("YES");
        else
            System.out.println("NO");
    }
}
