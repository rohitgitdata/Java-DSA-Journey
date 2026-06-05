import java.util.Scanner;

public class RightAngledTriangleUsingRecursion {
    static void pattern(int rows, int cols){
        if (rows == 0) {
            return;
        }
        if (cols < rows) {
            pattern(rows, cols + 1);
            System.out.print("* ");
        } else {
            pattern(rows - 1, 0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        pattern(rows, 0);
        sc.close();
    }
}
