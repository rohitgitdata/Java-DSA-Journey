public class CLL {
    Node head;
    Node tail;
    int size;

    public CLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void insert(int val){
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display(){
        Node temp = head;
        if (temp == null) {
            return;
        }
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.err.println("HEAD");
    }

    private class Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }// Node class end
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(8);
        list.insert(9);
        list.insert(2);
        list.insert(4);
        list.insert(7);
        list.display();
    }
} // CLL class ends
