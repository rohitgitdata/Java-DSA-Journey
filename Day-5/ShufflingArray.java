import java.util.*;

class InnerShufflingArray {
    public static int[] shuffle(int[] arr, int n){
        int[] ans = new int[arr.length];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = arr[i];
            ans[2 * i + 1] = arr[i + n];
        }
        return ans;
    }
    
}public class ShufflingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========PROGRAM START=========");
         System.out.print("Enter the number of elements : ");
        int element = sc.nextInt();
        int[] arr = new int[element];

        for (int i = 0; i < element; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number for shuffling : ");
        int n = sc.nextInt();
System.out.println("==============RESULT===========");
        System.out.println("Original Array : " + Arrays.toString(arr));
        int[] Result = InnerShufflingArray.shuffle(arr,n);
       System.out.println("The Shuffled array is : " + Arrays.toString(Result));
        
        sc.close();
    }
}
