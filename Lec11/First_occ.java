package Lec11;

public class First_occ {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int target=70;
        int ans=Search(arr,target,0);
        System.out.println(ans);
    }
    public static int Search(int arr[],int target,int index){
        if(arr.length==index){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return Search(arr,target,index+1);
    }
}
