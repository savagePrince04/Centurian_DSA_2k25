package Lec5;

public class Reverse_Words_n_a_String {
    public static void main(String[] args) {
        String s="hello      word        hgfhgf";
        String str[]=s.split("\s+");
            for(String s1:str){
                System.out.println(s1);
            }
    }
}
