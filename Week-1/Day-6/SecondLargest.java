import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) +  " : ");
            arr[i] = sc.nextInt();
        }
        int largest = 0;
        int secondlargest = 0;
        for (int element : arr) {
            if (element > largest) {
                secondlargest = largest;
                largest = element;
            } else if (element > secondlargest && element!= largest  ) {
                secondlargest = element;
            }
        }
        System.out.println("The Second largest element of the array is : " + secondlargest);
        sc.close();
    }    
}
