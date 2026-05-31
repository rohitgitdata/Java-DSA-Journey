import java.util.*;

public class FirstAndLastPosition {

    static int search(int[] nums, int target, boolean findStartIndex){

        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target < nums[mid]){

                end = mid - 1;

            }else if(target > nums[mid]){

                start = mid + 1;

            }else{

                ans = mid;

                if(findStartIndex){

                    end = mid - 1;

                }else{

                    start = mid + 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted array elements : ");

        for(int i = 0; i < nums.length; i++){

            nums[i] = sc.nextInt();
        }

        System.out.println("Array : " + Arrays.toString(nums));

        System.out.print("Enter target : ");
        int target = sc.nextInt();

        int first = search(nums, target, true);

        int last = search(nums, target, false);

        System.out.println("First Position : " + first);
        System.out.println("Last Position : " + last);
        System.out.println("So, we have total " + ((last + 1)-first) + " no. of " + target );

        sc.close();
    }
}