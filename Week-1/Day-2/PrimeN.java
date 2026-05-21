import java.util.Scanner;

public class PrimeN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int c = 2;
            System.out.print("Enter the number : ");
            int num = sc.nextInt();
            boolean isPrime = true;
            if(num <= 1) {
                isPrime = false;
            }else{
                while (c * c <= num) {
                    if (num % c == 0){
                        isPrime = false;
                        break;
                    }
                    c++;
                }
            }
                if (isPrime) {
                    System.out.println("This is a prime number");
                } else {
                    System.out.println("This is not a prime number");
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