package CodeWithSuraj;
//one interface is implements by other class
//implemented class main method must be declare as public
//interface can contain methods,properties(which are final)

interface Bicycle{
    int speedCycle =20;  //it is by default ******final******
    void applyBreak(int decrement);
    void goSpeed(int increment);
}
interface Bike{
    //void applyBreak(int decrement);
    //void goSpeed(int increment);
    void blowHorn();
    void blowCustomHorn();
}
class InterfaceMeans implements Bicycle,Bike{
//all methods must be public

    @Override
    public void applyBreak(int decrement) {
        System.out.println("speed of cycle after break:"+(speedCycle-decrement));
    }

    @Override
    public void goSpeed(int increment) {
        System.out.println("speed of cycle after increase speed:"+(speedCycle+increment));
    }

    @Override
    public void blowHorn() {
        System.out.println("Bike:peeeeeeeeeeep");
    }

    @Override
    public void blowCustomHorn() {
        System.out.println("Bike:poooooooooooooo");
    }
}
public class CWS_58_Interfaces{
    public static void main(String[] args) {
        InterfaceMeans obj=new InterfaceMeans();
        obj.applyBreak(2);
        obj.goSpeed(20);
        obj.blowCustomHorn();
        obj.blowHorn();

        ///we can not create object of interface
        // Bicycle b=new Bicycle(); // abstract; cannot be instantiated

        //but we can create reference of an interface and only can access that interface properties and methods
        Bicycle b=new InterfaceMeans();
        b.goSpeed(20);
    }
}
