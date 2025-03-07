package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class insertspecificposition {
     static void insertElement(int[] arr, int index, int v) {
        for (int i = arr.length; i <= index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = v;
    }

    public static void main(String[] args) {
        int index, v;
        int[] my_arr = {67, 90, 38, 56, 34, 21, 78, 23, 54};
        System.out.println("original Array : my_arr = " + Arrays.toString(my_arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index number : ");
        index = sc.nextInt();
        System.out.printf("Enter the value to insert at index my_arr[%d] =  ", index);
        v = sc.nextInt();
        insertElement(my_arr, index, v);

        System.out.println("Array after Inserting Element : ");
        System.out.println("my_arr = " + Arrays.toString(my_arr));
    }
}
    

