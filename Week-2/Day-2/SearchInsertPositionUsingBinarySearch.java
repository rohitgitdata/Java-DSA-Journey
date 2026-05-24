import java.util.*;

public class SearchInsertPositionUsingBinarySearch {
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = (mid - 1);
            }else if(target > nums[mid]){
                    start = (mid +  1);
                }else{
                    return mid;
                }
            }
            return start;
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
        int ans = searchInsert(arr, target);
        System.out.println("Search Insert Position : " + ans);
        sc.close();
    }
}

