import java.util.Scanner;

public class CountVowelsAndConsonants {
    static int[] count(String s){
        int countV = 0;
        int countC = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') {
                countV++;
            }else if(Character.isLetter(ch)){
                countC++;
            }
        }
        return new int[]{countC,countV};
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        int[] ans = count(s);
        int vowels = ans[1];
        int consonants = ans[0];
        System.out.println("The total number of vowels are : " + vowels  + " And total number of consonants are : " + consonants);
        sc.close();
    }
}
