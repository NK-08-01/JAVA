package OOPS.Polymorphism;


class hello {
    public static void main(String[] agrs) {
        A a = new B();
        a.fun();
        
    }
}

// static never overides in polymorphism
// final are only once
// private are also donnot overide



class A {
    static void fun() {
        System.out.println("fun");
     }
}

class B extends A {
    static void fun() {
        System.out.println("fun1");
     }
}