import java.nio.channels.NoConnectionPendingException;

public class DLL {
    private int size;
    private Node head;
    

    public DLL() {
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;    
        size++;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        if (head == null) {
            node.prev = null;
            head = node;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }
    
    public void display(){
        Node temp = head;
        System.out.print("START <-> ");
        while (temp!= null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void rev(){
        if (head == null) {
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        System.out.println("The reversed list is :");
        System.out.print("END <-> ");
        while (last != null) {
            System.out.print(last.value + " <-> ");
            last = last.prev;
        }
        System.out.print("START");
    }

    private class  Node {
        private int value;
        private Node next;
        private Node prev;
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
        public Node(int value) {
            this.value = value;
        } // Construcutor end
    }    //Node class end
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertFirst(60);
        list.insertLast(70);
        list.display();
        list.rev();
        
    }
} // DLL class end
