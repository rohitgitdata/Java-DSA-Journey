import java.util.*;

public class OrderAgnosticBS {
    static int searchElement(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return mid;
            }     
            if (isAsc) {
                if (arr[mid] < target) {
                start = mid + 1;
                } else if(arr[mid] > target){
                end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                end = mid - 1;
                } else if(arr[mid] > target){
                start = mid + 1;
                }
            }


       /*  if (arr[start] < arr[end]) {
            //Ascending
            if (arr[mid] < target) {
                start = mid + 1;
            } else if(arr[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        } else {
            //Decending
            if (arr[mid] < target) {
                end = mid - 1;
            } else if(arr[mid] > target){
                start = mid + 1;
            }else{
                return mid;
            } 
        } */
    }
    
        return -1;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("=========Program Started==========");
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
        int ans = searchElement(arr, target);
        if (ans!= -1) {
            System.out.println("Element found at : " + ans);
        } else {
            System.out.println("Your written element isn't found");
        }
        System.out.println("-----------Program Completed Successfully-------------");
        sc.close();
    }
}
