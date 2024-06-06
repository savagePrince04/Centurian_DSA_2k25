package Lec11;

public class Subsequence {
    static int count=0;
    public static void main(String[] args) {
        String ques="abc";
        Sub(ques,"");
        System.out.println(count);
    }
    public static void Sub(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            count++;
            return;
        }
        char ch=ques.charAt(0);
        Sub(ques.substring(1),ans);
        Sub(ques.substring(1),ans+ch);
    }
}
