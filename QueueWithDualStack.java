import java.util.Stack;

public class QueueWithDualStack {
    Stack<Integer> first;
    Stack<Integer> sec;

    public QueueWithDualStack() {
        this.first = new Stack<>();
        this.sec = new Stack<>();
    }

    public void appendTail(int value) {
        first.push(value);
    }

    public int deleteHead() {
        if (first.isEmpty()) {
            return -1;
        }

        while (!first.isEmpty()) {
            sec.push(first.pop());
        }
        int output = sec.pop();
        while (!sec.isEmpty()) {
            first.push(sec.pop());
        }
        return output;
    }
}
