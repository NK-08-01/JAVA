public class Demo {

    public static void main(String[] args) {
        College college = new College("IIST","Indore");
        Student s1 = new Student(21, "nikhil",college);
        // System.out.println(s1.getAge());
        // System.out.println(s1.getName());
        // System.out.println(s1.getCollege());

      
        System.out.println(college.name);


    }
} 

//immutable --> Not purely immutable
class Student {
    private final int age;
    private final String name;
    private final College college;

    Student(int age,String name,College college) {
        this.age = age;
        this.name = name;
        this.college = college;


    }

    // getters 
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

     public College getCollege() {
       return this.college;
    }
}

//Mutable obj
class College {
    String name;
    String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;

    }
}
