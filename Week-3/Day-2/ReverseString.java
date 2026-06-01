import java.util.Arrays;

public class ReverseString {

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

        char[] arr = {'h','e','l','l','o'};

        System.out.println("Original Array : " + Arrays.toString(arr));

        reverse(arr);

        System.out.println("Reversed Array : " + Arrays.toString(arr));
    }
}