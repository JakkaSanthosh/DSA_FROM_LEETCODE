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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int k=size(head);
        if(head==null||n>k) return null;
        if(n==k) return head.next;
        //if(n>k) return null;
        ListNode c=head;
        int x=k-n;
        while(x-->1){
            c=c.next;
        }
        c.next=c.next.next;
        return head;
    }
    static int size(ListNode head){
        if(head==null) return 0;
        int c=0;
        while(head!=null){
            c++;
            head=head.next;
        }
        return c;
    }
}