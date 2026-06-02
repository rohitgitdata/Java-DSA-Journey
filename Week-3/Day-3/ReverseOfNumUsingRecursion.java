import java.util.Scanner;

public class ReverseOfNumUsingRecursion {
    static int reverse(int n, int rev){
        if (n == 0) {
            return rev;
        }
        int rem = n % 10;
        rev = rev*10 + rem;
        return reverse(n/10,rev);
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int ans = reverse(n,0);
        System.out.println("The reverse of number is : " + ans);
        sc.close();
    }
}
