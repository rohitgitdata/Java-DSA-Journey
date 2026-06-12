import java.util.*;
public class ValidParenthesis {
     static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);
            
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            if(ch == ')' && stack.peek() == '('){
                stack.pop();

            }else if(ch == '}' && stack.peek() == '{'){
                stack.pop();

            }else if(ch == ']' && stack.peek() == '['){
                stack.pop();

            }else{
                return false;
            }
        }
    return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the parenthesis to check are they valid or not : ");
        String parenthesis = sc.nextLine();
        boolean ans = isValid(parenthesis);
        if (ans) {
            System.out.println("This is a vaid PARENTHESES ");
        }else{
            System.out.println("This is not a valid PARENTHESES");
        }
        sc.close();
    }
}    

