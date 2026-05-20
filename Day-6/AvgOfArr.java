import java.util.Arrays;
import java.util.Scanner;

public class AvgOfArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of an Array : ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1)+ " : ");
            arr[i] = sc.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The original array is : "+ Arrays.toString(arr));
        double avg = sum/n;
        System.out.println("The avg of the array is : " + avg);
        sc.close();
    }
}
