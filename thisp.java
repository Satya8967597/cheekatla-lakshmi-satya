package thisandsuper;

public class thisp {
    int num;
    String name;

    thisp() {
        // Calling argument constructor of current class using this()
        this(40, "Satya");
    }

    thisp(int num, String name) {
        // Printing fields of the current class using this
        this.num = num;
        this.name = name;
        System.out.println(num + " " + name);
    }

    public static void main(String[] args) {
        thisp num = new thisp();
        thisp name= new thisp(16, "mohan");
    }
}
    

