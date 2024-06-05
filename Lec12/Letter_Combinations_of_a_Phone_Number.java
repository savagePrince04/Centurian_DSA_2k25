package Lec12;

import java.util.ArrayList;

public class Letter_Combinations_of_a_Phone_Number {
    static String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        ArrayList<String> ll=new ArrayList<>();
        String str="";
        Combination(str,"",ll);
        System.out.println(ll);
    }
    public static void Combination(String str,String ans,ArrayList<String> ll){
        if(str.length()==0){
            ll.add(ans);
          // System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        int num=ch-'0';
        String press=map[num];
        for(int i=0;i<press.length();i++){
            Combination(str.substring(1),ans+press.charAt(i),ll);
        }
    }
}
