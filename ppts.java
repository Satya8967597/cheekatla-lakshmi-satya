package constructor;

public class ppts {
    int rollNo;
    String name;
    String clg;
    String city;

    {System.out.println("Student Details");}
    //default access modifier
    ppts() {
        this(40);
    }

    //public access modifier
    public ppts(int rollNo) {
        this("Satya");
        this.rollNo = rollNo;
        System.out.println("rollNo : " + rollNo);
    }

    //privatPublicPrivateProtectedDefaulte access modifiers
    private ppts(String name) {
        this("aditya college", "gajuwaka");
        this.name = name;
        System.out.println("Name : " + name);
    }

    //protected access modifiers
    protected ppts(String clg, String city) {
        this.clg = clg;
        this.city = city;
        System.out.println("college : " + clg);
        System.out.println("City : " + city);
    }

    public static void main(String[] args) {
        //calling the constructor multiple times with the same object
        ppts x = new ppts();
    }
    
}
    

