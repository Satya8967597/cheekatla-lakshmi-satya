package exceptions;

public class generatearthexcep {
    public static void main(String[] args) {
        int a = 10, b = 0, c;
        try {
            
            c = a / b;

           
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught!");
            e.printStackTrace();
        }
    }
}
    

