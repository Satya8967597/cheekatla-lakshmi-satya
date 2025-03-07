package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arraycopy {
     static void copyingArray(int[] arr) {
              int[] copy = arr;
        System.out.println("Array after copying to c = " + Arrays.toString(copy));
    }

    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);
            System.out.print("Enter the number of elements you want to store : ");
        n = obj.nextInt();
             System.out.println("Enter the Elements of the array ");
        int[] my_arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("my_arr[%d] = ", i);
            my_arr[i] = obj.nextInt();
        }
        System.out.println("my_arr = " + Arrays.toString(my_arr));
        copyingArray(my_arr);
    }
}
    

