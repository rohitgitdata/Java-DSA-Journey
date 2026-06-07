// import java.util.*;
public class CountTheNumberOfConsistentStrings {
    static int countConsistentStrings(String allowed, String[] words) {

        int count = 0;

        for (int j = 0; j < words.length; j++) {

            String str = words[j];
            boolean valid = true;

            for (int k = 0; k < str.length(); k++) {

                char ch = str.charAt(k);
                boolean found = false;

                for (int i = 0; i < allowed.length(); i++) {

                    if (allowed.charAt(i) == ch) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};

        System.out.println(countConsistentStrings(allowed, words));
    }
}
