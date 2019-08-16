import java.util.*;
import java.io.*;

public class Problem479A{

    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static StringBuilder sb = new StringBuilder("");

    public static void main(String args[]) throws Exception {
        
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        if(a==1 || b==1 || c==1){
            int temp1=(a+(b*c));
            int temp4=(a*(b+c));
            int temp5=((a+b)*c);
            int temp6=((a*b)+c);
            int temp7=((a+b)+c);
            
            sb.append(""+Math.max(temp7,Math.max(temp6,Math.max(temp5,Math.max(temp1,temp4)))));
        }else{
            sb.append(""+(a*b*c));
        }
        
        out.println(sb.toString());
        out.close();
    }

}
