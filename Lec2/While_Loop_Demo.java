package Lec2;
public class While_Loop_Demo {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=10){
            sum=sum+i;//sum+=i;
            System.out.println(i);
            i++;
        }
        System.out.println("sum=" + sum);
    }
}
