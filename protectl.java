package accessmodifiers;

public class protectl {
    protected String name;

    //Protected method
    protected void protectedMethod() {
        System.out.println("This is a " + name);
    }
}

//Accessing protected fields and methods from other class in the same package
class protectedClass_03 {
    public static void main(String[] args) {
        //Creating object of ProtectedClassFieldsMethod class.
        protectl pc = new protectl();
        //Accessing protected field
        pc.name = "beautiful flower";
        //Accessing protected method
        pc.protectedMethod();
    }
}
    

