package collections;

import java.util.ArrayList;

public class sizeof {

    

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

        int size = list.size();
        System.out.println("Size of the ArrayList: " + size);
     }

    
}
