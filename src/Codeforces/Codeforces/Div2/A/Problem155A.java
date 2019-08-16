package Codeforces.Codeforces.Div2.A;
import java.util.*;
import java.io.*;

public class Problem155A {

	static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out=new PrintWriter(System.out);
	public static void main(String args[])throws Exception{
		int N=Integer.parseInt(bf.readLine());
		int count=0;
		int min=0;
		int max=0;
		StringTokenizer stk=new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			if(i==0) {
				min = Integer.parseInt(stk.nextToken());
				max = min;
			}else {
				int temp=Integer.parseInt(stk.nextToken());
				if(temp>max) {
					count++;
					max=temp;
				}
				if(min>temp) {
					count++;
					min=temp;
				}
			}
		}
		System.out.println(count);
	}
}
