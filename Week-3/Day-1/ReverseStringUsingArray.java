public class ReverseStringUsingArray {
    static String rev(String name){
        char[]  arr = name.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }   
    public static void main(String[] args) {
        String name = "Rohit Kumar";
        String reverse = rev(name);
        System.out.println("The Reverse of the String is : " + reverse);
    } 
}
