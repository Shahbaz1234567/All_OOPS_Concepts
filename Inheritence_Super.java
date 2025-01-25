class Inheritence_Super {
    
    String empname="Rajesh";
    int empid=101;

    public void kuchhbhi(){
           System.out.println("I'm coming");
    }
    public void ans(int empid){
        //empid=12369;
        System.out.println("Iss function of super keyword is call kiya ho "+empid);
    }

    Inheritence_Super(String Address){
        System.out.println("This is constructor of super class or parent class"+Address);
    }
}

class Emp extends Inheritence_Super{
    int empid=102;
    String empname="Raj";
Emp(){
    super("Delhi");// this must be the first line
    System.out.println("This is constructor of sub class or child class");
    // super("Delhi"); // this must be the first line ---yaha nahi likh sakte error aayega
}

    public void basic(int empid){
        System.out.println(empid);
        System.out.println("This keyword ka use "+this.empid+" "+this.empname);
        System.out.println("Super keyword ka use "+super.empid+" "+super.empname);
        super.ans(566);

    }
}

class Main{
    public static void main(String[] args) {
        Emp e=new Emp();
        e.basic(33);//e.basic(033)=27 output;
        e.kuchhbhi();
    }
}

/*

 e.basic(33)=33. but, //e.basic(033)=27 output;
 
 * The difference in output is due to the way numbers are interpreted in Java. When you prefix a number with `0`, it is interpreted as an octal (base-8) number rather than a decimal (base-10) number.

Here's a breakdown:

- `33` is a decimal number and is interpreted as 33.
- `033` is an octal number. In octal, `033` is equivalent to `3 * 8^1 + 3 * 8^0`, which equals `24 + 3 = 27` in decimal.

 */

 

