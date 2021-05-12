public class DemoThrow2 {


    static void fun() throws IllegalAccessException{

        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    // here the fun() is called by main so within main the exception needs to be handeled
    public static void main(String args[]){

        try
        {
            fun();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("caught in main.");
        }
    }
    
}
