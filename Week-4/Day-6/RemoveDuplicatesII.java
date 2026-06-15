import java.util.Stack;

public class RemoveDuplicatesII {

    public static String removeDuplicates(String s, int k) {

        Stack<Character> charStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!charStack.isEmpty() && charStack.peek() == ch) {

                int count = countStack.pop() + 1;

                if (count == k) {
                    charStack.pop();
                } else {
                    countStack.push(count);
                }

            } else {

                charStack.push(ch);
                countStack.push(1);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!charStack.isEmpty()) {

            char ch = charStack.pop();
            int count = countStack.pop();

            while (count > 0) {
                sb.append(ch);
                count--;
            }
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {

        String s1 = "abcd";
        int k1 = 2;
        System.out.println(removeDuplicates(s1, k1));
        // Output: abcd

        String s2 = "deeedbbcccbdaa";
        int k2 = 3;
        System.out.println(removeDuplicates(s2, k2));
        // Output: aa

        String s3 = "pbbcggttciiippooaais";
        int k3 = 2;
        System.out.println(removeDuplicates(s3, k3));
        // Output: ps
    }
}