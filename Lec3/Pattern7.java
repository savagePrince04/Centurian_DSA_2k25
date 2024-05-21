package Lec3;
public class Pattern7 {
    public static void main(String[] args) {
        int n=10;
        int x=2*n-2;
        for(int row=1;row<n;row++){
            int col=n;
            for(int star=1;star<=row;star++){
                System.out.print(col+" ");
                col--;
            }
            for(int space=1;space<=x;space++){
                System.out.print("  ");
            }
           x=x-2;
            col=n+1-row;
            for(int star=1;star<=row;star++){
                System.out.print(col+" ");
                col++;
            }
            System.out.println();
        }
        x=0;
        for(int row=1;row<=n;row++){
            int col=n;
            for(int star=1;star<=n+1-row;star++){
                System.out.print(col+" ");
                col--;
            }
            for(int space=1;space<=x;space++){
                System.out.print("  ");
            }
           col=row;
            x=x+2;
            for(int star=1;star<=n+1-row;star++){
                System.out.print(col+" ");
                col++;
            }
            System.out.println();
        }
    }
}
