package abstrac;


abstract class Vehicle {
  
    abstract void start();

 
    void stop() {
        System.out.println("The vehicle has stopped.");
    }
}


class Car extends Vehicle {

  
    @Override
    void start() {
        System.out.println("Car is starting with a key.");
    }
}


public class createab {
    public static void main(String[] args) {
        Vehicle myCar = new Car(); 
        myCar.start();  
        myCar.stop();  
    }
}