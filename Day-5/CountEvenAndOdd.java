import java.util.Arrays;
import java.util.Scanner;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========PROGRAM START=========");
         System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
          if (arr[i]%2 == 0) {
            even++;
          } else {
            odd++;
          }  
        }
        System.out.println();
        System.out.println("========RESULT========");
        System.out.println("Original array is : " + Arrays.toString(arr));
        System.out.println("Total even number in the array are : " + even);
        System.out.println("And, total odd number in the array are : " + odd);
        sc.close();
    }    
}
