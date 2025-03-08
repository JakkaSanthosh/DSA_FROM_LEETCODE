class Solution {
    public ListNode removeNodes(ListNode head) {
        if (head == null) return head; 

        ListNode c = head;
        List<Integer> al = new ArrayList<>();

        while (c != null) {
            while (!al.isEmpty() && al.get(al.size() - 1) < c.val) {
                al.remove(al.size() - 1); // Remove smaller values
            }
            al.add(c.val);
            c = c.next;
        }

        // Rebuild the linked list
        ListNode head1 = new ListNode(-1); // Dummy node
        ListNode c1 = head1;
        for (int i : al) {
            c1.next = new ListNode(i);
            c1 = c1.next;
        }
        return head1.next;
    }
}
