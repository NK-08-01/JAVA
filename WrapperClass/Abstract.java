package WrapperClass;

public class Abstract {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sleep();
        a.bark();
    }
}

abstract class Animal {
   abstract void bark();
    
    void sleep() {
        System.out.println("sleeping");
    }
}

class Dog extends Animal{
    @Override
    void bark() {
        System.out.println("barking");
    }
}
