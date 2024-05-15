package LEC1;

public class Greater_Among_3_Number {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if (a > b && a > c) {
            System.out.println(a + "is greater");
        } else if (b > a && b > c) {
            System.out.println(b + "is greate");
        } else {
            System.out.println(c);
        }
    }
}
