package CodeWithSuraj;
//creating a method in child class with same return type and name and which will be present in parent class
//redefining a method of super class in subclass
//@Override annotation is used
//we can not make static method as an override
class A2{
    public  void Meth1()
    {
        System.out.println("Meth1 in super");
    }
}
class B2 extends A2{
    @Override
    public  void Meth1()
    {
        System.out.println("Meth1 in sub");
    }
}
public class CWS_54_methodOverriding {
    public static void main(String[] args) {
    B2 obj=new B2();
    obj.Meth1();    //it will call method 1 from sub
    }
}
