import java.util.Scanner;

public class SumOfDigitsUsingRecursion {
    static int count(int n){
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        return rem + count(n / 10);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int ans = count(n);
        System.out.println("The sum of digits : " + ans);
        sc.close();
    }   
}
