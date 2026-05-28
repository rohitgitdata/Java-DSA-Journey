import java.util.*;
public class SortedInParity {
    static int[] search(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] % 2 == 0 && arr[j - 1] % 2 != 0){
                    swap(arr,j,j-1);
                }else if(arr[j]%2 == arr[j -1]%2 && arr[j]<arr[j - 1]){
                    swap(arr, j, j-1);
                }
                 else {
                    break;
                }
            }
        }
        return arr;
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
        int[] ans = search(arr);
        System.out.println("Parited sorted array is : "+ Arrays.toString(ans));
        sc.close();
    }      
}