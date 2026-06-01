public class Demo {

    public static void main(String[] args) {
        Student s1 = new Student(21, "nikhil");
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
    }
} 

//immutable
class Student {
    private final int age;
    private final String name;

    Student(int age,String name) {
        this.age = age;
        this.name = name;

    }

    // getters 
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
}