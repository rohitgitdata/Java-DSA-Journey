import java.util.Scanner;

public class DiffOfSumAndProd {
    int sum  = 0;
    int prod = 1;
    public int subtractProductAndSum(int n) {
        
        while(n > 0){
        int rem = n % 10;
        sum += rem;
        prod *= rem;
        n = n/10;
        }
        int diff = prod - sum;
        return diff;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        DiffOfSumAndProd obj = new DiffOfSumAndProd();
        int ans = obj.subtractProductAndSum(n);
        System.out.println("Sum of the digits is : " + obj.sum);
        System.out.println("Product of the digits is : "+ obj.prod);
        System.out.println("So the difference of the sum and the product of the digits is : "+ ans);
        sc.close();

    }    
}
