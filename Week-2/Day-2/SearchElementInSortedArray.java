import java.util.Arrays;
import java.util.Scanner;

public class SearchElementInSortedArray {
    //returns index of the target element 
    static int searchElement(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target > arr[mid]) {
                start = (mid + 1);
            } else if (target < arr[mid]) {
                end = (mid - 1);
            }else{
                return mid;
            }
        }
        return -1;
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the sorted array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("! ENTER SORTED ARRAY ONLY !");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element "+ (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Our Sorted Array is : " + Arrays.toString(arr));
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int ans = searchElement(arr, target);
        if (ans!= -1) {
            System.out.println("Element found at : " + ans);
        } else {
            System.out.println("Your written element isn't found");
        }
        sc.close();
    }
}
