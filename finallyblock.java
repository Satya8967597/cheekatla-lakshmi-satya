package exceptions;

public class finallyblock {
    public static void main(String args[]) {
        try {
            
            int data = 10 / 0;
            System.out.println(data);
        }
        
        catch (ArithmeticException e) {
            System.out.println("Exception is handled");
            e.printStackTrace();
        }
       
        finally {
            System.out.println("finally the  block is always executed");
        }
        System.out.println("Main method  is ended");
    }
}
    

