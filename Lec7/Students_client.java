package Lec7;
public class Students_client {
    public static void main(String[] args) throws Exception{
        Students sc = new Students("Rahul", 23);
        sc.setAge(-20);
        System.out.println(sc.getAge());
    }
}
