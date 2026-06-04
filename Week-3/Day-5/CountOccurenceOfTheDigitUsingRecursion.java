import java.util.Scanner;

public class CountOccurenceOfTheDigitUsingRecursion {
    static int countOccurence(int num, int target){
        if (num == 0 && target == 0) {
            return 1;
        }
        return count(num, target, 0);
    }   
    static int count(int num, int target, int occ){
        if (num == 0) {
            return occ;
        }
        int rem = num % 10;
        if (rem == target) {
            return count(num/10, target, occ + 1);
        }else{
            return count(num/10, target, occ);
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int ans = countOccurence(num, target);
        if (ans == 0) {
            System.out.println("The target digit isn't available in the number");
        } else {
            System.out.println("The target digit occurs in the number : " + ans +" times");
        }
        sc.close();
    }
}
