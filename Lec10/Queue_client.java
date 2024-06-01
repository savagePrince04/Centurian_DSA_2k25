package Lec10;

import Lec10.Queue;

public class Queue_client {
    public static void main(String[] args) {
        Queue sc=new Queue();
        sc.EnQueue(10);
        sc.EnQueue(20);
        sc.EnQueue(30);
        sc.EnQueue(40);
        sc.EnQueue(50);
        sc.EnQueue(60);
        sc.DeQueue();
        sc.DeQueue();
        System.out.println(sc.size);
        sc.EnQueue(70);
        sc.EnQueue(80);
        System.out.println(sc.Isfull());
        sc.Display();
        System.out.println(sc.GetFront());
    }
}
