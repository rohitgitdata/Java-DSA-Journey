import java.util.Scanner;

public class SearchInString {
    static boolean search(String name, char target){
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter the Character to check : ");
        char target = sc.next().charAt(0);
        boolean res = search(name, target);
        if (res)  {
            System.out.println("Character Found in the String");
        } else {
            System.out.println("Character not Found in the String");
        }
        sc.close();
    }
}
