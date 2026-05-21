import java.util.Arrays;

public class HighestAltitude {

    public static int largestAltitude(int[] gain) {

        int sum = 0;
        int max = 0;

        for(int i = 0; i < gain.length; i++) {

            sum += gain[i];

            if(sum > max) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] gain = {-5, 1, 5, 0, -7};

        System.out.println("Gain Array : " + Arrays.toString(gain));

        int result = largestAltitude(gain);

        System.out.println("Highest Altitude : " + result);
    }
}