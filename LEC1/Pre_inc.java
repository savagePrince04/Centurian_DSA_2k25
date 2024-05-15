package LEC1;

public class Pre_inc {
    public static void main(String[] args) {
        int a=6;
        int b=++a;
        System.out.println(b);
        System.out.println(++a);
       // int b=a++ + a-- + ++a - ++a + a;
        int c=a++ + a++ - ++a + ++a + --a;
       // System.out.println(b);
        System.out.println(c);
    }
}
