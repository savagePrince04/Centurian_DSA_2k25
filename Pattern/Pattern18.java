package Pattern;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int row=0;row<n;row++){
            // Spaces
            int count=0;
            for(int col=0;col<n/2-row+2*c;col++){
                System.out.print("* ");
                count++;
            }
            for(int col=0;col<2*row+1-(4*c);col++){
                System.out.print("  ");
                count++;
            }
            for(int col=count;col<n;col++){
                System.out.print("* ");
            }
            if(row>=(n/2)){
                c++;
            }
            System.out.println();
        }
    }
}
