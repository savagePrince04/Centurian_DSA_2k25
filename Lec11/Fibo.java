package Lec11;

public class Fibo {
    public static void main(String[] args) {
        int n=6;
        System.out.println(fibo(n));
//        for(int i=0;;i++){
//            if(fibo(i)>=100)
//                return;
//            System.out.print(fibo(i)+" ");
//        }
    }
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int f1=fibo(n-1);
        int f2=fibo(n-2);
        return f1+f2;
    }
}
