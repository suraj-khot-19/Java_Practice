package CodeWithSuraj;
//one abstract class is extended by other classes
abstract class Parent{
    abstract void Method1();
    abstract void Method2();
    int a=0;
}

//extends

class Child extends Parent{
    //we may implement all abstract methods or no abstract methods
    @Override
    void Method1() {
        System.out.println("I am a method 1 which extended from parent "+a);
    }
    @Override
    void Method2() {
        System.out.println("I am a method 2 which extended from child");
    }
}
class Child2 extends Child{
    @Override
    void Method2() {
        System.out.println("Child2 class:I am a method 2 which extended from child");
    }
}
public class CWS_57_AbstractClass_Methods {
    public static void main(String[] args) {
        Child2 obj1=new Child2();
        obj1.Method1();
        obj1.Method2();//it will print child2's method

        //we create Child class object
        Child obj2=new Child();
        obj2.Method1();
        obj2.Method2();

        ///we can not create object of abstract class
        //Parent obj3=new Parent();

        //but we can create reference of an abstract class and only can access that class properties and methods
        Parent obj3=new Child();
        obj3.Method1();
        obj3.Method2();
    }
}
