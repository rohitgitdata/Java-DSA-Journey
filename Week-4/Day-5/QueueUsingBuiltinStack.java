import java.util.Stack;

public class QueueUsingBuiltinStack {

    private Stack<Integer> in;
    private Stack<Integer> out;

    public QueueUsingBuiltinStack() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    public static void main(String[] args) {

        QueueUsingBuiltinStack queue = new QueueUsingBuiltinStack();

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);

        System.out.println("Front element : " + queue.peek());

        System.out.println("Removed item : " + queue.pop());

        System.out.println("Front element : " + queue.peek());

        System.out.println("Removed item : " + queue.pop());

        System.out.println("Is Queue Empty ? " + queue.empty());

        queue.push(50);

        System.out.println("Removed item : " + queue.pop());

        System.out.println("Removed item : " + queue.pop());

        System.out.println("Removed item : " + queue.pop());

        System.out.println("Is Queue Empty ? " + queue.empty());
    }
}