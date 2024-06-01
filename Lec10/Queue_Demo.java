package Lec10;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Demo {
    public static void main(String[] args) {
        Queue<Integer> sc=new LinkedList<>();
        System.out.println(sc.isEmpty());
        sc.offer(10);
        sc.add(20);
        sc.add(30);
        sc.add(40);
        sc.add(50);
        System.out.println(sc);
        System.out.println(sc.remove());
       // sc.poll();
       // sc.poll();
        System.out.println(sc.poll());
        System.out.println(sc);
        System.out.println(sc.peek());
        System.out.println(sc.contains(100));
    }
}
