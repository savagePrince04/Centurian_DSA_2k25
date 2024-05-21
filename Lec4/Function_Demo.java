package Lec4;
public class Function_Demo {
    public static void main(String[] args) {
        int a=10;
        int b=20;
       // int ans=Add(a,b);
        System.out.println(Add(a,b));
    }
    public static int Add(int d,int e){
        int c=d+e;
        return c+sub();
    }
    public static int sub(){
        int a=20;
        int b=20;
        int c=b-a;
        return c;
    }
}
