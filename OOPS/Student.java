//  package OOPS;

public class Student {
    public static void main(String args[]) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        d1.name = "Nikhl";
        d1.age = 21;
        d1.rollno =20;
        d1.markAttendence();

        d2.name = "niku";
        d2.age = 21;
        d2.rollno =26;
        d2.markAttendence();

    }
}

    class Demo {
        String name;
        int age;
        int rollno;

        void markAttendence() {
            System.out.println("att is marked  "+name);

        }

}
