package CodeWithSuraj;
//this=>is used to refer a current class object, it is mostly used in getters or setters
class example{
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        // a = a ; it will ambiguity to compiler which a is equals to which a. one of Adv of this
    }
}
public class CWS_52_thisKeyword {
    public static void main(String[] args) {
    example obj=new example();
    obj.setA(20);
    System.out.println(obj.getA());
    }
}
