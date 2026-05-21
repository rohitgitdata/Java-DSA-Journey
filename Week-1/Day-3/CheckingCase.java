import java.util.Scanner;

public class CheckingCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character for Checking : ");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Entered character is in lowercase");
        } else {
            System.out.println("Entered character is in uppercase");
        }
        sc.close();
    }    
}
