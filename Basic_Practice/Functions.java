public class Functions {
    public static void main(String[] args) {
        //System.out.println("nikhil");
        greet();
        sayHello("nikhil");
       System.out.println(getNumber());
       int k = multiply(10,10);
       System.out.println(k);
    

    }

     //no i/p,no o/p   
    static void greet() {
        System.out.println("Good Morning Nikhil ");

    }
    // i/p,no o/p;
    static void sayHello(String name) {
        System.out.println("Hello Nikhil"+ " "+ name);
    }

    // no i/p ,o/p
    static int getNumber() {
        return 10;
    }
    
    // i/p , o/p ;
    static int multiply(int a,int b) {
         return a*b;

    }
}
