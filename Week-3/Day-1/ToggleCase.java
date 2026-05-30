import java.util.Scanner;
public class ToggleCase {
    static String toggle(String s){
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {
                ans += Character.toUpperCase(ch);
            } else if(Character.isUpperCase(ch)){
                ans += Character.toLowerCase(ch);
            }else{
                ans += ch;
            }
        }
        return ans;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        String result = toggle(s);
        System.out.println("The Toggle String is : " + result);
        sc.close();
    }
}
