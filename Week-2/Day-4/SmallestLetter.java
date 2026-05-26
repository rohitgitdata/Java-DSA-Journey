import java.util.*;

public class SmallestLetter {

    static char search(char[] letters, char target){

        int start = 0;
        int end = letters.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target >= letters[mid]){

                start = mid + 1;

            }else{

                end = mid - 1;
            }
        }

        return letters[start % letters.length];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of characters : ");
        int n = sc.nextInt();

        char[] letters = new char[n];

        System.out.println("Enter sorted characters : ");

        for(int i = 0; i < letters.length; i++){

            letters[i] = sc.next().charAt(0);
        }

        System.out.println("Characters Array : " + Arrays.toString(letters));

        System.out.print("Enter target character : ");
        char target = sc.next().charAt(0);

        char ans = search(letters, target);

        System.out.println("Next Greatest Letter is : " + ans);

        sc.close();
    }
}