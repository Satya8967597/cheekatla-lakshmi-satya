package methodoverload;

public class sameparameter {
    int num1;
    int num2;
    

    void method1(int num1) {
        this.num1 = num1;
        System.out.println("1.First number : " + num1);
    }
    void method1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("1.Sum of two numbers : " + (num1 + num2));
    }
    public static void main(String[] args) {
        sameparameter mo = new sameparameter();
        // 01.Calling the methods from main method
        mo.method1(40);
        mo.method1(250, 250);

    
}
}
