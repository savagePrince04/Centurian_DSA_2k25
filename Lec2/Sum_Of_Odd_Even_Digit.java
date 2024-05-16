package Lec2;
public class Sum_Of_Odd_Even_Digit {
    public static void main(String[] args) {
        int n=123478;
        int even_sum=0;
        int odd_sum=0;
        while (n>0){
            int rem=n%10;
            if(rem%2==0){
                even_sum=even_sum+rem;
            }
            else {
                odd_sum=odd_sum+rem;
            }
            n=n/10;
        }
        System.out.println("even sum "+even_sum);
        System.out.println("odd sum "+odd_sum);
    }
}
