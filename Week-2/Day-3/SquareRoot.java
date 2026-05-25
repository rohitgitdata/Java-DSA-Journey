import java.util.Scanner;

public class SquareRoot {
    static int root(int x){
        int start = 0;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start)/2;
            long sq = (long)mid * mid;
            if (sq == x) {
                return mid;
            }
            if (sq > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        int ans = root(x);
        System.out.println("Square root of the number is approx. : " + ans);
        sc.close();
    }
}
