import java.util.*;
import java.io.*;

public class Problem469A{

    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String args[]) throws Exception {
        int N= Integer.parseInt(bf.readLine());
        HashSet<Integer> set=new HashSet<>();
        StringTokenizer stk=new StringTokenizer(bf.readLine());
        int first=Integer.parseInt(stk.nextToken());
        for(int i=0;i<first;i++){

            int temp=Integer.parseInt(stk.nextToken());
            if(!set.contains(temp) && temp!=0) 
                set.add(temp);

        }
        stk=new StringTokenizer(bf.readLine());
        first=Integer.parseInt(stk.nextToken());
        for(int i=0;i<first;i++){

            int temp=Integer.parseInt(stk.nextToken());
            if(!set.contains(temp) && temp!=0) 
                set.add(temp);

        }

        if(set.size()!=N){
            out.println("Oh, my keyboard!");
        }else
            out.println("I become the guy.");

        out.close();
    }

}
