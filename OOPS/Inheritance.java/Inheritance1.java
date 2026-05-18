package Inheritance.java;

public class Inheritance1 {
    public static void main(String[] args) {
        // Engineering_Student es = new Engineering_Student();
        Medical_Student ms = new Medical_Student();
        ms.lab();
        ms.markAttendance();
        ms.grades();
        // es.grades();
        // es.markAttendance();

    }

}


class Student {
    // String name;
    // int age;

    void markAttendance() {
        System.out.println("attendance is marked");
    }
}

class Engineering_Student extends Student{
    void grades() {
        System.out.println("grade already alloted");
    }
}

class Medical_Student extends Student {
    void lab() {
        System.out.println("attend lab");
    }
}

//types of inheritance -->
// 1 simple inheritance;
// 2 multiple inheritance;
// 3 heirarchial inheritance;
// 4 multilevel inheritance -->  not present in java 

// 1 simple 
//      A
//      |
//      B;



/// 2 multilevel inheritance
///     A
///     | 
///     B
///     |
///     C   
/// 
/// 3 Herirarchial inheritance;
///     A
///    / \
///   B   C
/// 
