package Lec6.Abstraction;

import Lec6.Abstraction.Abstraction_Demo;

public class Abstraction_Implement extends Abstraction_Demo {

    @Override
    public void Payment() {
        System.out.println("we can pay via upi");
    }

    @Override
    public void View_Order() {
        System.out.println("we can check own order");
    }
    Abstraction_Implement(){
        System.out.println("i M inside impleamentations");
    }
}
