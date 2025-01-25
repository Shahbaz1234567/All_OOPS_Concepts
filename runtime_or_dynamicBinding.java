// dynamic binding or runtime polymorphism, upcasting, downcasting and virtual keyword uses(only in c++ not in java), method overriding, super keyword, instanceof operator

 class Animal{
    // overridable method or overridden method
    void print(){
        System.out.println("This is the base class");
    }

    void call_func(){
        print();
    }
 }

 class Dog extends Animal{
    //oeverriding the base class print() method
    void print(){
        System.out.println("This is the derived class");
    }

    void callBasePrintMethod() {
        super.print(); // Call the base class print() method
    }
 }

 class show{
    public static void main(String[] args) {
        Animal obj=new Animal();
        System.out.println("This is the object/refrence of super class assigned to superclass/base class object");
        obj.call_func();
        obj.print();

        // in java no need to write virtual keyword, you can directly accessed derived class function like this without virtual keyword
        Animal obj1=new Dog();//this called upcasting (i.e., assign a subclass object to a superclass reference)
        System.out.println("\nThis is the object of subclass assigned to super class object");
        obj1.call_func();
        obj1.print();
      //obj1.callBasePrintMethod(); // this gives error because obj1 is reference of Animal(superclass) class
     
      /* ****************Downcast the Animal reference to a Dog reference************ 
       Summary:
        Upcasting allows you to call methods defined in the superclass.
        To call subclass-specific methods, you need to either define them in the superclass or downcast the reference to the subclass type.
        
      */
      
     ((Dog) obj1).callBasePrintMethod(); // Downcasting to call the method


        // -------------------****************************************************----------------------------

        Dog obj2=new Dog();
        System.out.println("\nThis is the refrence of sub class assigned to subclass/derieved object");
        obj2.call_func();
        obj2.print();
        obj2.callBasePrintMethod();

        // Dog obj3=new Animal(); // this is called downcasting // In java super class object/reference can't be assigned to sub/derived class reference/object
        // obj3.call_func();

        // To handling downcasting:
        
        System.out.println("\nCorrect way of downcasting");
        Animal obj3 = new Dog(); // Upcasting -- yaha Dog class ke instance obj3 ko base class Animal me assign kiya gaya hai
        if (obj3 instanceof Dog) {
            Dog obj4 = (Dog) obj3; // Downcasting -- yaha obj3 ko Dog class me convert kiya gaya hai aur fir Dog class ke object/reference(obj4) me assign kiya gaya hai
            obj4.call_func();
            obj4.print();
        } else {
            System.out.println("The object is not an instance of Dog");
        }
    }
 }

 //Access modifier: public > protected > default > private