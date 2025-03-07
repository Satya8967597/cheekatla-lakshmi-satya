package exceptions;

public class numberformet {
    public static void main(String[] args) {

        String str = "768reC";
        try {
          
            int x = Integer.parseInt(str);
            int y = Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException ");
           
            e.printStackTrace();
        }
    }
}
    

