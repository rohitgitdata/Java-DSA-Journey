import java.util.*;

public class CheckSortedArrayUsingRecursion {
    static boolean check(int[] arr, int index){
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        if (arr[index + 1] > arr[index]) {
            return check(arr, index + 1);
        }
        return true;
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array is : " + Arrays.toString(arr));
        boolean ans = check(arr, 0);
        if (ans) {
            System.out.println("Array is sorted");

        } else{
            System.out.println("Array is not sorted");
        }
        sc.close();
    }  
}
