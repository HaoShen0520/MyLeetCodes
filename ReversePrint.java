import java.util.ArrayList;

public class ReversePrint {
    public int[] reversePrint(ListNode head) {
        ListNode cur  = head;

        ArrayList<Integer> output = new ArrayList<>();

        while(cur != null) {
            output.add(cur.val);
            cur = cur.next;
        }

        int[] result = new int[output.size()];

        for (int i = 0; i < output.size(); i++) {
            result[output.size() - 1 - i] = output.get(i);
        }

        return result;
    }
}
