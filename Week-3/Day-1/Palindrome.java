public class Palindrome {
    static boolean check(String name){
        int start = 0;
        int end = name.length() - 1;
        while (start <= end) {
            if (name.charAt(start) != name.charAt(end)) {
                return false;
            } 
            start++;
            end--;
        }
        return true;
    }   
    public static void main(String[] args) {
        String name = "Naman";
        boolean ans = check(name.toLowerCase());
        if (ans) {
            System.out.println("This String is a Palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    } 
}
