package abstraction;

public class Abstraction {
    public static void main(String[] args) {
       Car c = new Car();
       c.start();
       c.accelerate();
       c.brake();

    }
}

class Car { 

    void start() {
        System.out.println("car is starting");
    }

    void accelerate() {
        System.out.println("acc is happening");
    }

    void brake() {
        System.out.println("brake is happening");
    }

}

class fuelCar extends Car {
    
    void accelerate() {
        System.out.println("acc is happening");
    }

    void brake() {
        System.out.println("brake is happening");
    }
}

class electricCar {
    void accelerate() {
        System.out.println("acc is happening");
    }

    void brake() {
        System.out.println("brake is happening");
    }
}
