import java.util.Stack;

public class BuiltInStack{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);

        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println("| " + stack.pop() + " |");
        System.out.println(("| __ |"));
    }
}