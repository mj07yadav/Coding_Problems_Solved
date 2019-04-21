package Testingpackage;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TestPriorityQueue {

    public static void main(String args[]){

        PriorityQueue pp=new PriorityQueue();
        pp.add(10);
        pp.add(10);
        pp.add(12);
        pp.add(13);
        pp.add(15);

        System.out.println(pp+"  "+pp.poll());

        PriorityQueue pp1=new PriorityQueue(new Temp());
        pp1.add(10);
        pp1.add(10);
        pp1.add(12);
        pp1.add(13);
        pp1 .add(15);
        System.out.println(pp1+" "+pp1.poll());

    }
}

class Temp implements Comparator {


    @Override
    public int compare(Object obj1,Object ob2){
        Integer i=(int)obj1;
        Integer j=(int)ob2;

        return j.compareTo(i);
    }
}
