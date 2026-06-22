import java.util.Scanner;

public class TreeUsingTraversals {
    private Node root;
    private int preIndex = 0;

    public TreeUsingTraversals(){

    }
    public void createFromTraversal(int[] preorder, int[] inorder){
        root = build(preorder, inorder, 0, inorder.length - 1);
    }
    private Node build(int[] preorder, int[] inorder, int start, int end){
        
        if (start > end) {
            return null;
        }
        int value = preorder[preIndex];
        preIndex++;
        Node node = new Node(value);
        if (start == end) {
            return node;
        }
        int index = -1;
        for (int i = start; i <= end; i++) {
            if (inorder[i] == value) {
                index = i;
                break;
            }
        }
        node.left = build(preorder, inorder, start, index - 1);
        node.right = build(preorder, inorder, index + 1, end);
        return node;
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
            System.out.println("|-------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        display(node.left, level + 1);
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
        Scanner sc = new Scanner(System.in);;
        System.out.print("Enter the total number of nodes of the tree : ");
        int n = sc.nextInt();
        int[] preorder = new int[n];
        int[] inorder = new int[n];
        System.out.println("Enter Nodes of inorder : ");
        for (int i = 0; i < inorder.length; i++) {
            inorder[i] = sc.nextInt();
        }
        System.out.println("Enter Nodes of preorder : ");
        for (int i = 0; i < preorder.length; i++) {
            preorder[i] = sc.nextInt();
        }
        TreeUsingTraversals tree = new TreeUsingTraversals();
        tree.createFromTraversal(preorder, inorder);
        System.out.println("This is our tree :");
        System.out.println();
        tree.display();
        sc.close();
    }
}
