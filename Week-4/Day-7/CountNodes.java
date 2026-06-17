public class CountNodes{
    Node head;
    int size = 0;

    public CountNodes() {
        this.head = null;
        this.size = 0;
    }
    public void insertfirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            node.next = null;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.err.println("END");
    }
    public int count(){
        if (size != 0) {
            return size;
        }else{
            return 0;
        }
    }

    private class Node {
       private int value;
       private Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        CountNodes list = new CountNodes();
        list.insertfirst(10);
        list.insertfirst(20);
        list.insertfirst(30);
        list.insertfirst(40);
        list.insertfirst(50);
        list.insertfirst(60);
        System.out.println("=====Program start=====");
        System.out.println();
        list.display();
        System.out.println("So, the total number of nodes in Linked list : " + list.count());
        System.err.println();
        System.out.println("======Program end======");
    }
}