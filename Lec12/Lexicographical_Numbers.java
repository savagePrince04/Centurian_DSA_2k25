package Lec12;

import java.util.ArrayList;

public class Lexicographical_Numbers {
    public static void main(String[] args) {
        int n=1000;
        ArrayList<Integer> ll=new ArrayList<>();
        for(int i=1;i<=9;i++){
            Lexicographical(n,i,ll);
        }
        System.out.println(ll);
    }
    public static void Lexicographical(int n,int cur,ArrayList<Integer> ll){
        if(cur>n){
            return;
        }
        ll.add(cur);
        int i=0;
        if(cur==0){
            i=1;
        }
        for(;i<=9;i++){
            Lexicographical(n,cur*10+i,ll);
        }
    }
}
