package Lec12;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
    public static void main(String[] args) {
        int n=3;
       ArrayList<String> ll=new ArrayList<>();
        GenrateParenthesis(n,0,0,"",ll);
        System.out.println(ll);
    }
    public static void GenrateParenthesis(int n,int open,int close,String ans,ArrayList<String> ll){
        if(open==n && close==n){
      //      System.out.println(ans);
            ll.add(ans);
            return;
        }
//        if(open<n){
//            GenrateParenthesis(n,open+1,close,ans+"(");
//        }
//        if(close<open){
//            GenrateParenthesis(n,open,close+1,ans+")");
//        }
        if(open>n || close>open){
            return;
        }
        GenrateParenthesis(n,open+1,close,ans+"(",ll);
        GenrateParenthesis(n,open,close+1,ans+")",ll);
    }
}
