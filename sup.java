package thisandsuper;

    class Parent_02_05 {
        String name = "Satya";
    
        Parent_02_05() {
            System.out.println(" parent class constructor");
        }
    }
    
    //SubClass
    class Child_02_05 extends Parent_02_05 {
        String name = "Jala";
    
        Child_02_05() {
            // Calling constructor of the parent class using super()
            super();
            System.out.println(" child class constructor");
        }
    
        void myMethod() {
            //Printing fields of the parent class using super
            System.out.println("My name is " + super.name);
        }
    }
    
    public class sup {
        public static void main(String[] args) {
            Child_02_05 c = new Child_02_05();
            c.myMethod();
        }
    }
    

