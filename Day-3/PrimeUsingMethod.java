import java.util.Scanner;

public class PrimeUsingMethod {
    static boolean isPrime(int n){
        int c = 2;
        if (n <= 1) {
            return false;
        } else {
            while (c * c <= n) {
                if (n % c==0) {
                    return false;
                }
                c++;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
        System.out.println("========Program Started=========");
        System.out.print("Enter the you want to check : ");
        int num = sc.nextInt();
        boolean res = isPrime(num);
        System.out.println("Your entered number is prime : " + res);
        System.out.println("========THE END=========");
        System.out.print("Do you want to continue (y/n): ");
        String ch = sc.next();
        if (ch.equals("n")) {
            flag = false;
            }
    }
        sc.close();
    }    
}
