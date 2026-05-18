import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int maxIndex = 0;
         int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            } 
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
       
        
        System.out.println("The smallest element in the array is : "+ min + ", at index no. : " + minIndex);
        System.out.println("The largest element in the array is : "+ max + ", at index no. : " + maxIndex);
        
        sc.close();
    }    
}