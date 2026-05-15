import java.util.Scanner;

public class SumOFTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a = sc.nextInt();
        System.out.print("Enter the second number :");
        int b = sc.nextInt();
        int Sum = a + b;

        System.out.println("The Sum of the two numbers is :" + Sum);
        sc.close();
    }
}
