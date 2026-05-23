import java.util.Scanner;

public class Factorial {
    static int fact(int n){
        if (n <= 0) {
            return 1;
        }else{
        return (n * fact(n - 1));}
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======Program Started=======");
        boolean flag = true;
        while (flag) {
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("The factorial of "+num + " is : " + fact(num));
            System.out.print("You want to continue? (Y/N) :");
            String ch = sc.next();
            if (ch.equalsIgnoreCase("N")) {
                flag = false;
            }
        }
        System.out.println("=========Program Completed==========");
        sc.close();
    }
}
