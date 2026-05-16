import java.util.Scanner;

public class RichestCustomerWealth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers (rows) : ");
        int rows = sc.nextInt();

        System.out.print("Enter number of bank accounts (columns) : ");
        int cols = sc.nextInt();

        int[][] accounts = new int[rows][cols];

        System.out.println("\n===== Enter Wealth Details =====");

        for (int i = 0; i < rows; i++) {

            System.out.println("\nCustomer " + (i + 1) + " : ");

            for (int j = 0; j < cols; j++) {

                System.out.print("Enter balance of account " + (j + 1) + " : ");

                accounts[i][j] = sc.nextInt();
            }
        }

        int maxWealth = 0;
        int richCustomer = 0;

        for (int i = 0; i < accounts.length; i++) {

            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {

                sum += accounts[i][j];
            }

            System.out.println("Total wealth of customer "
                    + (i + 1) + " is : " + sum);

            if (sum > maxWealth) {

                maxWealth = sum;
                richCustomer = i + 1;
            }
        }

        System.out.println("\n===== Final Result =====");

        System.out.println("Richest customer is Customer "
                + richCustomer);

        System.out.println("Maximum wealth is : "
                + maxWealth);

        sc.close();
    }
}