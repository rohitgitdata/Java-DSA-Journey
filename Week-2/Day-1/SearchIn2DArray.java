import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
        static int[] search(int[][] arr,int target){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == target) {
                        return new int[]{i,j};
                    }
                }
            }
            return new int[]{-1,-1};
        }
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of rows : ");
            int rows = sc.nextInt();
            System.out.print("Enter the number of cols : ");
            int cols = sc.nextInt();
            int[][] arr = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                System.out.println("Enetr row "+ (i + 1)  + " : ");
                for (int j = 0; j < cols; j++) {
                    System.out.print("Enter element " + (j + 1) + " : ");
                    arr[i][j] = sc.nextInt();
                }
            }
             System.out.println("Original array : " );
            for (int[] element : arr) {
               
                System.out.println(Arrays.toString(element));
            }
            
            System.out.print("Enter target : ");
            int target = sc.nextInt();
            int[] res = search(arr,target);
            if (res[0] != -1) {
                System.out.println("Element Found at row " + res[0] + " and column "+ res[1]);
            } else {
                System.out.println("Element not found");
            }
            sc.close();
        }
}
