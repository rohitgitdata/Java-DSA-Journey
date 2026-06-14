public class QueueUsingCustomStack {

    // ================= Custom Stack =================

    private static class CustomStack {

        protected int[] data;
        private static final int DEFAULT_SIZE = 10;
        private int ptr = -1;

        public CustomStack() {
            this(DEFAULT_SIZE);
        }

        public CustomStack(int size) {
            data = new int[size];
        }

        public boolean push(int item) {

            if (isFull()) {
                return false;
            }

            ptr++;
            data[ptr] = item;

            return true;
        }

        public int pop() {

            if (isEmpty()) {
                return -1;
            }

            return data[ptr--];
        }

        public int peek() {

            if (isEmpty()) {
                return -1;
            }

            return data[ptr];
        }

        public boolean isEmpty() {
            return ptr == -1;
        }

        public boolean isFull() {
            return ptr == data.length - 1;
        }
    }

    // ================= Queue Using Custom Stacks =================

    private CustomStack s1;
    private CustomStack s2;

    public QueueUsingCustomStack() {
        s1 = new CustomStack();
        s2 = new CustomStack();
    }

    public void push(int item) {

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(item);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int pop() {

        if (isEmpty()) {
            return -1;
        }

        return s1.pop();
    }

    public int peek() {

        if (isEmpty()) {
            return -1;
        }

        return s1.peek();
    }

    public boolean isEmpty() {
        return s1.isEmpty();
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        while (!s1.isEmpty()) {

            int removed = s1.pop();

            System.out.print(removed + " <- ");

            s2.push(removed);
        }

        System.out.println("END");

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // ================= Main Method =================

    public static void main(String[] args) {

        QueueUsingCustomStack queue = new QueueUsingCustomStack();

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);

        System.out.println("Queue :");
        queue.display();

        System.out.println();

        System.out.println("Removed Item : " + queue.pop());

        System.out.println();

        System.out.println("Queue After Removal :");
        queue.display();

        System.out.println();

        System.out.println("Front Element : " + queue.peek());

        System.out.println();

        System.out.println("Is Queue Empty ? " + queue.isEmpty());
    }
}