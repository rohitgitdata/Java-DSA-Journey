import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to reverse : ");
        int num = sc.nextInt();
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            
            rev = rev * 10 + rem;
             
            num = num/10;
        }
        System.out.println("The reverseo of the number is : " + rev);
        sc.close();
    }
}
