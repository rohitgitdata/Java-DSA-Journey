import java.util.Scanner;

public class orderTraversal {
    private Node root;

    public orderTraversal(){

    }
    public void populate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of the node : ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
        
    }
    private void populate(Scanner sc, Node node){
        System.out.println();
        System.out.print("DO you want to create the left node of the " + node.value + " : ");
        boolean lft = sc.nextBoolean();
        if (lft) {
            System.out.print("Enter the value of the left node of " + node.value + " : ");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.println();
        System.out.print("DO you want to create the right node of the " + node.value + " : ");
        boolean rght = sc.nextBoolean();
        if (rght) {
            System.out.print("Enter the value of the right node of " + node.value + " : ");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }
    public void display(){
        display(root, 0);
    }
    private void display(Node node,int level){
        if (node == null) {
            return;
        }
        display(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|-------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        display(node.left, level + 1);
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
        orderTraversal tree = new orderTraversal();
        tree.populate();
        System.out.println();
        System.out.println("THIS IS OUR TREE : ");
        System.out.println();
        tree.display();
        System.out.println();
        System.out.print("THE PREORDER TRAVERSAL OF TREE IS : ");
        tree.preOrder();
        System.out.println();
        System.out.print("THE POSTORDER TRAVERSAL OF TREE IS : ");
        tree.postOrder();
    }
}
