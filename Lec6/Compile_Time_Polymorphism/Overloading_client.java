package Lec6.Compile_Time_Polymorphism;

public class Overloading_client {
    public static void main(String[] args) {
        Function_Overloading sc=new Function_Overloading();
        sc.Add();
        sc.Add(10,20);
        sc.Aad(10,20,30,40,50,60,70);
            main();
    }
    // we can Overload mian method
    public static void main(){
        System.out.println("i am inside the main method we can overload main method");
    }
}
