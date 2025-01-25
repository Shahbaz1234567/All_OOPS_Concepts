/* -----------------                  Encapsulation and Getter& stter ka concept hai isme                   ---------------------------- */


// Purpose of Getter&setter is to get and set the values of the private variables-----to improve data security

// firstlt let's make simple class to understand the concept of getter and setter

/*
class std{
    String name;
    int roll_no;

    void display(){ // Public void display(){} --- iss tarah se bhi likh sakte hai: by default java me access modifier public hota hai, agar hum access modifier nahi likhte to bhi public hi hota hai
        // iss dono print statements ka output same Aayega kyunki yaha display() me koi argument nahi pass kiya hai
        System.out.println("Name: "+name+" Roll no: "+roll_no);
        System.out.println("Name: "+this.name+" Roll no: "+this.roll_no);
    }
}

class mainmethod{
    public static void main(String[] args) {
        std s1=new std();
        s1.name="Rahul Kumar";
        s1.roll_no=-101;
        s1.display();
    }
}

*/





// Encapsulation: Encapsulation is a mechanism where you bind your data(variables) and code(methods) together as a single unit. It is a way to restrict access to some of the object's components.

// niche ko class(Getter_setter) use kiya hai ye Encapsulation ke concept ko batata hai  and Getter and setter concept ko bhi batata hai---isi tarah Encapsulation use karte hai through getter and setter

public class Getter_setter {
    private String name="Rakesh";
    private int roll_no=1233;

    // Getter
    public String getName(){
        return name;
    }

    public void getRoll_no(){
        //return roll_no;
        System.out.println("To display Roll no from getter function: "+roll_no);
    }

    // Setter
    public void setName(String name){
        this.name=name;
    }

    public void setRoll_no(int roll_no){

        // if(roll_no<=0){
        //     System.out.println("Invalid Roll no");
        //     return;
        // }

        //OR
            if(roll_no<=0){
                throw new IllegalArgumentException("Invalid Roll no");
            }

        this.roll_no=roll_no;
    }

    public void display(){
        System.out.println("Name: "+name+" Roll no: "+roll_no);
    }

}

class mainmethod{
    public static void main(String[] args) {
        Getter_setter s1=new Getter_setter();

 System.out.println("To display getter function: "+s1.getName());
 s1.getRoll_no();

        s1.setName("Rahul");
    //    s1.setRoll_no(-101); // yaha par Invalid Roll no print hoga kunki maine setter ka use karke usme Exception error condition set kiya hai, to imrove our data security ----yahi fyda hai getter and setter ka... upar wale class std me kuchh bhi roll_no and name pass kar sakte the, but yaha par nahi...yaha  par data ko validate kiya hai
        s1.setRoll_no(101);
        s1.display();
    }
}



