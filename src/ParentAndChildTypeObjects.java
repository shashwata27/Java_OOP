class parent{
    int age=10;
}
class child extends parent{
    int height=7;
}

public class ParentAndChildTypeObjects {
    public static void main(String[] args){
        parent p= new child();
        child c=new child();

        System.out.println("child");
        System.out.println(c.height);
        System.out.println(c.age);
        System.out.println("parent");
        System.out.println(p.age);
        //as p is parent type it can't hold the age attribute

    }
}
