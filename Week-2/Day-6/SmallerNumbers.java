import java.util.*;

public class SmallerNumbers {

    static int[] smallerNumbersThanCurrent(int[] nums){

        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){

            int count = 0;

            for(int j = 0; j < nums.length; j++){

                if(nums[j] < nums[i]){

                    count++;
                }
            }

            result[i] = count;
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