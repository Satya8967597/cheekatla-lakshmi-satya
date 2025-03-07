package exceptions;

public class arithmeticexp {
    public static void main(String[] args) {
        int a = 10, b = 0, c;
        try {
            System.out.println("Inside try block");
            c = a / b;
            System.out.println("c = " + c);
        }
        // handles the Arithmetic Exception
        catch (java.lang.ArithmeticException e) {
            System.out.println("Handling the Arithmetic exception using try-catch block");
        }

        // generating Arithmetic Exception without exception handling
        c = a / b;
        System.out.println("without exception handling");
    }
}
