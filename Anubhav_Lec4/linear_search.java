package Anubhav_Lec4;

import java.util.Scanner;

public class linear_search {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]==3){
                count++;
            }
        }
        if(count>0)
            System.out.println(count);
        else
            System.out.println(-1);
    }
}
