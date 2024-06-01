package Lec9;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        int height[] ={4,2,0,3,2,5};
        Traping(height);
    }
    public static void Traping(int arr[]){
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(arr[i],right[i+1]);
        }
        int ans=0;
        for(int i=0;i< left.length;i++){
            ans=ans+Math.min(left[i],right[i])-arr[i];
        }
        System.out.println(ans);
    }
}
