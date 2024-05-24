package Lec3;
public class Hcf {
    public static void main(String[] args) {
        int divisor=25;
        int dividend=60;
        while (dividend % divisor !=0){
            int rem=dividend % divisor;
            dividend=divisor;
            divisor=rem;
        }
        int LCM=(dividend*divisor)/divisor;
        System.out.println(LCM);
        System.out.println(divisor);
    }
}
