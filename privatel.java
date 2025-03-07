package accessmodifiers;

public class privatel {
    private String name = "Satya";
    private int age = 40;

  
    private void pvtMethod() {
        System.out.println("My Name is " + name + " and my age is " + age);
    }

   
    public static void main(String[] args) {
        privatel obj = new privatel();
        System.out.println(obj.age);
        System.out.println(obj.name);
        obj.pvtMethod();
    }
   
}
    

