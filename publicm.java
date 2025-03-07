package accessmodifiers;

public class publicm{

    public String pName = "satya";

    public void publicMethod() {
        System.out.println("This is " + pName);
    }


    public static void main(String[] args) {
      
        publicm pub = new publicm();
       
        pub.pName = "satya class";
       
        pub.publicMethod();
    }
}
    

