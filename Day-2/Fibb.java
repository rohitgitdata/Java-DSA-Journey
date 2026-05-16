import java.util.Scanner;

public class Fibb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("The fibbonacci number at term 0 is : 0");
        } else if(num == 1){
            System.out.println("The fibbonacci number at term 1 is : 1");
        }else{

        int a = 0;
        int b = 1;
        int count = 2;
        while (count < num) {
            int temp = b;
            b = b + a;
            a = temp;
            count ++;
            
        }
    
        System.out.println("The fibbonacci number at term " + num + " is : " + b);
        sc.close();
    }
         
    }
}
