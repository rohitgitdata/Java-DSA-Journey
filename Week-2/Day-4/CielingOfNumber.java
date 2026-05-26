import java.util.*;
    
public class CielingOfNumber{

    static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if (target > nums[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the sorted Array : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter element " +( i + 1) + " : ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Our orginal and sorted array is : " + Arrays.toString(nums));
        System.out.print("Enter target : ");
        int target = sc.nextInt();

        int ans = search(nums, target);

        System.out.println("The element is near index number : " + ans);

        sc.close();
    }
}