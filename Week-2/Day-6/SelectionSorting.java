import java.util.*;

public class SelectionSorting {
    static void search(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int start = 0;
            int last = arr.length - i -1;
            int maxIndex = max( arr, start, last);
            swap(arr, maxIndex, last);
        }
    }
    static int max(int[] arr,int start,int end){
        int top = start;
        for (int i = start; i <= end; i++) {
            if (arr[top] < arr[i]) {
                top = i;
            }
        }
        return top;
    }
    static void swap(int[] arr, int first , int last){
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;
    }   
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) +" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array : " + Arrays.toString(arr));
        search(arr);
        System.out.println("Sorted array is : "+ Arrays.toString(arr));
        sc.close();
    }
}
