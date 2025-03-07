package operators;
import java.util.Scanner;

public class equalnot {
    public static void main(String[] args) {
        Scanner equ=new Scanner(System.in);
        System.out.println("enter first number");
        int x=equ.nextInt();
        System.out.println("enter second number");
        int y=equ.nextInt();
        if(x==y)
        {
            System.out.println("both are equal");
        }
        else
        {
            System.out.println("both are not equal");
        }

        
    }


   
}
