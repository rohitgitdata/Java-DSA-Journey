import java.util.Scanner;

public class StringBuilderClass {
    static void modify(String str){
        StringBuilder sb = new StringBuilder(str);
        String n = "an";
        System.out.println(sb.replace(3, 5, n));
        System.out.println(sb.append(" Sir"));
        System.out.println(sb.reverse());
        
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        modify(str);
        sc.close();
    }
}
