package Lec11;

public class Fact {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n==0 || n==1){
            return n;
        }
        int fn=fact(n-1);
        return fn*n;
    }
}
