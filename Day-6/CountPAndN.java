import java.util.Scanner;

public class CountPAndN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) +  " : ");
            arr[i] = sc.nextInt();
        }
        int countPostive = 0;
        int countNegative = 0;
        for (int element : arr) {
            if (element > 0) {
                countPostive++;
            } else {
                countNegative++;
            }
        }
        System.out.println("Total positive elements in array : " + countPostive );
        System.out.println("Total negative elements in array : " + countNegative);
        sc.close();
    }    
}
