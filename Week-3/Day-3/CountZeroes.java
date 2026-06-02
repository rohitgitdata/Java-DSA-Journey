import java.util.Scanner;

public class CountZeroes {
    static int helper(int n){
        if (n == 0) {
            return 1;
        }
        return count(n);
    }
    static int count(int n){
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        if (rem == 0) {
            return 1 + count(n/10);
        }
        return count(n / 10);
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number including zeroes : ");
        int n = sc.nextInt();
        int ans = helper(n);
        System.out.println("Total number of zeroes : " +ans);
        sc.close();
    } 
}
