import java.util.*;

public class DetectCapitalUse {

    static boolean detectCapitalUse(String word){

        int capitalCount = 0;

        for(int i = 0; i < word.length(); i++){

            char ch = word.charAt(i);

            if(Character.isUpperCase(ch)){

                capitalCount++;
            }
        }

        // ALL CAPS
        if(capitalCount == word.length()){

            return true;
        }

        // all lowercase
        else if(capitalCount == 0){

            return true;
        }

        // only first capital
        else if(capitalCount == 1 && Character.isUpperCase(word.charAt(0))){

            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word : ");

        String word = sc.nextLine();

        boolean ans = detectCapitalUse(word);

        if (ans) {
            System.out.println("Valid String");
        } else {
            System.out.println("Invalid String");
        }

        sc.close();
    }
}