package Lec3;
public class Binary_to_Dec {
    public static void main(String[] args) {
        int a=11001;
        int mul=1;
        int sum=0;
        while(a>0){
          int rem=a % 10;
          sum=sum+rem*mul;
          mul=mul*2;
          a=a/10;
        }
        System.out.println(sum);
    }
}
