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
    public int[] nextLargerNodes(ListNode head) {
        if(head==null) return new int[0];
        List<Integer> al=new ArrayList<>();
        while(head!=null){
            al.add(head.val);
            head=head.next;
        }
        int a[]=new int[al.size()];
        Stack<Integer> st=new Stack<>();
        for(int i=al.size()-1;i>=0;i--){
            while(!st.isEmpty()&&st.peek()<=al.get(i)){
                st.pop();
            }
            a[i]=st.isEmpty()?0:st.peek();
            st.push(al.get(i));
        }
        return a;
    }
}