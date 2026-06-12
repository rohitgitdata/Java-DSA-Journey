import java.util.LinkedList;
import java.util.Queue;

public class BuiltInQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); //Here we use linkedlist bcz it behaves like LL and Queue is an interface to it cannot created a new object.

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);

        System.out.println("| " + queue.remove() + " |");
        System.out.println("| " + queue.remove() + " |");
        System.out.println("| " + queue.remove() + " |");
        System.out.println("| " + queue.remove() + " |");
        System.out.println("| " + queue.remove() + " |");
        System.out.println("| " + queue.remove() + " |");
        System.out.println("| " + queue.remove() + " |");
        System.out.println(("| __ |"));
    }
}
