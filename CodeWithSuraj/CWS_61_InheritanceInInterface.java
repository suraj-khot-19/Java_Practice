package CodeWithSuraj;

/*
class ==> class ....extends
class ==> interface ...implements
interface ==> interface ...extends
interface ==> class ...nothing haaaa ha
 */
interface M{
    void meth1();
    void meth2();
}
//extends
interface N extends M{
    void meth2();
    void meth3();
    void meth4();
}
class Sample implements N{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class CWS_61_InheritanceInInterface {
    public static void main(String[] args) {
        Sample obj=new Sample();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
