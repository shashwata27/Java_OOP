public class DemoThrow1 {

    // throws is used to let know the caller that there might be an exception and the caller needs to handel it
    // in this case main is called by the JVM so it will be handeled by the JVM
    public static void main(String[] args)throws InterruptedException
    {
        Thread.sleep(10000);
        System.out.println("Hello Geeks");


    }

}
