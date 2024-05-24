package Pattern;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<=i-2*c;j++){
                System.out.print("* ");
            }
            if(i>=n-1){
                c++;
            }
            System.out.println();
        }
    }
}
