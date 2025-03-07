package exceptions;

public class arrayindexout {
    public static void main(String[] args) {
        String[] arr = {"Sharan", "Rahul", "Leo", "Arun"};
        try {
            System.out.println(arr[7]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("ArrayIndexOutOfBoundsException caught");
            e.printStackTrace();
        }
    }
}
    

