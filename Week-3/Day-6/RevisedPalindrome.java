import java.util.Scanner;

public class RevisedPalindrome {
        static boolean check(int n){
            if (n == 0) {
                return true;
            }
            return helper(n,n,0);
        }
        static boolean helper(int originalN, int n, int rev){
            if (n == 0) {
                return originalN == rev;
            }
            int rem = n % 10;
            rev = rev * 10 + rem;
            return helper(originalN, n/10, rev);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number : ");
             int n = sc.nextInt();
             boolean res = check(n);
             if (res) {
                System.out.println("Our Number is palindrome");
             } else {
                System.out.println("Our number is not palindrome");
             }
             sc.close();
        }
}
