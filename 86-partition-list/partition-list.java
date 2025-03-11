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
    public ListNode partition(ListNode head, int x) {
        if(head==null) return null;
        ListNode lt=new ListNode(-999);
        ListNode gt=new ListNode(-1000);
        ListNode l=lt,g=gt,c=head;
        while(c!=null){
            if(c.val<x){
                l.next=c;
                l=l.next;
            }
            else{
                g.next=c;
                g=g.next;
            }
            c=c.next;
        }
        l.next=gt.next;
        g.next=null;
        return lt.next;
    }
}