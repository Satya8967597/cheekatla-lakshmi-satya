package strings;

public class searchingstring {
    public static void main(String[] args) {
        String si = "Searching index";
        int i1 = si.indexOf("index");
        int i2 = si.indexOf("h", 3);
        System.out.println("At Index : " + i1);
        System.out.println("At Index : " + i2);
    }
    
}
