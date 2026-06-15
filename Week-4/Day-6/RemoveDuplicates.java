import java.util.Stack;

public class RemoveDuplicates {

    public static String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                if (stack.peek() == ch) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {


        String s1 = "abbaca";
        System.out.println("First original string : " + s1);
        System.out.println("First String after removing Duplicates : " + removeDuplicates(s1));
System.out.println();
        String s2 = "azxxzy";
         System.out.println("Second original string : " + s2);
        System.out.println("Second String after removing Duplicates : " + removeDuplicates(s2));
    }
}