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
        System.out.println("=========Program Strated==========");
        boolean flag = true;
        while (flag) {
        System.out.print("Enter the number : " );
        int num = sc.nextInt();
        
        if (num == palindrome(num)) {
            System.out.println("Entered number is palindrome ");
        } else {
            System.out.println("Entered number is not palindrome");
        }
        System.out.print("You want to continue? (Y/N)");
        String ch = sc.next();
        if (ch.equalsIgnoreCase("N")) {
            flag = false;
        }
    }
        System.out.print("=========Program Completed==========");
        sc.close();
    }
}