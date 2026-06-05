import java.util.*;

public class SelectioSortUsingRecursion {
    static void sorting(int[] arr, int last, int index, int max){
        if (last == 0) {
            return;
        }
        if (index < last) {
            if (arr[index] > arr[max]) {
                sorting(arr, last, index + 1, index);
            }else{
                sorting(arr, last, index + 1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[index - 1];
            arr[index - 1] = temp;
            sorting(arr, last - 1, 0, 0);
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
        sorting(arr,arr.length, 0, 0);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
        sc.close();
    }
}
