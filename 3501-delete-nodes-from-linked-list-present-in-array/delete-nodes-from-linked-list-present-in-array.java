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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if (head == null)
            return head;
        Set<Integer> hs = new HashSet<>();
        for (var i : nums)
            hs.add(i);
        while (head != null && hs.contains(head.val)) {
            head = head.next;
        }
        ListNode dummy = head;
        while (dummy != null && dummy.next != null) {
            if (hs.contains(dummy.next.val))
                dummy.next = dummy.next.next;
            else
                dummy = dummy.next;
        }
        return head;
    }
}