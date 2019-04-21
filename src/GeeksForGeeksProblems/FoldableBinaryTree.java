package GeeksForGeeksProblems;

import java.util.*;
import java.io.*;

class Node
{
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

class FoldableBinaryTree
{
    // Root of Binary Tree
    static Node root;
    static StringBuilder str1=new StringBuilder("");
    static StringBuilder str2=new StringBuilder("");

    FoldableBinaryTree()
    {
        root = null;
    }


    void printPreorderForLeft(Node node,char ch)
    {
        if (node == null)
            return;

        str1.append(ch);

        printPreorderForLeft(node.left,'L');


        printPreorderForLeft(node.right,'R');
    }

    void printPreorderForRight(Node node,char ch)
    {
        if (node == null)
            return;

        str2.append(ch);

        printPreorderForRight(node.right,'L');

        printPreorderForRight(node.left,'R');


    }

    public static void insert(Node root,int a,int a1,char lr)
    {
        if(root==null)
        {
            return;
        }
        if(root.key==a)
        {
            switch(lr)
            {
                case 'L':root.left=new Node(a1);
                    break;
                case 'R':root.right=new Node(a1);
                    break;
            }
            return;
        }
        insert(root.left,a,a1,lr);
        insert(root.right,a,a1,lr);
     }


    // Wrappers over above recursive functions
    void printPreorder1() {	 printPreorderForLeft(root.left,' '); }
    void printPreorder2() {	 printPreorderForRight(root.right,' '); }

    // Driver method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            FoldableBinaryTree tree = new FoldableBinaryTree();
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println(0);
                continue;
            }

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int a1 = sc.nextInt();
                char lr = sc.next().charAt(0);
                if (i == 0) {
                    root = new Node(a);
                    switch (lr) {
                        case 'L':
                            root.left = new Node(a1);
                            break;
                        case 'R':
                            root.right = new Node(a1);
                            break;
                    }
                } else {
                    insert(root, a, a1, lr);
                }
            }


        tree.printPreorder1();
        //  System.out.println("");
        tree.printPreorder2();
        // System.out.println(str1+"  "+str2);

        if (str1.toString().equals(str2.toString()))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    }
}
