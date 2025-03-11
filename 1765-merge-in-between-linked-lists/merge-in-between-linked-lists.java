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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
       if(list1==null ) return null;
       if(list2==null) return null;
       ListNode c=list1,c1=list1;
       int k=0;
       while(k<=b){
        if(k<a-1) c=c.next;
        c1=c1.next;
        k++;
       }
       c.next=list2;
       while(c.next!=null){
        c=c.next;
       } 
       c.next=c1;
       return list1;
    }
}