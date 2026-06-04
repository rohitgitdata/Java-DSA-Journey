import java.util.Scanner;

class CountDigitsThatDivideANumber {
    static int countDigits(int num) {
        if(num == 0){
            return 0;
        }
        return val(num,num, 0);
    }
    static int val(int originalNum, int num, int value){
        if(num == 0){
            return value;
        }
        int rem = num % 10;
        if(rem != 0){
        if(originalNum % rem == 0){
            return val(originalNum, num/10, value + 1);
        }else{
            return val(originalNum, num/10,value);
        }
        }else{
            return val(originalNum, num/10,value);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int ans = countDigits(num);
        System.out.println("In this number total " + ans + " digits divides it");
        sc.close();
    }
}