import java.util.*;

public class ArraList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 9 ; i++) {
            System.out.print("Enter the " + (i + 1) + " element : ");
            list.add(sc.nextInt());
        }
        System.out.println(list);
        sc.close();
    }    
}
