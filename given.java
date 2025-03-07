package arrays;

public class given {
    public static boolean containsElements(int[] arr, int elem1, int elem2) {
        boolean foundElem1 = false, foundElem2 = false;
        
        for (int num : arr) {
            if (num == elem1) foundElem1 = true;
            if (num == elem2) foundElem2 = true;
            if (foundElem1 && foundElem2) return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[] array = {5, 12, 7, 23, 8, 19};
        System.out.println("Contains 12 and 23? " + containsElements(array, 12, 23));
    }
}

    

