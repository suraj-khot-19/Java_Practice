package CodeWithSuraj;
//to calling private method in interface we need to define one default method and then call
interface x1{
    private void meth1(){
        System.out.println("************private*****************");
    }
    default void meth2(){
        meth1();
        System.out.println("we already called meth1");
    }
}
class samX1 implements x1{
    public void msg(){
        System.out.println("work is done...");
    }
}
public class CWS_60_runningPrivateMethodInInterface {
    public static void main(String[] args) {
        samX1 obj=new samX1();
        //obj.meth1();
        //error we can not directly call it

        obj.meth2();
        obj.msg();
    }
}
