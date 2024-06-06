package Lec12;

public class Maze_Path {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        Printans(0,0,m-1,n-1,"");
    }
    public static void Printans(int cc,int cr,int ec,int er,String ans){
        if(cc==er && cr==er){
            System.out.println(ans);
        }
        if(cc>ec || cr>er){
            return;
        }
        Printans(cc+1,cr,ec,er,ans+"H");
        Printans(cc,cr+1,ec,er,ans+"V");
    }
}