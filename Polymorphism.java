/* ------ Polymorphism(many forms): Ability to show the message in different forms.

Two types: Compile time polymorphism and Run time polymorphism.

Compile time polymorphism: Method overloading -- Same method name with different parameters in same class --- change the behavior of the method at compile time.
Run time polymorphism: Method overriding -- Same method name with same parameters in different classes --- change the behavior of the method at run time.
 * 
 * 
 */

 /*
// -------------- Method Overloading --------------

class MethodOverloading {
    void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    void add(String a, String b) {
        System.out.println("Concatenation of two strings: " + (a + b));
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10.5, 20.5);
        obj.add("Hello", "World");
    }
}

*/

// -------------- Method Overriding --------------

class MethodOverriding {
    protected void display() {
        System.out.println("Method of parent class");
    }
}

class MethodOverridingTest extends MethodOverriding {
    public void display() // yaha method overriden ho raha hai--- overriden me access modifer same ya uski capability badha sakte hai, kam nahi kar sakte hai --- like protected ko public
    {
        System.out.println("Method of child class");
    }

}

class General{
    public void doWork(MethodOverriding obj){
        obj.display();
    }
}

class MethodOverridingMain {
    public static void main(String[] args) {
// yaha par niche dekho: based on object change the bevarior of the method at runtime

        MethodOverriding obj = new MethodOverriding();
        obj.display();

        MethodOverriding obj1 = new MethodOverridingTest();
        obj1.display();

        General obj2 = new General();
        obj2.doWork(obj1);
        obj2.doWork(obj);
    }
}

