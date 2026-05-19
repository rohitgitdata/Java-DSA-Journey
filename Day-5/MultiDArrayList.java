import java.util.*;
public class MultiDArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Details for  " + (i + 1) + " row : ");
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the " + (j + 1) + " element : ");
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println("The 2-D List is : " + list);
        sc.close();
    }    
}
 