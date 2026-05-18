package abstraction;

public class Interface {
    public static void main(String[] args) {
        Car c = new fuelCar();
        c.start();
        c.acc();
        c.brake();

    }    
}

interface Car {

    void start();
    void acc();
    void brake();

}

class fuelCar implements Car {
    @Override
    public void start() {
        System.out.println("car is starting");
    }
    @Override
    public void acc() {
        System.out.println(" fuel acc is happen");
    }

     @Override
    public void brake() {
        System.out.println(" fuel brake is happen");
    }
}

class electricCar implements Car {

     public void start() {
        System.out.println("car is starting");
    }

     @Override
    public void acc() {
        System.out.println(" electric acc is happening");
    }

     @Override
    public void brake() {
        System.out.println(" electric brake is happening");
    }
}

