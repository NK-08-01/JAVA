public class Constructor {
    public static void main(String[] args) {
      Student s1 = new Student();
      Student s2 = new Student("Nikhil");
      Student s3 = new Student("gunjan",16);
      Student s4 = new Student("ishu",21,101);
      Student s5 = new Student("balu",14,103,"sage");  
       
f
    } 
}

class Student {
    String name; // information/data/characterstics  --> instance variables
    int age;
    int rollNum;
    String college;

   Student() {

   }

   Student(String name) {
    this.name = name;
   }

   Student(String name,int ag) {
    this.name = name;
    this.age = age;

   }

   Student(String name,int ag,int rN) {
    this.name = name;
    this.age = age;
    this.rollNum = rN;
   }

   Student(String name,int ag,int rN,String c) {
     this.name = name;
     this.age = age;
     this.rollNum = rN;
     this.college = c;
    

   }

    

    void markAttendance() {     // behaviour --> function --> instance methods
        System.out.println("Attendence marked for student "+name);

    }
}
