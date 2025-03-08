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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
       while(head!=null&& head.val==val) head=head.next;
        ListNode c=head;
        ListNode dummy=head;
        ListNode prev=dummy;
        
        while(c!=null){
            if(c.val==val){
                prev.next=c.next; 
            }
            else
            prev=c;
            c=c.next;
        }
        return dummy;
    }
}