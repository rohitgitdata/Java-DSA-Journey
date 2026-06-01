import java.util.Scanner;

public class ConvertToLowerCase {
   public String toLowerCase(String s) {

        String ans = "";

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            ans += Character.toLowerCase(ch);
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        ConvertToLowerCase obj = new ConvertToLowerCase();
        String result = obj.toLowerCase(s);
        System.out.println("The Converted String is : " + result);
        sc.close();
    }
}    

