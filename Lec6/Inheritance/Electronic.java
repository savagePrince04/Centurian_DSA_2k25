package Lec6.Inheritance;

public class Electronic extends Object {
    public void ON_off() {
        System.out.println("we can do on/off");
    }
}
class Nokia_Phone extends Electronic{
    public void call(){
        System.out.println("we can do call");
    }
}
class Smart_Phone extends Nokia_Phone{
    public void Tke_Photo(){
        System.out.println("we can take photo");
    }
}
class easy{
    public static void main(String[] args) {
        Smart_Phone sc=new Smart_Phone();
        sc.Tke_Photo();
        sc.call();
        sc.ON_off();
    }
}
