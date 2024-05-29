package Lec8;

public class Intersection_of_Two_Linked_Lists {
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode V=headA;
            ListNode vgf=headB;
            while(V!=vgf){
                if(V==null){
                    V=headB;
                }
                else{
                    V=V.next;
                }
                if(vgf==null){
                    vgf=headA;
                }
                else{
                    vgf=vgf.next;
                }
            }
            return V;
        }
    }
}
