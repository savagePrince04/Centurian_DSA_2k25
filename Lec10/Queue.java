package Lec10;

public class Queue {
    protected int arr[];
    protected int front=0;
    protected int size=0;
    Queue(){
        arr=new int[5];
    }
    Queue(int n){
        arr=new int[n];
    }
    public boolean IsEmpty(){
        return size==0;
    }
    public void EnQueue(int data){
        int index=(front+size)%arr.length;
        arr[index]=data;
        size++;
    }
    public void DeQueue(){
        int rv=arr[front];
        front=(front+1)%arr.length;
        size--;
    }
    public boolean Isfull(){
        return size== arr.length;
    }
    public int GetFront(){
        int rv=arr[front];
        return rv;
    }
    public void Display(){
        for(int i=0;i<size;i++){
            int index=(front+i)%arr.length;
            System.out.print(arr[index]+" ");
        }
    }
}
