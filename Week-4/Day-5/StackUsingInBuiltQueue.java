import java.util.LinkedList;
import java.util.Queue;

public class StackUsingInBuiltQueue {

    private Queue<Integer> q1;

    public StackUsingInBuiltQueue() {
        q1 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);

        for (int i = 0; i < q1.size() - 1; i++) {
            q1.add(q1.poll());
        }
    }

    public int pop() {
        if (empty()) {
            return -1;
        }

        return q1.poll();
    }

    public int top() {
        if (empty()) {
            return -1;
        }

        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println("This is our Stack using Queue !!!");
        System.out.println();

        StackUsingInBuiltQueue stack = new StackUsingInBuiltQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Top element : " + stack.top());
        System.out.println();

        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println();

        System.out.println("Top element : " + stack.top());
        System.out.println();

        System.out.println("Is stack empty ? " + stack.empty());

        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");

        System.out.println();

        System.out.println("Is stack empty ? " + stack.empty());
    }
}