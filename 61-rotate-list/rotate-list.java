/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
      int n=size(head);
      if(head==null) return null;
      ListNode dummy=head,c=head;
      k=k%n;
      int x=n-k;
      while(x-->1){
        c=c.next;
      }
      while(dummy.next!=null){
        dummy=dummy.next;
      }
      dummy.next=head;
      head=c.next;
      c.next=null;
      return head;
    }
    static int size(ListNode head){
        int c=0;
        while(head!=null){
            c++;
            head=head.next;
        }
        return c;
    }
}