import java.util.Scanner;

public class RevisedBT {
    private Node root;
    public RevisedBT(){

    }
    public void populate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Root node :");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
        sc.close();
    }
    private void populate(Scanner sc, Node node){
        System.out.println();
        System.out.print("Do you want to Create left node of " + node.value + " (y/n): ");
        String lft = sc.next();
        if (lft.equalsIgnoreCase("y")) {
            System.out.print("Enter the left node of "+ node.value + " : ");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }else{
            return;
        }
        System.out.println();
        System.out.print("Do you want to Create right node of " + node.value + " (y/n): ");
        String rght = sc.next();
        if (rght.equalsIgnoreCase("y")) {
            System.out.print("Enter the right node of "+ node.value + " : ");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }else{
            return;
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
        display(node.right, indent + "\t");
        display(node.left, indent + "\t");
    }
    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }
    private void prettyDisplay(Node node, int level){
        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------>" + node.value);
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }
    private class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int val){
            this.value = val;
        }
    }
    public static void main(String[] args) {
        RevisedBT tree = new RevisedBT();
        tree.populate();
        System.out.println();
        System.out.println("This is Your Tree Reprenstation");
        tree.display();
        System.out.println();
        System.out.println("ACtual treee: ");
        tree.prettyDisplay();
    }
}
