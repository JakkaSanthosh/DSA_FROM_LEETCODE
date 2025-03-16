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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode dummy=new ListNode(-444);
        ListNode k=dummy;
        ListNode temp=head;
        while(head.next!=null){
           ListNode x=new ListNode(gcd(head.val,head.next.val));
            k.next=head;
            head=head.next;
            k.next.next=x;
            k=k.next.next;
        }k.next = head;
        return dummy.next;
    }
    static int gcd(int x,int y){
        int min=Math.min(x,y);
        int ans=1;
        for(int i=1;i<=min;i++){
            if(x%i==0&&y%i==0) ans=i;
        }
        return ans;
    }
}