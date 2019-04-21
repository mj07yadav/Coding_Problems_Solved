package HackerEarth.NinjaCart;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class SimilarityMeasurement
{
    static Set st[]; //array to store segment tree

    static int minVal(int x, int y) {
        return (x < y) ? x : y;
    }

    static int getMid(int s, int e) {
        return s + (e - s) / 2;
    }


   static  Set RMQUtil(int ss, int se, int qs, int qe, int index)
    {

        if (qs <= ss && qe >= se) {
         //   System.out.println(ss+"  "+se+"  "+"  "+qs+"  "+qe+" "+index+"  "+st[index]);
            return st[index];
        }

        if (se < qs || ss > qe)
            return new HashSet();

        int mid = getMid(ss, se);
        Set s=RMQUtil(ss, mid, qs, qe, 2 * index + 1);
        s.addAll(RMQUtil(mid + 1, se, qs, qe, 2 * index + 2));
        return s;
    }

    static Set RMQ(int n, int qs, int qe)
    {
        if (qs < 0 || qe > n - 1 || qs > qe) {
            System.out.println("Invalid Input");
            return new HashSet();
        }
       //// System.out.println(n+"  "+qs+"  "+qe);
        return RMQUtil(0, n - 1, qs, qe, 0);
    }

    static Set constructSTUtil(int arr[], int ss, int se, int si)
    {
        if (ss == se) {
            st[si]=new HashSet();
            st[si].add(arr[ss]);
          //  System.out.println(st[si]+" "+si+" "+ss );
            return st[si];

        }

        int mid = getMid(ss, se);
        Set s1=(constructSTUtil(arr, ss, mid, si * 2 + 1));
        Set s2=(constructSTUtil(arr, mid + 1, se, si * 2 + 2));

        st[si]=new HashSet();
        st[si].addAll(s2);
        st[si].addAll(s1);
        return st[si];
    }

    static void constructST(int arr[], int n)
    {

        int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));

        int max_size = 2 * (int) Math.pow(2, x) - 1;
        st = new Set[max_size]; // allocate memory

        constructSTUtil(arr, 0, n - 1, 0);
    }

    static void updateValueUtil(int ss, int se, int i, int diff, int si)
    {
        if (i < ss || i > se)
            return;

        st[si].clear();
        st[si].add(diff);

        if (se != ss) {
            int mid = getMid(ss, se);
            updateValueUtil(ss, mid, i, diff, 2 * si + 1);
            updateValueUtil(mid + 1, se, i, diff, 2 * si + 2);
        }
    }

    static void updateValue(int arr[], int n, int i, int new_val)
    {
        if (i < 0 || i > n - 1) {
            System.out.println("Invalid Input");
            return;
        }

        int val=new_val;

        updateValueUtil(0, n - 1, i, val, 0);
    }


    public static void main(String args[])throws Exception
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int arr[] = new int[n];
        StringTokenizer stk=new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(stk.nextToken());
        }

        constructST(arr, n);
        int q=Integer.parseInt(bf.readLine());
        while(q-->0){
            int count=0;
        StringTokenizer stk1=new StringTokenizer(bf.readLine());
        int rep=Integer.parseInt(stk1.nextToken());
        if(rep==1){
            //update query
            int index=Integer.parseInt(stk1.nextToken());
            int val=Integer.parseInt(stk1.nextToken());
            updateValue(arr, n, index-1, val);

        }else{
        //fetch query
            int pos=Integer.parseInt(stk1.nextToken())-1;


            for(int i=0;i<=pos;i++){
               Set s=RMQ(n,i,pos);

               if(s.size()==1) {
                   System.out.println(i + 1);
                   break;
               }
            }
        }
        }

    }
}