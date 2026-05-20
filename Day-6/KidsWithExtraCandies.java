import java.util.Scanner;

public class KidsWithExtraCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter extra : ");
        int extra = sc.nextInt();
        System.out.print("Enter the number of elements of an Array : ");
        int n = sc.nextInt();
        
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1)+ " : ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }    
        }
        for (int element : arr) {
            if (element + extra >= max) {
                System.out.print("True ");
            } else {
                System.out.print("False ");
            }
        }
         sc.close();
    }
}
