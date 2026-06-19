import java.util.*;
public class BinaryTree {
    private Node root;
    public BinaryTree(){

    }
    public void populate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the root node value : ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }
    private void populate(Scanner sc, Node node){
        System.out.println();
        System.out.println("Do you want to create a left node of the " + node.value + " : ");
        boolean lft = sc.nextBoolean();
        if (lft) {
            System.out.print("Enter the value of left node of " + node.value + " : ");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.println();
        System.out.println("Do you want to create a right node of the " + node.value + " : ");
        boolean rght = sc.nextBoolean();
        if (rght) {
            System.out.print("Enter the value of right node of " + node.value + " : ");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }
    public void display(){
        
        display(root, " ");
    }
    private void display(Node node, String indent){
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent  +"\t");
    }
    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }
    private void prettyDisplay(Node node,int level){
        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }            
            System.out.println("|------->" + node.value);
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }

    private class Node{
       private int value;
       private Node left;
       private Node right;

        public Node(int value){
            this.value = value;
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        System.out.println();
        System.out.println("OUR TREE : ");
        tree.prettyDisplay();
    }
}
