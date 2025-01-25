/*------------------------------- Abstraction and Interface in Java --------------------------------*/

 //                           Abstraction(showing features and hiding internal data)--- to achive partial(0-100)% abstraction
/*

abstract public class Abstraction {
    // concrete method ya complete method 
    public void cal() {
        System.out.println("Concrete method of parent class");
    }

    // abstract method
    public abstract void display(); // yaha ek abstract class Aa gaya isliye iss class ko bhi abstract banana padega

    
}

// Note: abstract class can have abstract method and concrete method
  //       abstract class cn't be instantiated(matlab iska object nahi bana sakte hai)




class Child extends Abstraction {
    public void display() {
        System.out.println("This is Implementation of Abstract method of parent class");
    }
}


class start{
    public static void main(String[] args) {
        // Abstraction obj = new Abstraction(); // error: Here Abstraction is abstract class; cannot be instantiated
        // obj.cal();

        // Child obj=new Child();
        // obj.cal();
        // obj.display();

       Abstraction obj=new Child();
         obj.cal();
         obj.display();

    }
}

*/

//  ----------------------------------------------------------------Interface          --------------------

// Interface is a blueprint of a class. It has static constants and abstract methods.---- to achive full(100%) abstraction

interface Shape{
  int length=10; // Interface me variables by default public, static, final hote isliye isko public static final  int length=10;likho ya jo simple likha hai wo dono same hai

    void draw(); // Interface me method by default public and abstract hota hai isliye public abstract void draw(); aise likhne ki jarurat nahi hai,aise likho ya jo simple likha hai wo dono same hai


}

class Circle implements Shape{
   // @Override
    public void draw(){
        System.out.println("Drawing Circle");
    }

    public static void main(String[] args) {
        Circle obj=new Circle();
        obj.draw();
        System.out.println("Length is: "+length);
    }

}