import java.util.*;
import java.io.*;

public class Problem381A{

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String args[]) throws Exception{
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer stk = new StringTokenizer(bf.readLine());
        List values = new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            int temp = Integer.parseInt(stk.nextToken());
            values.add(temp);

        }

        solver(values);
        out.close();
    }

    public static void solver(List qu){
        int serejascore=0;
        int dimascore=0;
        int turn=0;
        while(qu.size()>0){
            if(turn%2==0){
                if((int)qu.get(0)>(int)qu.get(qu.size()-1)){
                    serejascore+=(int)qu.get(0);
                    qu.remove(0);
                }else{
                    serejascore+=(int)qu.get(qu.size()-1);
                    qu.remove(qu.size()-1);
                }
            }
            if(turn%2!=0){
                if((int)qu.get(0)>(int)qu.get(qu.size()-1)){
                    dimascore+=(int)qu.get(0);
                    qu.remove(0);
                }else{
                    dimascore+=(int)qu.get(qu.size()-1);
                    qu.remove(qu.size()-1);
                }
            }   
            turn++;       
        }

        out.println(serejascore+" "+dimascore);
    }

}
