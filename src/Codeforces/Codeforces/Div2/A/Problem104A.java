package Codeforces.Codeforces.Div2.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Problem104A{

	static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out=new PrintWriter(System.out);
	static StringBuilder sb=new StringBuilder("");
	public static void main(String args[])throws Exception{
		int n =Integer.parseInt(bf.readLine());
		if(n>21){
			System.out.println(0);
		}else if(n==21){
			System.out.println(4);
		}else if(n==20){
			System.out.println(15);
		}else if(n>10 && n<20){
			System.out.println(4);
		}else if(n<=10){
			System.out.println(0);
		}
	}
}