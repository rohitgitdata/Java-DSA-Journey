import java.util.Arrays;
import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // In 1-D array
        System.out.println("=======1-D array=======");
        System.out.println("====Taking inputs for the 1-D array====");
        int [] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter " + (i + 1) + " element of array : ");
            num[i] = sc.nextInt();
        }
        // Using for Each loop, here element represents elements of a array named num
        System.out.println("So, the 1-D array is : ");
        for (int element : num) {
            System.out.print(element + " ");
        }

        // in 2-D array
        System.out.println();
        System.out.println("=======2-D array=======");
        System.out.println("====Taking inputs for the 2-D array====");
        int[][] num2 = {
                        {1, 2, 3},
                        {4, 5},
                        {6, 7, 8, 9}    };
        System.out.println("Modifying the Existing array : ");
        for (int rows = 0; rows < num2.length; rows++) {
            System.out.println("Enter the row " + (rows + 1) + " : ");
            for (int cols = 0; cols < num2[rows].length; cols++) {
                System.out.print("Enter the " + (cols + 1) + " element of row " + (rows + 1) + " : ");
                num2[rows][cols] = sc.nextInt();
            }
        }
        System.out.println("So, the 2-D array is : ");
        for (int[] element : num2) {
            System.out.println("The new 2-D array is : " + Arrays.toString(element));
        }
        sc.close();
    }
}