package Lec11;

public class Coin_Toss {
    public static void main(String[] args) {
        int n=3;
        Coin(n,"");
    }
    public static void Coin(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        Coin(n-1,ans+"H");
        Coin(n-1,ans+"T");
    }
}
