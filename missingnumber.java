package arrays;

import java.util.Arrays;

public class missingnumber {
     static void missingNumber(int[] arr) {
        Arrays.sort(arr);
        System.out.println("a[] = " + Arrays.toString(arr));
        int j = 0;
        for (int i = 1; i < 100; i++) {
            if (j < arr.length && i == arr[j])
                j++;
            else
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] my_arr = {67,89,45,23,32};
        missingNumber(my_arr);
    }
}
    

