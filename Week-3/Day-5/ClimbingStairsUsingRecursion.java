import java.util.Scanner;

public class ClimbingStairsUsingRecursion {
    static int countSteps(int n){
        if (n <=2) {
            return n;
        }
        return countSteps(n - 1) + countSteps(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs : ");
        int n = sc.nextInt();
        int ans = countSteps(n);
        System.out.println("So, Total for " + n + " stairs is : " + ans);
        sc.close();
    }
}
