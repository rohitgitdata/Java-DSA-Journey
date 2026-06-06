import java.util.Scanner;

public class RevisedFibbo{

 /* 1. Approach  */ 

    // static int fibonacci(int n){
    //     if (n <= 1) {
    //         return n;
    //     }
    //     return fibonacci(n - 1) + fibonacci(n -2);
    // }
 
/* 2nd approach */
    static int fibonacci(int n){
        if (n < 2) {
            return n;
        }
        int prev1 = 1;
        int prev2 = 0;
        for (int i = 2; i <=n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
            
        }
        return prev1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int ans = fibonacci(n);
        System.out.println("fibonacci number is : " + ans);
        sc.close();
    }
}