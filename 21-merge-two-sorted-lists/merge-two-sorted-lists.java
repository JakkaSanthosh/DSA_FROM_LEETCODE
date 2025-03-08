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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode k=new ListNode(-999);
        ListNode c=k;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
            c.next=l1;
            l1=l1.next;}
            else {
            c.next=l2;
            l2=l2.next;}
            c=c.next;
        }
    
        while(l2!=null){
            c.next=l2;
            c=c.next;
            l2=l2.next;
        }
        while(l1!=null){
            c.next=l1;
            c=c.next;
            l1=l1.next;
        }
        return k.next;
        }
}