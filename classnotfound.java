package exceptions;

public class classnotfound {
    public static void main(String[] args) {

        try {
            Class.forName("sat.exceptions.moha");
            ClassLoader.getSystemClassLoader().loadClass("sat.exceptions.moha");

        } catch (ClassNotFoundException e) {
           
            e.printStackTrace();
        }
    }
}
    

