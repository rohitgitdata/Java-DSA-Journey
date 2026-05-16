import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
        System.out.println(" = = = = = = = = SIMPLE CALCULATOR = = = = = = = =");
         
        System.out.print("Enter the first number :");
        float a = sc.nextFloat();

        System.out.print("Enter the second number :");
        float b = sc.nextFloat();
        System.out.print("Enter the operation (add,sub,mul,div) :");
        String operate = sc.next();
       
            switch (operate.toLowerCase()) {
            case "add":
               float Addition = a + b;
               System.out.println("The Sum is :" + Addition);
            break;
            case "sub":
               float Subrtract = a - b;
               System.out.println("The Difference is :" + Subrtract);
            break;
             case "mul":
               float Multiplication = a * b;
               System.out.println("The Product is :" + Multiplication);
            break;
             case "div":
                if(b == 0){
                  System.out.println("Cannot Divide by zero");}
                else{
                  float Division = a / b;
                  System.out.println("The Quotient is :" + Division);}
            break;
            
        
            default:
                System.out.println("Invalid operation entered");
                break;

               
        }
        System.out.println("Thank you for using my calculutor !!!"); 
       System.out.print("Do you want to continue (yes/no) : ");
       String choice = sc.next();
       if(choice.equals("no")){
        flag = false;
       }

        }
         sc.close();
        
    }
    
}
