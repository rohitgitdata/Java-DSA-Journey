import java.util.Scanner;

public class RecursiveBinarySearch {

    static int binarySearch(int[] nums, int target, int start, int end) {

        // Base condition
        if (start > end) {
            return -1;
        }

        // Find middle index
        int mid = start + (end - start) / 2;

        // Element found
        if (nums[mid] == target) {
            return mid;
        }

        // Search in left half
        if (nums[mid] > target) {
            return binarySearch(nums, target, start, mid - 1);
        }

        // Search in right half
        return binarySearch(nums, target, mid + 1, end);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = {2, 4, 6, 8, 10, 12, 14, 16};

        System.out.print("Enter target element : ");
        int target = sc.nextInt();

        int ans = binarySearch(nums, target, 0, nums.length - 1);

        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index : " + ans);
        }

        sc.close();
    }
}