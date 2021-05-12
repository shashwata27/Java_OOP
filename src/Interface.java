// multiple inheritence is not possible(in JAVA) but a class can implement multiple interfaces
//can't instantiate
//Comlete Abstraction: methods declared in interface are by default abstract,public
// variables defined are final,static,public by default,
// and must be intialized at time of defining interface, if the value is tried to be changed it will give a error
interface myitfc{
    int a=10;
    void method();
}

interface  myitfc2 extends myitfc{//inherits other interface
    void method2();
}
interface  myitfc3 {//inherits other interface
    int a=100;
    void method3();
}
public class Interface implements myitfc2,myitfc3 {
    public void method(){//at least needs to be interface privilege i.e. public
        System.out.println("Implementing the interface method");
    }
    public void method2(){
        System.out.println("Implementing the Chlid Interface");
    }
    public void method3(){
        System.out.println("Implementing the 3rd Interface");
    }
    public static void main(String[] args){
        Interface obj=new Interface();
        obj.method();
        obj.method2();
        obj.method3();

        //variable name concflict can be resolved by interface name
        System.out.println(myitfc.a);
        System.out.println(myitfc3.a);
        //but methods of same name but different data types cant be implemented in same class

    }


}


