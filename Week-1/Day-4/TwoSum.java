import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("==== === === === ====");
        System.out.print("Enter the target : ");
        int target = sc.nextInt();
        boolean found = false;
        System.out.println("=======Result=======");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("The target is found at indexes : " + i + " and " + j);
                    found = true;
                }
                }
            }
            if (!found) {
                System.out.println("Invalid target !");
            }
        sc.close();
    }    
}
