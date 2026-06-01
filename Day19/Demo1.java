public class Demo1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //Inner inner = new Inner();
        Outer.Inner inner = outer.new Inner();
        inner.fun();
         
    }
  
}

class Outer {
    int x=10;
    class Inner {
       int x =100;
        void fun() {
            System.out.println(x);
        }
    }
}
