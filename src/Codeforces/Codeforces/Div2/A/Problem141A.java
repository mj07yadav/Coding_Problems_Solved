package Codeforces.Codeforces.Div2.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Problem141A {
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    static HashMap<Character,Integer> hm=new HashMap<>();
    static HashMap<Character,Integer> res=new HashMap<>();
    public static void main(String args[])throws Exception{
        String s1=bf.readLine();
        for(int i=0;i<s1.length();i++){
            if(hm.containsKey(s1.charAt(i))){
                int temp=hm.get(s1.charAt(i));
                hm.put(s1.charAt(i),temp+1);
            }else{
                hm.put(s1.charAt(i),1);
            }
        }

        String s2=bf.readLine();

        for(int i=0;i<s2.length();i++){
            if(hm.containsKey(s2.charAt(i))){
                int temp=hm.get(s2.charAt(i));
                hm.put(s2.charAt(i),temp+1);
            }else{
                hm.put(s2.charAt(i),1);
            }
        }


        String finals=bf.readLine();

        for(int i=0;i<finals.length();i++){
            if(res.containsKey(finals.charAt(i))){
                int temp=res.get(finals.charAt(i));
                res.put(finals.charAt(i),temp+1);
            }else{
                res.put(finals.charAt(i),1);
            }
        }

            boolean flag=false;
        for(Map.Entry<Character,Integer> en:hm.entrySet()){
                char cc=en.getKey();
                int tt=en.getValue();

                if(res.containsKey(cc)){
                    if(res.get(cc)<tt) {
                       System.out.println("NO");
                       flag=true;
                        break;
                    }
                }else{
                        flag=true;
                        System.out.println("NO");
                        break;
                }

        }

        if(flag!=true && res.size()==hm.size())
            System.out.println("YES");
        else if(flag!=true && res.size()!=hm.size()){
            System.out.println("NO");
        }


    }




}
