/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
      if(head==null) return false;
      ListNode s=head,f=head;
      while(f!=null&&f.next!=null){
        s=s.next;
        f=f.next.next;
        if(s==f) break;
      }
      if(f==null||f.next==null) return false;
      s=head;
      int c=0;
      while(s!=f){
        c++;
        s=s.next;
        f=f.next;
      } 
      return true; 
    }
}