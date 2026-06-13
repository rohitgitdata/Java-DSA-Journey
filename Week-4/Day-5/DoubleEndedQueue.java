import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleEndedQueue {
    public static void main(String[] args) {
   Deque<Integer> queue = new ArrayDeque<>();
   queue.addFirst(10);
   queue.add(20);
   queue.add(30);
   queue.add(40);
   queue.add(50);
   queue.add(60);
   queue.add(70);
   queue.add(80);
   queue.add(90);
   queue.addLast(100);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
