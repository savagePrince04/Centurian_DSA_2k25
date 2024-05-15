package LEC1;
public class Post_inc {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++);
        a++;// a=a+1
        System.out.println(a);
        int b=a++ + a++;// post Increment
        System.out.println(b);
        int c=20;
        System.out.println(c--);
        System.out.println(c);
        int d=c--; // c=c-1
        System.out.println(d);
    }
}
