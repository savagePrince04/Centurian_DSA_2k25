package Lec7;

public class Stack_client {
    public static void main(String[] args) throws Exception{
        Stack sc=new Stack();
        System.out.println(sc.Isempty());
        sc.push(10);
        sc.push(20);
        sc.push(30);
        sc.push(40);
        sc.push(50);
        sc.push(700);
        sc.push(50);
        sc.push(700);
        System.out.println(sc.pop());
       sc.Display();
        System.out.println(sc.peek());
        System.out.println(sc.pop());
        System.out.println(sc.size());
        System.out.println(sc.Isfull());
    }
}
