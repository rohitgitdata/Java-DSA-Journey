import java.util.Scanner;

public class FibbonacciPattern {
    static int fibIndex = 0;
    static void pattern(int rows, int cols){
    if (rows == 0) {
            return;
        }
        if (cols < rows) {
            pattern(rows, cols + 1);

            System.out.print(fibonacci(fibIndex) + " ");
            fibIndex++;
        }else{
            pattern(rows - 1, 0);
            System.out.println(); 
        }  
    }  
    static int fibonacci(int cols){
        if (cols < 2) {
            return cols;
        }
        int prev1 = 1;
        int prev2 = 0;
        for (int i = 2; i <=cols; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
            
        }
        return prev1;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int rows = sc.nextInt();
        pattern(rows, 0);
        sc.close();
    }
}
