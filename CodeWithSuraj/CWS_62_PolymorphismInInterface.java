package CodeWithSuraj;
//one obj=new two();  //one=>reference    two=>object
//we just call references methods
class one{
    public void meth1(){
        System.out.println("meth1 in one class");
    }
    public void meth2(){
        System.out.println("meth2 in one class");
    }
}
class two extends one{
    //adding method with same name as in super class
    public void meth2(){
        System.out.println("meth2 in two class");
    }
    public void meth3(){
         System.out.println("meth3 in two class");
    }
    public void meth4(){
        System.out.println("meth4 in two class");
    }
}
public class CWS_62_PolymorphismInInterface {
    public static void main(String[] args) {
        one obj=new two();  //one=>reference    two=>object
        obj.meth1();
        obj.meth2();    // =>it will run object class method cause of it contain same name as in super class/reference class
        obj.meth2();
       //we cannot call objects methods
        // obj.meth3();
        //obj.meth4();
    }
}
