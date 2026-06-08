public class LL1 {
    //Starting node
    private Node head;
    //Last node
    private Node tail;
    //Total node
    private int size;
    
    public LL1() {
        size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }
    public void insertLast(int val){
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = tail.next;
        size++;
    }
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public int deleteFirst(){
        if (head == null) {
            return -1;
        }
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size --;
        return val;
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }//Constructor Close
    }//Node Class close
    public static void main(String[] args) {
        LL1 list = new LL1();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertLast(40);
        list.display();
        list.deleteFirst();
        list.display();
    }
}//LL1 close
