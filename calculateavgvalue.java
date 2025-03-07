package arrays;

public class calculateavgvalue {
    static void avgArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        int average = sum / arr.length;
        System.out.print("The Average value of array is " + average);
    }

    public static void main(String[] args) {
        int[] arr = {4, 22, 40, 8, 29};
        avgArray(arr);
    }
}
    

