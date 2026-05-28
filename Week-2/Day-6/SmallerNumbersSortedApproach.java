import java.util.*;

public class SmallerNumbersSortedApproach {

    static int[] smallerNumbersThanCurrent(int[] nums){

        int[] sorted = new int[nums.length];

        // Copy original array
        for(int i = 0; i < nums.length; i++){

            sorted[i] = nums[i];
        }

        // Bubble Sort
        for(int i = 0; i < sorted.length - 1; i++){

            boolean flag = false;

            for(int j = 1; j < sorted.length - i; j++){

                if(sorted[j] < sorted[j - 1]){

                    int temp = sorted[j];
                    sorted[j] = sorted[j - 1];
                    sorted[j - 1] = temp;

                    flag = true;
                }
            }

            if(!flag){
                break;
            }
        }

        int[] result = new int[nums.length];

        // Find first occurrence index in sorted array
        for(int i = 0; i < nums.length; i++){

            for(int j = 0; j < sorted.length; j++){

                if(nums[i] == sorted[j]){

                    result[i] = j;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements : ");

        for(int i = 0; i < nums.length; i++){

            nums[i] = sc.nextInt();
        }

        System.out.println("Original Array : " + Arrays.toString(nums));

        int[] ans = smallerNumbersThanCurrent(nums);

        System.out.println("Answer Array : " + Arrays.toString(ans));

        sc.close();
    }
}