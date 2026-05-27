import java.util.*;

public class BuubleSorting {
    static void sort(int[] arr){
        boolean flag;
        for (int i = 0; i < arr.length - 1; i++) {
            flag = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j -1]) {
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j - 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
            break;
            }
        }
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
        sort(arr);
        System.out.println("Sorted array is : "+ Arrays.toString(arr));
        sc.close();
    }
}
