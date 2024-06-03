package Lec11;

public class printInc {
    public static void main(String[] args) {
        int n=100;
        PI(n);
    }
    public static void PI(int n){
        if(n==0){
            return;
        }
        PI(n-1);
        System.out.println(n);
    }
}
