package Lec7;

import java.util.Stack;
public class Stack_Demo {
    public static void main(String[] args) {
        Stack<Integer> sc=new Stack<>();
        sc.push(10);
        sc.push(20);
        sc.push(30);
        sc.push(40);
        sc.push(50);
        System.out.println(sc);
        System.out.println(sc.size());
        System.out.println(sc.pop());
        System.out.println(sc.size());
        System.out.println(sc.peek());
        System.out.println(sc.isEmpty());
//        sc.add(70);
        System.out.println(sc);

    }
}
