package Lec9;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        Product(nums);
    }
    public static void Product(int arr[]){
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        for(int i=0;i<n;i++){
            arr[i]=left[i]*right[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
