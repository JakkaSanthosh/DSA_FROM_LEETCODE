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
       PriorityQueue<Integer> pq=new PriorityQueue<>();
    public ListNode mergeKLists(ListNode[] lists) {
       if(lists==null) return null;
        for(int i=0;i<lists.length;i++){
            ListNode head=lists[i];
            while(head!=null){
                pq.add(head.val);
                head=head.next;
            }
        }if (pq.isEmpty()) return null;
        ListNode head=new ListNode(pq.poll());
        ListNode c=head;
        while(!pq.isEmpty()){
            ListNode nn=new ListNode(pq.poll());
            c.next=nn;
            c=c.next;
        }
        return head;
    }
   
}