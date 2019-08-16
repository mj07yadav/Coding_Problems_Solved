import java.util.*;
import java.io.*;

public class Problem731A{

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String args[]) throws Exception{
        String name = bf.readLine();
        int current=((int)'a')%96;
        int totalrotation=0;
        for(int i=0;i<name.length();i++){
            int next=(int)(name.charAt(i))%96;
            if(next >= current){
                totalrotation+=Math.min(Math.abs(next-current),26-next+current);
                current=next;
            }else{
                totalrotation+=Math.min(Math.abs(next-current),26-current+next);
                current=next;
            }
        }
        out.println(totalrotation);
        out.close();
    }


}
