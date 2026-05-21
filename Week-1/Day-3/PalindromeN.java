import java.util.Scanner;

public class PalindromeN{
    static int palindrome(int n){
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : " );
        int num = sc.nextInt();
        
        if (num == palindrome(num)) {
            System.out.println("Entered number is palindrome ");
        } else {
            System.out.println("Entered number is not palindrome");
        }
        sc.close();
    }
}