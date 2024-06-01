package Lec10;
import java.util.*;
import java.util.Queue;

public class Number_of__Recent_Calls {
    public static void main(String[] args) {
        class RecentCounter {
            Queue<Integer>sc;
            public RecentCounter() {
                sc=new LinkedList();
            }

            public int ping(int t) {
                sc.add(t);
                while(!sc.isEmpty() && t-3000>sc.peek()){
                    sc.poll();
                }
                return sc.size();
            }
        }

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
    }
}
