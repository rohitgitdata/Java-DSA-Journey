import java.util.Arrays;

public class ReverseString1 {

    static void reverse(char[] arr){

        int start = 0;
        int end = arr.length - 1;

        while(start < end){

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String str ="hello";
        char[] arr = str.toCharArray();
        System.out.println("Original String : " + str);
        System.out.println("Original Character Array : " + Arrays.toString(arr));

        reverse(arr);

        System.out.println("Reversed Array : " + Arrays.toString(arr));
        String rev = new String(arr);
        System.out.println("Reverse String : " + rev);
    }
}