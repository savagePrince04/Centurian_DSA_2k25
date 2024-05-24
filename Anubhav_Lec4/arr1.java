package Anubhav_Lec4;

import java.util.Scanner;

public class arr1 {
    public static void main(String args[]){
        int arr[]=new int[10];
        //System.out.println(arr[0]);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int b[]=new int[15];
        b=arr;
        System.out.println();
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        b[0]=-10;
        System.out.println(arr[0]);

    }
}
