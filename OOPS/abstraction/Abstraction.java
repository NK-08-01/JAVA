package abstraction;

public class Abstraction {
    public static void main(String[] args) {
       Car c = new fuelCar();
       Car ec = new electricCar();

       c.start();
       c.accelerate();
       c.brake();

       ec.accelerate();
       ec.brake();
    }
}

abstract class Car { 

    void start() {
        System.out.println("car is starting");
    }

    abstract void accelerate();

   abstract void brake();

}

class fuelCar extends Car {
    
    @Override
    void accelerate() {
        System.out.println(" fuel acc is happening");
    }

     @Override
    void brake() {
        System.out.println(" fuel brake is happening");
    }
}

class electricCar extends fuelCar {
     @Override
    void accelerate() {
        System.out.println(" electric acc is happening");
    }

     @Override
    void brake() {
        System.out.println(" electric brake is happening");
    }
}
