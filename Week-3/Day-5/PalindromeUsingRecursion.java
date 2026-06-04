import java.util.Scanner;

public class PalindromeUsingRecursion {
    static boolean checkPalindrome(int num){
        return check(num,num, 0);
    }   
    static boolean check(int originalNum, int num, int rev){
        if(num == 0){
            return originalNum == rev;
        }
        int rem = num % 10;
        return check(originalNum, num/10, rev * 10 + rem);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        boolean ans = checkPalindrome(num);
        if (ans) {
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
        sc.close();
    }
}
