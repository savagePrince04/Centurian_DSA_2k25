package Lec6.Abstraction;

public class Abstrac_client {
    public static void main(String[] args) {
        //Abstraction_Demo sc=new Abstraction_Demo();
        //sc.Payment();
        Abstraction_Implement sc=new Abstraction_Implement();
        sc.Payment();
        sc.View_Order();
        // after java 8
//        Abstraction_Demo sc=new Abstraction_Demo() {
//            @Override
//            public void Payment() {
//                System.out.println("we cam payment");
//            }
//
//            @Override
//            public void View_Order() {
//                System.out.println("check own order");
//            }
//        };
//        sc.Payment();
//        sc.View_Order();
    }
}
