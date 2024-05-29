package Lec8;

import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {
    public static void main(String[] args) {
        String pattern = "IIIDIDDD";
        int n=pattern.length();
        int ans[]=new int[n+1];
        Stack <Integer>sc=new Stack<>();
        int count=1;
        for(int i=0;i<ans.length;i++){
            if(i==n || pattern.charAt(i)=='I'){
                ans[i]=count;
                count++;
                while (!sc.isEmpty()){
                    ans[sc.pop()]=count;
                    count++;
                }
            }
            else {
                sc.push(i);
            }
        }
        String s="";
        for(int i=0;i<ans.length;i++){
            s=s+ans[i];
        }
        System.out.println(s);
    }
}
