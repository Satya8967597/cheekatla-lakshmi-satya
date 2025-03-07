package exceptions;

public class stringindexbound {
    public static void main(String[] args) {

        String str = "Satya";
        try {
            
            char Index = str.charAt(-1);

            char Indexm = str.charAt(11);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("StringIndexOutOfBoundsException caught");
            
            e.printStackTrace();
        }
    }
}
    

