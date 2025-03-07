package basics;

public class variables {
    int a=40;
    void localvariables()
    {
        int a=50;
        System.out.println(" variables " + a);
    }
    public static void main(String[] args) {
        variables ob=new variables();
        System.out.println(ob.a);
        ob.localvariables();

    }

    
}
