package Lec2;
public class Sum_Of_Digit {
    public static void main(String[] args) {
        int n=12378;
        int sum=0;
        while (n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}
