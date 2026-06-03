import java.util.Scanner;

public class ProductOfDigitsUsingRecursion {
    static int helper(int num){
        if (num == 0) {
            return 0;
        }
        return prod(num);
    }
    static int prod(int num){
        if(num == 0){
            return 1;
        }
        int rem = num % 10;
        return rem * prod(num/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int ans = helper(n);
        System.out.println("The product of digits : " + ans);
        sc.close();
    }
}
