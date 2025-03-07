package arrays;

public class betweennum {
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : arr) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] array = new int[99]; // Example: Missing number is 50
        int index = 0;
        
        for (int i = 1; i <= 100; i++) {
            if (i != 50) { // Assuming 50 is missing
                array[index++] = i;
            }
        }

        System.out.println("Missing number: " + findMissingNumber(array, 100));
    }
}
    

