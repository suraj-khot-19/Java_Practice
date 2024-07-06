package CodeWithSuraj;
//super=>is used to refer a parent class object
class A{
    public A()
    {
        System.out.println("A claas constructor");
    }
    public A(int a)
    {
        System.out.println("A claas constructor:"+a);
    }
}
class B extends A{
    public B()
    {
        System.out.println("B claas constructor");
    }
    public B(int a,int b)
    {
        super(a);   //it will call super class's method which accepting one argument
        System.out.println("B claas constructor:"+b);
    }
}
public class CWS_53_superKeyword {
    public static void main(String[] args) {
        B obj=new B(20,30);
    }
}
