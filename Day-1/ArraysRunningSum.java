public class ArraysRunningSum {
    public static void main(String[] args) {
        System.out.println("= = = = = = RUNNING SUM PROGRAM = = = = = =");
    int runningsum = 0;
    int []arr = {1,2,3,4,5};
    

    System.out.print("Original array : ");
    for(int i = 0;i<arr.length;i++){ 
        System.out.print(arr[i] + " ");
    }
    for(int i=0;i<arr.length;i++){
        runningsum +=arr[i];
        arr[i] = runningsum;
    }
    System.out.println();
    System.out.print("Running sum array is : ");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }

    }
}
