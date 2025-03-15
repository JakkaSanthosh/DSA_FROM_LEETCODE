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
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode prev=null,c=head;
        while(c!=null){
            ListNode x=c.next;
            c.next=prev;
            prev=c;
            c=x;
        }  
        return prev;
    }
}