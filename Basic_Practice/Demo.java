public class Demo {
    public static void main(String[] args) {
        System.out.println(sum(1,5));
        System.out.print(sum(6,7,8));
       fun();
       fun(10);

    }   

    static double sum(double a,double b) {
        return a+b;
    }

     static int sum(int a,int b,int c) {
            return a+b+c;
    }

    static void fun() {
        System.out.println("nk");

    }

    static int fun(int a) {
        System.out.println("nk"+a);
        return 10;

    }
}
