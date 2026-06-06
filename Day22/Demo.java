import java.util.Objects;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.age = 21;

        Student s2 = new Student();
        s2.name = "Aditya";
        s2.age = 21;

       // Integer i = 21;

       // Student s3 =null;

      //  System.out.println(s1.equals(s2));// obj can call s2 
      //  System.out.println(s1.hashCode() == s2.hashCode());

    //   System.out.println(s1.getClass().getName());
    //   System.out.println(s2.getClass().getName());

    //   System.out.println(s1 instanceof Object);

    Student s3 = (Student) s1.clone();
    System.out.println(s3.age);
    System.out.println(s3.name);
// instanceOf operator -- > check if an object is instance of any class or any of a subclass;


    }
}

  class Student extends Object implements Cloneable {
    String name;
    int age;

    // Student(String name,int age) {
    //     this.name = name;
    //     this.age  = age;
    // }

    // @Override
    // public String toString() {
    //     return (name +" ,"+ age);

    // }

    @Override
    public boolean equals(Object obj) {

        if(this == obj)  
           return true;
        

        if(obj == null) {
            return false;
        }

        // Check if both classes are of type student;
        // if not checked --> CLassCastException;

        if(obj.getClass() != this.getClass()) {
            return false;
        }
          Student s = (Student) obj;
    
            return (this.name == s.name && this.age == s.age);

           
    }

             @Override
            public int hashCode() {
                // int result = 17;
                // result = result * 31 + age;
                // result = result * 31 + ((name == null) ? 0 : name.hashCode());

                return Objects.hash(name,age);


            }

            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

}  