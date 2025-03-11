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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode c=head;
        ListNode even=new ListNode(-999);
        ListNode dummy=even;
        ListNode odd=new ListNode(-1000);
        ListNode odummy=odd;
        int k=1;
        while(c!=null){
            if(k%2==0) {dummy.next=c;
            dummy=dummy.next;
          }
            else{
              odummy.next=c;
              odummy=odummy.next;
            }
              c=c.next;
              k++;
        }dummy.next = null; 
        odummy.next=even.next;
        return odd.next;
    }
}