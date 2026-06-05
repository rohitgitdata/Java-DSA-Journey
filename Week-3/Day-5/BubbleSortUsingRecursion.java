import java.util.*;

public class BubbleSortUsingRecursion {
    static void sorting(int[] arr, int last, int index){
        if (last == 0) {
            return;
        }
        if (index < last) {
            if (arr[index] > arr[index + 1] ) {
                int temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
            }
            sorting(arr, last, index + 1);
        }
        else{
            sorting(arr, last - 1, 0);
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the elements of an array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array : " + Arrays.toString(arr));
        sorting(arr, arr.length - 1, 0);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
        sc.close();
     }   

}
