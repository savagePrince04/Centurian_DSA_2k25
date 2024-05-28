package Lec7;

public class Stack {
    protected int arr[];
    int index=-1;
    Stack(){
        arr=new int[5];
    }
    Stack(int n){
    arr=new int[n];
    }
    // 0(1)
    public boolean Isempty(){
        return index==-1;
    }
    // 0(1)
    public void push(int data) throws Exception{
        if(Isfull()){
            throw new Exception("Stack Overflow condition");
        }
        index++;
        arr[index]=data;
    }

    public int pop() throws Exception{
        if(Isempty()){
            throw new Exception("Underflow condition");
        }
        int rv=arr[index];
        index--;
        return rv;
    }
    public int size(){
        return index+1;
    }

    public int peek(){
        int rv=arr[index];
        return rv;
    }
    public boolean Isfull(){
        return index==arr.length-1;
    }
    public void Display(){
        for(int i=0;i<=index;i++){
            System.out.println(arr[i]);
        }
    }
}
