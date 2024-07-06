package CodeWithSuraj;
//p1=>create abstract class with name pen and methods refill() and write() methods
abstract class Pen{
    abstract void write();
    abstract void refill();
}
//p2=> create concrete class FountainPen with additional method ChangeNib()
class FountainPen extends Pen{
    @Override
    void write() {
        System.out.print("writing");
    }
    @Override
    void refill() {
        System.out.print(" with refill....");
    }
    void ChangeNib(){
        System.out.println("changing nib");
    }
}

//p3=>
public class CWS_63_PracticeSet_11 {
    public static void main(String[] args) {
        FountainPen obj=new FountainPen();
        obj.write();
        obj.refill();
        obj.ChangeNib();
    }
}
