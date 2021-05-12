//class is nothing but textual representation of object in memory
//what we write in class is an actual property of the object as we are writing the class to describe the object
//if we want anything to belong to class it has to be static


//Multi Inheritance(Opposite of Hierarchical ) is not supported in JAVA, that is a child can't have multiple parents
class Product{
    //this attributes(state) belong to the object
    private int id;
    int pricd;
    String name;

    //constructor
    Product(){
        System.out.println("Product Object Constructor");
    }

    //methods(Behaviour)
    //to write the data in product object we have this method
    //void is the return type of the method, as it dosen't return anything
    //this mens current object(self in Python)
    void setProductDeitails(int pid,int prc,String name){
        this.id=pid;
        this.pricd=prc;
        this.name=name;
    }

    void showProductDetails(){
        System.out.println("product ID= "+ this.id);
        System.out.println("Product Price= "+this.pricd);
        System.out.println("Product name: "+this.name);
    }

    //Setter
    final void setId(int id){//final keyword is used as it can't be overridden by subclass
        // also used to create constant variables in classes
        this.id=id;
    }

    //Getter
    final int getId(){
        return this.id;
    }

}


class Mobile extends Product{//Inheritance: extends define relation where Mobile is child and Product is parent

    //child only attributes
    int ram,storage;
    String os;

    Mobile(){//unlike Python this child constructor will not override the Parent constructor
        System.out.println("Mobile object Constructed");
    }

    //Method overloading(Compile time/Static Polymorphism): both the methods are named same yet different input
    void setProductDeitails(int pid,int prc,String name,String oss,int rm,int strge){
        //this.id=pid; cant be accessed in child class as it is private in Parent
        this.pricd=prc;
        this.name=name;
        this.ram=rm;
        this.storage=strge;
        this.os=oss;
    }

    //Method Overriding(Run time/Dynamic Polymorphism): same name and parameters, return type same or sub-type
    // this overrides the parent method thus it will be used when called from mobile object
    void showProductDetails(){
        System.out.println("the product ID is "+ super.getId());
        //as the product ID is private(super. or this. both can be used as its being inherited)
        System.out.println("Product Price= "+this.pricd);
        System.out.println("Product name: "+this.name);
        System.out.println("Product Os is "+this.os);
        System.out.println("the system sepcs are "+ this.ram+"GB RAM and "+this.storage+"GB storage.");
    }



}
public class Inheritance {
    //main is executed my the Java Virtual Machine(JVM) when my program is ran
    public static void main(String[] args){

        //construction of an object
        Product sock=new Product();
        //this sock is not thr object it stores the hash code of the object in hexadecimal(reference variable)
        //thats why when we print the object it gives the address of the object

        sock.setProductDeitails(56742,100,"Long Sock");
        sock.showProductDetails();

        System.out.println();

        //write data directly
        Product shoe=new Product();

        // all attributes are marked as public so data can be written directly
        shoe.pricd=2000;
        shoe.name="sneakers";

        //marking the id as private we can't anymore set it directly
        //shoe.setProductDeitails(123409);
        //neither can we use the previously defined method,
        // so now we need Setters and Getters when any variable is marked private

        shoe.showProductDetails();


        System.out.println();
        //creating a mobile object
        Mobile Nokia=new Mobile();//mobile constructor dosen't override the parent constructor(Unlike Python)

        //accessing parent methods by child
        Nokia.setProductDeitails(23986,50000,"NOkia 8.1");
        Nokia.setId(45623);
        Nokia.showProductDetails();

        System.out.println();
        //new object for using the over loaded methods
        Mobile flipPhone=new Mobile();
        flipPhone.setId(12790);
        flipPhone.setProductDeitails(0,3000,"Flip 2","Jaca",1,8);
        //pid here isn't used my the method just for sake of parameter postionality its passed
        flipPhone.showProductDetails();//overidden method is called

    }
}
