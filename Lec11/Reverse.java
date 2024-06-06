package Lec11;

public class Reverse {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Reverse(arr,0);
    }
    public static void Reverse(int arr[],int idx){
        if(arr.length==idx){
            return;
        }
        Reverse(arr, idx+1);
        System.out.print(arr[idx]+" ");

    }
}
