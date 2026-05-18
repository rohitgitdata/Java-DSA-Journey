public class Starpattern {
    public static void main(String[] args) {
        System.out.println("This is Right Angled star pattern : ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Reverse right angle triangle : ");
        for (int i = 5; i >=0; i--) {
            for (int j = 0; j < i; j++) {
                 System.out.print("* ");
            }
            System.out.println();
        }
    }
}
