package collections;

import java.util.ArrayList;

public class particularindex {
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

        String element = list.get(1);
        System.out.println("Element at index 1: " + element);
     }

    
}
