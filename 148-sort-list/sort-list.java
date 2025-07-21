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
    public ListNode sortList(ListNode head) {
        List<Integer> al=new ArrayList<>();
        if(head==null) return null;
        while(head!=null){
            al.add(head.val);
            head=head.next;
        }
        Collections.sort(al);
        ListNode dummy=new ListNode(al.get(0));
        head=dummy;
        int i=1;
        while(i<al.size()){
            dummy.next=new ListNode(al.get(i));
            dummy=dummy.next;
            i++;
        }
        return head;
    }
}