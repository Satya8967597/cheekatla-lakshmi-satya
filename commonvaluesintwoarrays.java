package arrays;

import java.util.Arrays;

public class commonvaluesintwoarrays {
    static void commonValues(int[] arr1, int[] arr2) {
        for (int k : arr1) {
            for (int i : arr2) {
               if (k == i) {
                    System.out.println("Common values : " + k);
                }
            }
        }
    }

    public static void main(String[] args) {
      int[] arr1 = {1, 22, 33, 4, 55};
      int[] arr2 = {4, 55, 7, 1, 88};
        commonValues(arr1, arr2);
    }
}
    

