import java.util.Scanner;

public class ArmstrongNumber {
    
    static int armStrong(int n){
        int sum  = 0;
        
        while (n > 0) {
           int rem = n % 10;
           int cube = rem * rem * rem;
            sum = sum +  cube;
            n = n/10;
        }
        return sum;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the number : ");
        int num = sc.nextInt();
        int result = armStrong(num);
        int original = num;
        if (result== original) {
            System.out.println("Entered number is an Armstrong number");
        } else {
            System.out.println("Entered number is not an Armstrong number");
        }
        sc.close();
    }
}
