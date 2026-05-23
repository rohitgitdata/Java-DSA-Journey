import java.util.*;

public class SearchInRange {
    static int element(int[] arr, int target, int start, int end){
        for (int i = start; i<= end; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Our array is : " + Arrays.toString(arr));
        System.out.print("Enter the target : " );
        int target = sc.nextInt();
        System.out.print("Enter the Starting Index : " );
        int start = sc.nextInt();
        System.out.print("Enter the Ending Index : " );
        int end = sc.nextInt();
        int res = element(arr, target,start,end);
        if (res != -1) {
            System.out.println("Element found at index number " + res);
        } else {
            System.out.println("Element is not found in the array");
        }
        sc.close();
    }
}
