//abstract classes provide partial abstarction
//Abstraction is a Type of Runtime Polymorphism
//it can be used to hide the method implementation details but giving the functionality
//while extending a abstract class the abstract methods must be overriden

abstract class abs{//can have static methods and constructor,final methods
    // can have abstract or non-abstract(partial abstraction) methods and cant be instantiated

    abstract void absmethod();//abstract method

    public void method(){
        System.out.println("Normal method");
    }
}

public class Abstraction extends abs{
    public void absmethod(){
        System.out.println("Overriding the abstract Method");
    }

    public static void main(String[] args){
        Abstraction object=new Abstraction();//creating object of itself within it
        object.method();
        object.absmethod();
    }
}
