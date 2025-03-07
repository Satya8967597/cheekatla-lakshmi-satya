package collections;

import java.util.ArrayList;

public class specificindex {
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

        list.add(2, "Blueberry");
        System.out.println("After adding 'Blueberry' at index 2: " + list);
     }

    
}
