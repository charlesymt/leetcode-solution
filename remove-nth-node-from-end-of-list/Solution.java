class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode del = res;
        ListNode tmp = res;
        int i;
        if (n == 1 && head.next == null) return null;

        for (i = 0; i < n && tmp != null; i++, tmp = tmp.next) {
            ;
        }
        for (; tmp != null && tmp.next != null; tmp = tmp.next) {
            del = del.next;
        }
        if (i == n && tmp.next == null) {
            if (del.next != null)
                del.next = del.next.next;
            return res.next;
        }

        return res.next;
    }
}