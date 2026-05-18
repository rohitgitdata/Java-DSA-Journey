import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = i;
            } 
        }
        System.out.println("The largest element in the array is : "+ max + ", at index no. : " + count);
        
        sc.close();
    }    
}
