import java.util.Scanner;
import java.util.Arrays;

public class SearchInsertPosition {

    static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                return i;
            }

            if (target < nums[i]) {
                return i;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            nums[i] = sc.nextInt();
        }

        System.out.println("Original array : " + Arrays.toString(nums));

        System.out.print("Enter target : ");
        int target = sc.nextInt();

        int res = searchInsert(nums, target);

        System.out.println("Search Insert Position is : " + res);

        sc.close();
    }
}