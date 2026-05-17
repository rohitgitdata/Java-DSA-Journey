import java.util.Scanner;

public class RichestCustomerWealthRevision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Richest customer wealth====");
        System.out.print("Enter the number of costumers : ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of accounts : ");
        int cols = sc.nextInt();
        int[][] accounts = new int[rows][cols];
        
        System.out.println("=====ACCOUNT====");
        for (int i = 0; i < rows; i++) {
            System.out.println("Details for Costumer " + (i + 1) + " : ");
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter ammount for account " + (j + 1) + " : ");
                accounts[i][j] = sc.nextInt();
            }
        }
        int maxWealth = 0;
        int richCustomer = 0;
        System.out.println();
        System.out.println("======Total ammount======");
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = accounts[i][j] + sum;
            }
            
            System.out.println("Total Wealth of Costumer " + (i + 1) + " : " + sum);
            if (sum > maxWealth) {
                maxWealth = sum;
                richCustomer = (i + 1);
            }
        }
        System.out.println();
        System.out.println("======RESULT======");
        System.out.println("So, the richest costumer is Costumer: " + richCustomer + " with total wealth : " + maxWealth );

        sc.close();
    }
}
