package arrays;

public class addintegervalues {
    static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        return sum;
    }
public static void main(String[] args) {
      int[] arr = {40, 80, 30, 20, 500};
        for (int i : arr)
            System.out.print(i + " + ");
        System.out.print(" =  " + arrSum(arr));
    }
}
    

