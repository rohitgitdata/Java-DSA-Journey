import java.util.Scanner;

public class BST {
    private Node root;

    public BST(){

    }
    public int height(Node node){
        if (node == null) {
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void insert(int value){
        root = insert(root, value);
    }
    private Node insert(Node node, int value){
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insert(node.left, value);
        }
        if (value > node.value) {
            node.right = insert(node.right, value);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }
    
    public boolean isBalanced(){
        return isBalanced(root);
    }
    private boolean isBalanced(Node node){
        if (node ==null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }
    public void populate(Scanner sc){
        System.out.print("Enter the number of nodes : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value : ");
            insert(sc.nextInt());
            System.out.println();

        }
    }
    public void display(){
        display(root, 0);
    }
    private void display(Node node, int level){
        if (node == null) {
            return;
        }
        display(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------>" + node.value);
        }else{
            System.out.println(node.value);
        }
        display(node.left, level + 1);
    }
    
    
    private class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();
       tree.populate(sc);
       System.out.println("This is our BST : ");
       tree.display();
    }
}
