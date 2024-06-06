package Lec5;

public class Pelondrom {
    public static void main(String[] args) {
        System.out.println(Pelindrom("nitin"));
    }
    public static boolean Pelindrom(String s){
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
