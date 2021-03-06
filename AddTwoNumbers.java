public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int temp = 0;
        ListNode output = null, tail = null;

        while (l1 != null || l2 != null) {
            int l1_cur = l1 != null ? l1.val : 0;
            int l2_cur = l2 != null ? l2.val : 0;
            int sum = l1_cur + l2_cur + temp;

            if (output == null) {
                output = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }

            temp = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (temp > 0) {
            tail.next = new ListNode(temp);
        }

        return output;
    }
}
