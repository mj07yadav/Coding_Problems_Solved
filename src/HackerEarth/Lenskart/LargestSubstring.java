package HackerEarth.Lenskart;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LargestSubstring {
    static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer stk;
    public static void main(String args[])throws Exception{
        int t =Integer.parseInt(bf.readLine());
        String s=bf.readLine();
        int arr[]=new int[s.length()+1];
        for(int i=0;i<s.length();i++){
            arr[i+1]=arr[i]+Integer.parseInt(s.charAt(i)+"");
        }

        int max=Integer.MIN_VALUE;
        for(int i=1;i<=s.length();i++){
            for(int j=i+1;j<=s.length();j++){

                if((j-i+1)%2==0) {

                    if ((arr[j] - arr[i-1]) < (j - i + 1) / 2) {
                        if (max < (j - i + 1))
                            max = (j - i + 1);
                    }
                  //  System.out.println((arr[j]-arr[i-1])+"  "+(j-i+1)/2+"  "+max+"  "+i+" s "+j);
                }else{

                    if ((arr[j] - arr[i-1]) < ((j - i + 1) / 2)+1) {
                        if (max < (j - i + 1))
                            max = (j - i + 1);
                    }
                   // System.out.println((arr[j]-arr[i-1])+"  "+(((j-i+1)/2)+1)+"  "+max+"  "+i+" d "+j);
                }
            }

        }
        System.out.println(max);

    }


}
