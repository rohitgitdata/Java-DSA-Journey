
import java.util.Scanner;

public class RotatedTrianglePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int row = 0; row < 2 * n - 1; row++) {

            int totalCols;

            if (row < n) {
                totalCols = row + 1;
            } else {
                totalCols = 2 * n - row - 1;
            }

            for (int col = 0; col < totalCols; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        sc.close();
    }
}