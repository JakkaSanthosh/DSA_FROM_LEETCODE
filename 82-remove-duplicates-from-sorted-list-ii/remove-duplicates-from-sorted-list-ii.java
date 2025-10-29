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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode prev=new ListNode(-999);
        ListNode k=new ListNode(-100);
        ListNode dummy=k;
        ListNode c=head;
        while(c.next!=null){
            if(c.val!=prev.val&&c.val!=c.next.val){
                //prev=c;
                dummy.next=new ListNode(c.val);
                dummy=dummy.next;
            //c=c.next;
            }
            
                prev=c;
                c=c.next;
            
        }
        if(c.val!=prev.val){
            dummy.next=c;
        }
        return k.next;
    }
}