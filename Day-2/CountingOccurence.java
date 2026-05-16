import java.util.Scanner;

public class CountingOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 46797324;
        System.out.print("Enter the number to find its occurence : ");
        int num = sc.nextInt();
        int count = 0;
        while (a > 0) {
            int rem = a % 10;
            if (rem == num) {
                count = count + 1;
            }
            a = a/10;
        }
        System.out.println("Occurence of " + num + " is : " + count);
        sc.close();
    }
}
