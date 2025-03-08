/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode l1, ListNode l2) {
        if(l1==null) return null;
        if(l2==null) return null;
        int sizeA=size(l1);
        int sizeB=size(l2);
        int k=Math.abs(sizeA-sizeB);
        if(sizeA>sizeB){
            while(k-->0){
                l1=l1.next;
            }
        }
    else while(k-->0){
            l2=l2.next;
    }
     ListNode tempA=l1,tempB=l2; 
     while(tempA!=tempB){
        tempA=tempA.next;
        tempB=tempB.next;
     }
     if(tempA==tempB) return tempA;
     return null;  
    }
    static int size(ListNode l1){
        int c=0;
        while(l1!=null){
            c++;
            l1=l1.next;
        }
        return c;
    }
}