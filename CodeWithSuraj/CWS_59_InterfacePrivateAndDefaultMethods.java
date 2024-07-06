package CodeWithSuraj;
//interface methods are ****public**** by default
//default method must have *body and can be overridden
// if we forget to write some methods in project that can be written in as shown:
//private method must have *body and can not be overridden and not call by creating references
//so to run private method we put call in default method
interface Sample1{
    private void methPrivate(){
        System.out.println("this is private method");
    }
}
interface Sample2{
    default void meth1(){
        System.out.println("this is default method");
    }
}
class SamClass implements Sample2,Sample1{
    //it not necessary to write body of default meth but if we write it will be overridden,
    // and overridden method will execute
    @Override
    public void meth1(){
        System.out.println("this is default method which is ***overridden ");
    }
}
public class CWS_59_InterfacePrivateAndDefaultMethods {
    public static void main(String[] args) {
        SamClass obj=new SamClass();
        obj.meth1();
        //obj.methPrivate();
        // error=>we can not call directly then what is use of it visit next class......
    }
}
