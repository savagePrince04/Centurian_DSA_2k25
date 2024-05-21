package Anubhav_Lec4;
import java.util.*;
public class Max_element {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
