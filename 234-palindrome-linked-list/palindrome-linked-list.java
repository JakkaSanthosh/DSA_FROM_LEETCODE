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
    public boolean isPalindrome(ListNode head) {
     if(head==null) return true;
     Stack<Integer> st=new Stack<>();
     ListNode c=head;
     while(c!=null){
        st.push(c.val);
        c=c.next;
     }  
     ListNode head1=new ListNode(-999);
     ListNode dummy=head1;
     while(!st.isEmpty()){
        ListNode nn=new ListNode(st.pop());
        dummy.next=nn;
        dummy=dummy.next;
     }
     head1=head1.next;
     while(head!=null){
        if(head.val!=head1.val) return false ;
        head=head.next;
        head1=head1.next;
     }
     return true;
    }
}