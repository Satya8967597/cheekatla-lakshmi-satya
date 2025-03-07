package methodoverload;

public class differrentparameter {
    int num1;
    int num2;
    int rollNo;
    String name;
      
    void method2(int rollNo) {
        this.rollNo = rollNo; 
        System.out.println("Roll number : " + rollNo);
    }
   
    void method2(int rollNo, String name) {
        this.rollNo = rollNo; 
        this.name = name;    
        System.out.println("Roll number : " + rollNo + " ; " + "Name : " + name);
    }
    public static void main(String args[])
    {
        differrentparameter mo = new differrentparameter();
        {
        mo.method2(554);
        mo.method2(554, "Satya");
    }




}   
}
