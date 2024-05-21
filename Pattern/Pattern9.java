package Pattern;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            // Spaces
            for(int j=0;j<n-1-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("* ");
            }
            //for(int j=0;j<n)
            System.out.println();
        }

    }
}
