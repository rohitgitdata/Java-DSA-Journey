public class ReverseString {
    static String rev(String name){
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        String name = "Rohit Kumar";
        String ans = rev(name);
        System.out.println("The Reverse of the String is : " + ans);
    }    
}
