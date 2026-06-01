import java.util.Scanner;

public class CharacterFrequency {
    static int count(String str, char target){
        int freq = 0;
        char t = Character.toLowerCase(target);
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == t) {
                freq++;
            }
        }
        return freq;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.print("Enter target Character : ");
        char target = sc.next().charAt(0);
        int ans = count(str, target);
        System.out.println("So, The Freq of " + target + " is : " + ans);
        sc.close();
    }   
}
