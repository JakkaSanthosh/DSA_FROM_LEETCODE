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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
         ListNode rev1=rev(l1);
          ListNode rev2=rev(l2);
        ListNode head=new ListNode(-1);
        ListNode dum=head;
        int c=0;
        while(rev1!=null||rev2!=null){
            int a = (rev1 != null) ? rev1.val : 0;
            int b = (rev2 != null) ? rev2.val : 0;
            int sum=a+b+c;
            ListNode nn=new ListNode(sum%10);
            dum.next=nn;
            dum=dum.next;
            c=sum/10;
           if (rev1 != null) rev1 = rev1.next;
            if (rev2 != null) rev2 = rev2.next;
        }
        if(c!=0){
            dum.next=new ListNode(c);
            dum=dum.next;
        }
        
       ListNode revd=rev(head.next);
         return revd;
    }
  static ListNode rev(ListNode l1){
    ListNode prev=null;
    if(l1==null) return prev;
    ListNode c=l1;
    while(c!=null){
        ListNode x=c.next;
        c.next=prev;
        prev=c;
        c=x;
    }
    return prev;
  }
}