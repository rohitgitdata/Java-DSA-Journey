import java.util.Scanner;

public class PrimeN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int c = 2;
            System.out.print("Enter the number : ");
            int num = sc.nextInt();
            if(num <= 1){
                System.out.println("Number is not a prime number");
            }else{
                while (c * c <= num) {
                    if (num % c == 0) {
                        System.out.println("Number is not a prime number");
                        break;
                    }c++;
                }
            }if (c * c > num) {
                    System.out.println("Number is a prime number");
                }
            
        System.out.print("Enter 'yes' or 'no' for continue or stop : ");
        String stop = sc.next();
        if (stop.equalsIgnoreCase("no")) {
            flag = false;
        }    
        }
        sc.close();
    }
}