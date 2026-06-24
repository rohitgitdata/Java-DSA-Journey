import java.util.Scanner;

public class BST2 {
    private Node root;

    public BST2(){

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
    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
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
    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length - 1);
    }
    private void populateSorted(int[] nums, int start, int end){
        if (start > end) {
            return;
        }
        int mid = start + (end - start)/2;
        insert(nums[mid]);
        populateSorted(nums, start, mid - 1);
        populateSorted(nums, mid + 1, end);
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
        BST2 tree = new BST2();
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        tree.populateSorted(arr);
       
       System.out.println("This is our BST : ");
       System.out.println();
       tree.display();
       sc.close();
    }
}
