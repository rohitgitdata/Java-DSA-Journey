import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter " + (i + 1) + "th element of array : ");
            num[i] = sc.nextInt();
        }
        // Using for Each loop
        for (int i : num) {
            System.out.print(i + " ");
        }
        sc.close();
    }    
}
