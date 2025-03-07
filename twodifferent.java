package methodoverload;

public class twodifferent {
    int num1;
    int num2;
    int rollNo;
    String name;
    void method4(int rollNo) {
        this.rollNo = rollNo;  //Integer data type
        System.out.println("Roll number : " + rollNo);
    }
    //same method name different parameter type
    void method4(String name) {
        this.name = name;   //String
        System.out.println("Name : " + name);
    }
    public static void main(String[] args) {
        twodifferent mo = new twodifferent();
        mo.method4(42);
        mo.method4("satya");
    }
    
}
