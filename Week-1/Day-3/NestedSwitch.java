import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("======Program started======");
        System.out.print("Enter the Day : ");
        int num = sc.nextInt();
        System.out.print("Enter day's term in month : ");
        int n = sc.nextInt();
System.out.println("So,The day you select is : ");
        switch (num) {
            case 1:
                System.out.println("Sunday");
                System.out.println("=====Details of the day=====");
                System.out.print("This is a : ");
                                switch (n) {
                    case 1:
                        System.out.println("Holiday ");
                        break;
                    case 2:
                        System.out.println("Holiday ");    
                        break;
                    case 3:
                        System.out.println("Holiday ");
                        break;
                    case 4:
                        System.out.println("Holiday ");    
                        break;    
                    default:
                        System.out.println("Enter a valid term");
                        break;
                }
                break;
            case 2:
                System.out.println("Monday");
                System.out.println("=====Details of the day=====");
                System.out.print("This is a : ");
                                switch (n) {
                    case 1:
                        System.out.println("Working day ");
                        break;
                    case 2:
                        System.out.println("Working day ");    
                        break;
                    case 3:
                        System.out.println("Working day ");
                        break;
                    case 4:
                        System.out.println("Working day ");    
                        break;    
                    default:
                        System.out.println("Enter a valid term");
                        break;
                }
                break;
            case 3:
                System.out.println("Tuesday");
                System.out.println("=====Details of the day=====");
                System.out.print("This is a : ");
                                switch (n) {
                    case 1:
                        System.out.println("Working day ");
                        break;
                    case 2:
                        System.out.println("Working day ");    
                        break;
                    case 3:
                        System.out.println("Working day ");
                        break;
                    case 4:
                        System.out.println("Working day ");    
                        break;    
                    default:
                        System.out.println("Enter a valid term");
                        break;
                }
                break;    
            case 4:
                System.out.println("Wednesday");
                System.out.println("=====Details of the day=====");
                System.out.print("This is a : ");
                                switch (n) {
                    case 1:
                        System.out.println("Working day ");
                        break;
                    case 2:
                        System.out.println("Working day ");    
                        break;
                    case 3:
                        System.out.println("Working day ");
                        break;
                    case 4:
                        System.out.println("Working day ");    
                        break;    
                    default:
                        System.out.println("Enter a valid term");
                        break;
                }
                break;
            case 5:
                System.out.println("Thursday");
                System.out.println("=====Details of the day=====");
                System.out.print("This is a : ");
                                switch (n) {
                    case 1:
                        System.out.println("Working day ");
                        break;
                    case 2:
                        System.out.println("Working day ");    
                        break;
                    case 3:
                        System.out.println("Working day ");
                        break;
                    case 4:
                        System.out.println("Working day ");    
                        break;    
                    default:
                        System.out.println("Enter a valid term");
                        break;
                }
                break;
            case 6:
                System.out.println("Friday");
                System.out.println("=====Details of the day=====");
                System.out.print("This is a : ");
                                switch (n) {
                    case 1:
                        System.out.println("Working day ");
                        break;
                    case 2:
                        System.out.println("Working day ");    
                        break;
                    case 3:
                        System.out.println("Working day ");
                        break;
                    case 4:
                        System.out.println("Working day ");    
                        break;    
                    default:
                        System.out.println("Enter a valid term");
                        break;
                }
                break;
            case 7:
                System.out.println("Saturday");
                System.out.println("=====Details of the day=====");
                System.out.print("This is a : ");
                switch (n) {
                    case 1:
                        System.out.println("Working day ");
                        break;
                    case 2:
                        System.out.println("Holiday ");    
                        break;
                    case 3:
                        System.out.println("Working day ");
                        break;
                    case 4:
                        System.out.println("Holiday ");    
                        break;    
                    default:
                        System.out.println("Enter a valid term");
                        break;
                }
                break;    
            default:
                System.out.println("Enter a valid day");
                break;
        }
        System.out.println("=========Program completed=========");
        System.out.print("Do you want to continue (y/n) : ");
        String ch = sc.next();
        if (ch.equalsIgnoreCase("n")) {
            flag = false;
        }else{
            flag = true;
        }
    }
        sc.close();
    }    
}
