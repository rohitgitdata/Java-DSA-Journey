import java.util.Scanner;

public class EvenNumberOfDigits {
    static int digits(int n){
        n = Math.abs(n);
        int count = 0;
        if (n == 0) {
            return 1;
        }
        while (n > 0) {
           count ++; 
           n = n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            
        
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        
        if (digits(num) % 2 == 0) {
            System.out.println("Even digits");
        } else {
            System.out.println("Odd digits");
        }
    System.out.print("Continue ? (y/n) : ");
    String ch = sc.next();
    if (ch.equalsIgnoreCase("n")) {
        flag = false;
    }
    }
        sc.close();
    }
}
