package Lec6.Compile_Time_Polymorphism;

public class Function_Overloading {
    public void Add(){
        int a=10;
        int b=20;
        System.out.println(a+b);
    }
    public void Add(int a,int b){
        System.out.println(a+b);
    }
    public void Aad(int a,int ... c){
        int sum=0;
        for(int i=0;i<c.length;i++){
            sum=sum+c[i];
        }
        System.out.println(sum+a);
    }

}
