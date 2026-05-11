public class Static {
    public static void main(String[] args) {
        Student s1 = new Student("nikhil", 21, 126);
        Student s2 = new Student("shubham", 18, 120);
    
     //   Student.college = "iist";

        System.out.println(s1.name+","+s1.age+","+s1.rollNumber+","+s1.college);
         System.out.println(s2.name+","+s2.age+","+s2.rollNumber+","+s2.college);
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    static String college;

    Student(String name,int age,int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        // college = college;

    }
}
