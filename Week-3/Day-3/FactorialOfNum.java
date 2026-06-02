import java.util.Scanner;

public class FactorialOfNum {
    static int fact(int n){
        if (n == 1) {
            return n;
        }
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its Factorial : ");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println("The factorial of " + n + " is : " + ans);
        sc.close();
    }
}