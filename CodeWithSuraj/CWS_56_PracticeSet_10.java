package CodeWithSuraj;
class Circle1{
    Circle1(int radius) {
        double a = Math.PI * radius * radius;
        System.out.println("area of circle:" + a);
    }
}
class Cylinder1 extends Circle1{
    Cylinder1(int radius,int height){
        super(radius);
        double a= Math.PI*radius*radius*height;
        System.out.println("area of cylinder:"+a);
    }
}
public class CWS_56_PracticeSet_10 {
    public static void main(String[] args) {
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //p1=>create class circle and use  inheritance to create another class cylinder from it
        Cylinder1 obj=new Cylinder1(2,3);
    }
}
