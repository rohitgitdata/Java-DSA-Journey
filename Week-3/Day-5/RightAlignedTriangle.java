import java.util.Scanner;

public class RightAlignedTriangle {

    static void pattern(int totalRows, int row) {
        if (row > totalRows) {
            return;
        }

        printSpaces(totalRows - row);
        printStars(row);
        System.out.println();

        pattern(totalRows, row + 1);
    }

    static void printSpaces(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(" ");
        printSpaces(n - 1);
    }

    static void printStars(int n) {
        if (n == 0) {
            return;
        }

        System.out.print("*");
        printStars(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        pattern(rows, 1);

        sc.close();
    }
}