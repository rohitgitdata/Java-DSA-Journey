import java.util.*;

public class BinarySearchWithSorting {
    static int[] sort(int[] arr){
        //Copying a new array
        int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sorted[i] = arr[i];
        }
        //Use Insertion sorting here
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if( sorted[j] < sorted[j - 1]){
                    int temp = sorted[j];
                    sorted[j] = sorted[j - 1];
                    sorted[j - 1] = temp;
                }else{
                    break;
                }
            }
        }
        return sorted;
    }
    static boolean search(int[] res,int target){
        int start = 0;
        int end = res.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (res[mid] > target ) {
                end = mid - 1;
            } else if(res[mid] < target){
                start = mid + 1;
            } else{
                return true;
            }
            
        }
        return false;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========Program Started==========");
        System.out.print("Enter the number of elements of the array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("! ENTER ARRAY ELEMENTS!");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element "+ (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Our Original Array is : " + Arrays.toString(arr));
        int[] res = sort(arr);
        System.out.println("Sorted Array is : "+ Arrays.toString(res));
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        boolean ans = search(res, target);
        if (ans) {
            System.out.println("Element found");
        } else {
            System.out.println("Your written element isn't found");
        }
        System.out.println("-----------Program Completed Successfully-------------");
        sc.close();
    }
}