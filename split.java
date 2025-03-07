package strings;

public class split {
    public static void main(String[] args) {
        String ss = "lakshmi satya";
        
        String[] spl = ss.split(" "); 

        for (String i : spl) {
            System.out.println("Splitted : " + i);
        }
    }
    
}
