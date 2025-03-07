package collections;

public class j {
    public static void main(String[] args) {
        
        java.util.HashMap<Integer, String> jala = new java.util.HashMap<>();

        jala.put(1, "Satya");
        jala.put(2, "mohan");
        jala.put(3, "Lakshmi");
        jala.put(4, "jana");
        jala.put(5, "jana");
        jala.put(6, "Manoj");
        jala.put(7, "sai");
        jala.put(8, "dinesh");
        jala.put(9, "sunny");
        jala.put(10, "Ravi");

        System.out.println("\nCopied all the elements of the jala to icfai :");

        java.util.HashMap<Integer, String> icfai = new java.util.HashMap<>();

        icfai.putAll(jala);
        System.out.println("icfai = " + icfai);
    }
}
