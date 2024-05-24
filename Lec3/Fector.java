package Lec3;

public class Fector {
    public static void main(String[] args) {
        int n=20;
        int cout=0;
        for(int i=1;i<=n;i++){
            if(n % i==0){
//                System.out.println(i);
                cout++;
            }
        }
       if(cout==2){
           System.out.println("prime");
       }
       else {
           System.out.println("not prime");
       }
    }
}
