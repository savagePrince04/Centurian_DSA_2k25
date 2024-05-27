package Lec6.RunTime_Polymorphism;

public class Overriding {
    public void Add(){
        int a=10;
        int b=20;
        System.out.println(a+b);
    }
}
// function with name and same parameter/signature is colled function Overriding
// we can not override main method due to static keyword

class C extends Overriding{
    @Override
    public void Add(){
        int a=10;
        int b=20;
        int c=30;
        System.out.println(a+b+c);
    }
}
class Easy{
    public static void main(String[] args) {
        C sc=new C();
        Overriding sc1=new Overriding();
        sc.Add();
        sc1.Add();
    }
}