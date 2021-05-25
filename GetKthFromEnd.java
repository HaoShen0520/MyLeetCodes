public class GetKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode front = head;
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            tail = tail.next;
        }

        while (tail != null) {
            front = front.next;
            tail = tail.next;
        }

        return front;
    }
}
