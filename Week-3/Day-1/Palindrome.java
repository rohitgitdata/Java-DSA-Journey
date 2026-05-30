public class Palindrome {
    static boolean check(String s){
        int start = 0;
        int end = s.length() - 1;

        while(start <= end){

            while(start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }

            while(start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }

            char left = Character.toLowerCase(s.charAt(start));
            char right = Character.toLowerCase(s.charAt(end));

            if(left != right){
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
