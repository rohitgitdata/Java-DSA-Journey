import java.util.Scanner;

public class InvertedRightTriangleUsingRecursion {
    static void pattern(int rows, int cols){
        if (rows == 0) {
            return;
        }
        if (cols < rows) {
            System.out.print("*");
            pattern(rows, cols + 1);
        }else{
            System.out.println();
            pattern(rows - 1, 0);
        }
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the triangle : ");
        int rows = sc.nextInt();
        pattern(rows, 0);
        sc.close();
    } 
}
