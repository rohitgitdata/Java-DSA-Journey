import java.util.Scanner;

public class RevisedPattern3 {
    static void pattern(int totalRows, int rows){
        if (rows > totalRows) {
            return;
        }
        printSpace(totalRows - rows);
        printStars(rows);
        System.out.println();
        pattern(totalRows, rows + 1);
        
    }    
    static void printSpace(int n){
        if (n == 0) {
            return;
        }
        System.out.print(" ");
        printSpace(n - 1);
    }
    static void printStars(int n){
        if (n == 0) {
            return;
        }
        System.out.print("*");
        printStars(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        pattern(rows, 1);
        sc.close();
    }
}
