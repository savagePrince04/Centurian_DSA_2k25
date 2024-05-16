package Lec2;
public class Count_No_Digit {
    public static void main(String[] args) {
        int n=1235;
        int count=0;
        while (n>0){
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
