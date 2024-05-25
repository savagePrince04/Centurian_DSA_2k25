package Lec5;

public class Trim_Demo {
    public static void main(String[] args) {
        String s=" hello       word";
        String str[]=s.split("\s+");
        for(String s1:str){
            System.out.println(s1);
        }
    }
}
