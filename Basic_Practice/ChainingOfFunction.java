public class ChainingOfFunction {
    public static void main(String[] args) {
        A();
        System.out.print("hil");
    }

    static void A() {
        B();
        System.out.print("k");
    }

    static void B() {
        C(); // called by b
        System.out.print("i");
    }

    static void C() {
        System.out.print("n"); // after n  fn  return back to above functions; 
    }
}

// here A->B->C->print -> return C->B->A


