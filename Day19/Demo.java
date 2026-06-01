package Day19;

public class Demo {
    public static void main(String[] args) {
        //Outer.Inner inner = new Outer.Inner();
       // Outer.Inner inner = outer.new Inner();

       Outer.Inner inner = new Outer().new Inner();

       inner.fun();


    }
}

class Outer {
    class Inner {
        void fun() {
            System.out.println("hello");
        }
    }
}