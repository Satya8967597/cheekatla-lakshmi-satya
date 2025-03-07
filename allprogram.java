package collections;

import java.util.HashSet;

public class allprogram {
      public static void main(String[] args) {
        // Create a HashSet of type String
        HashSet<String> set = new HashSet<>();

        // Add at least 10 elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Elderberry");
        set.add("Fig");
        set.add("Grape");
        set.add("Honeydew");
        set.add("Kiwi");
        set.add("Lemon");

        // 1. Display the HashSet
        System.out.println("Initial HashSet: " + set);

        // 2. Add an element to the HashSet
        set.add("Mango");
        System.out.println("After adding 'Mango': " + set);

        // 3. Check if an element exists in the HashSet
        String searchElement = "Grape";
        if (set.contains(searchElement)) {
            System.out.println("'" + searchElement + "' is present in the HashSet.");
        } else {
            System.out.println("'" + searchElement + "' is not present in the HashSet.");
        }

        // 4. Remove an element from the HashSet
        set.remove("Date");
        System.out.println("After removing 'Date': " + set);

        // 5. Check the size of the HashSet
        System.out.println("Size of the HashSet: " + set.size());

       

        // 7. Check if the HashSet is empty
        if (set.isEmpty()) {
            System.out.println("The HashSet is empty.");
        } else {
            System.out.println("The HashSet is not empty.");
        }

        // 8. Clear all elements from the HashSet
        set.clear();
        System.out.println("After clearing the HashSet: " + set);

        // 9. Check if the HashSet is empty after clearing
        if (set.isEmpty()) {
            System.out.println("The HashSet is now empty.");
        } else {
            System.out.println("The HashSet is not empty.");
        }
    }
}
    

