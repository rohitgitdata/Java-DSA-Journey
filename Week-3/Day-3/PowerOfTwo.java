import java.util.Scanner;

public class PowerOfTwo {
    static boolean power(int n){
        if (n == 1) {
            return true;
        }
        if (n <=0 || n % 2 != 0) {
            return false;
        }
        return power(n/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check : ");
        int n = sc.nextInt();
        boolean ans = power(n);
        if (ans) {
            System.out.println( n + " is a power of two");
        } else {
            System.out.println(n + " is not a power of two");
        }
        sc.close();
    }
}
