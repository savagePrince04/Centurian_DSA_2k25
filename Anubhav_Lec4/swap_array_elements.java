package Anubhav_Lec4;

import java.util.Scanner;

public class swap_array_elements {
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length/2;i++){
//            int a,b,c;
//            a=arr[i];
//            b=arr[n-1-i];
//            // Machine
//            c=a;
//            a=b;
//            b=c;
//            // stop
//            arr[i]=a;
//            arr[n-1-i]=b;
            int c=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=c;

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
