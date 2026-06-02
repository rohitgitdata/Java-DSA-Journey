import java.util.Scanner;

public class FibbonacciNum {
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find its fibbonacci number : ");
        int n = sc.nextInt();
        int ans = fibo(n);
        System.out.println("The fibbonacci number at " + n + " is : " + ans);
        sc.close();
    }
}
