/* Iss file me OOPS ke basics concepts like object,class, how create obj and calling--- constructor overloading, static variable and static method and this keyword with this() ka concepts hai   */

//package OOD_OOPS; //folder name ko java me package bolte hai

class Student {
    // instance variable
    int rollno;
    String name;
    // static variable or class variable
    static String college = "ITS";

    // static method to change the value of static variable
    static void change() {
        college = "BBDIT";
    }

    // constructor to initialize the variable
    Student(int rollno, String name) {
        this.rollno = rollno; // this.rollno is instance variable and rollno is local variable which is passed as argument in this constructor
        this.name = name;
    }
Student(){
    this(123,"Raju"); // using this() to call the constructor of same class inside another constructor
}

    // method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

// Test class to create and display the values of object
public class Basics_oops {

    public void checking(int a){
        System.out.println("Checking method called "+a);
    }

    Basics_oops(){
        System.out.println("When at the time of obj creation Constructor has called");
    }

    public static void main(String args[]) {
        // static variable and method ko direct class ke name se with any object creation direct access kar sakte hai
        Student.college="LPU";
       // Student.change(); // calling change method to change college name 


        
        // creating objects
        Student s=new Student();

        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan");
        Student s3 = new Student(333, "Sonoo");

        // calling display method
        
        s1.display();
        s2.display();
        s3.display();
        s.display();

        Basics_oops obj=new Basics_oops();
        obj.checking(10+10);

    }
}