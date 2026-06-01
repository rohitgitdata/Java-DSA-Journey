import java.util.Scanner;

public class TotalCharacterFrequency {
    static void countFrequency(String str){
        for (int i = 0; i < str.length(); i++) {
            boolean alreadyCounted = false;
            // Check previous duplicates
            for (int k = 0; k < i; k++) {
                if (Character.toLowerCase(str.charAt(i)) ==
                    Character.toLowerCase(str.charAt(k))) {
                    alreadyCounted = true;
                    break;
                }
            }
            // Skip duplicate characters
            if(alreadyCounted){
                continue;
            }
            int freq = 0;
            // Count frequency
            for (int j = 0; j < str.length(); j++) {
                if (Character.toLowerCase(str.charAt(i)) ==
                    Character.toLowerCase(str.charAt(j))) {
                    freq++;
                }
            }
            System.out.println("The freq of "
                    + str.charAt(i)
                    + " is : "
                    + freq);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        countFrequency(str);
        sc.close();
    }
}