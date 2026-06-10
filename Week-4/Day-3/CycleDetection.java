public class CycleDetection {

    Node head;

    public boolean hasCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        CycleDetection list = new CycleDetection();

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Cycle create kar rahe hain
        fifth.next = third;

        boolean ans = list.hasCycle(first);
        if (ans) {
            System.out.println("Cycle formed");
        }else{
            System.out.println("Cycle not formed");
        }
    }

    static class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}