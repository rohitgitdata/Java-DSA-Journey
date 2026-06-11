public class SearchElement {
    Node head;
    int size = 0;
    
    public SearchElement() {
        this.head = null;
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        if (head == null) {
            head = node;
            head.next = null;
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
    public boolean isFound(int element){
        Node temp = head;
        while (temp != null) {
            if (temp.value == element) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }  
    }
    public static void main(String[] args) {
        SearchElement list = new SearchElement();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertFirst(60);
        System.out.println("=====Program start=====");
        System.out.println();
        list.display();
        boolean res = list.isFound(20);
        if (res) {
            System.out.println("Element found in the linked list");
        }else{
        System.out.println("Element not found");
        }
        System.err.println();
        System.out.println("======Program end=====");
    }
}
