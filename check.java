package collections;

import java.util.ArrayList;

public class check {
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

        int index=5;

        if (index < list.size()) {
            System.out.println("Element at index " + index + " is: " + list.get(index));
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }

     }
}
