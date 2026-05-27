import java.util.*;

public class HeightChecker {

    static int checkHeight(int[] heights){

        int[] sorted = new int[heights.length];

        // Copy original array
        for(int i = 0; i < heights.length; i++){

            sorted[i] = heights[i];
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

        // Compare arrays
        int count = 0;

        for(int i = 0; i < heights.length; i++){

            if(heights[i] != sorted[i]){

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students : ");
        int n = sc.nextInt();

        int[] heights = new int[n];

        System.out.println("Enter heights : ");

        for(int i = 0; i < heights.length; i++){

            heights[i] = sc.nextInt();
        }

        System.out.println("Original Array : " + Arrays.toString(heights));

        int ans = checkHeight(heights);

        System.out.println("Number of wrong positions : " + ans);

        sc.close();
    }
}