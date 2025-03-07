package collections;

import java.util.ArrayList;

public class elementpresent {
     public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        list.add("Honeydew");
        list.add("Kiwi");
        list.add("Lemon");

        String searchElement = "Grape";
        if (list.contains(searchElement)) {
            System.out.println("'" + searchElement + "' is present in the ArrayList.");
        } else {
            System.out.println("'" + searchElement + "' is not present in the ArrayList.");
        }
    }

    
}
