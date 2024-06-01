package Lec10;

public class Design_Circular_Queue {
    public static void main(String[] args) {
        // we
        class MyCircularQueue {
            int arr[];
            int front=0;
            int size=0;
            int rear=-1;
            public MyCircularQueue(int k) {
                arr=new int[k];
            }

            public boolean enQueue(int value) {
                if(isFull()){
                    return false;
                }
                rear=(rear+1) % arr.length;
                arr[rear]=value;
                size++;
                return true;
            }

            public boolean deQueue() {
                if(isEmpty()){
                    return false;
                }
                front=(front+1) % arr.length;
                int rv=arr[front];
                size--;
                return true;
            }

            public int Front() {
                if(isEmpty()){
                    return -1;
                }
                int rv=arr[front];
                return arr[front];
            }

            public int Rear() {
                if(isEmpty()){
                    return -1;
                }
                int rv=arr[rear];
                return rv;
            }

            public boolean isEmpty() {
                return size==0;
            }

            public boolean isFull() {
                return size==arr.length;
            }
        }

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
    }
}
