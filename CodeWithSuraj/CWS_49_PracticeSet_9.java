package CodeWithSuraj;
class Cylinder{
    int radius,height;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double area()
    {
        //2*Pi*r*h + 2*pi*r*r
        return (2*Math.PI*radius*height)+(2*3.14*radius*radius);
    }
    public double volume(){
        return Math.PI*(radius*radius)*height;
    }
}
class CylinderP2{
    public CylinderP2(double radius,double height){
        double area=(2*Math.PI*radius*height)+(2*3.14*radius*radius);
        double volume=Math.PI*(radius*radius)*height;

        System.out.println("area of cylinder using constructor :"+area);
        System.out.println("volume of cylinder using constructor :"+volume);
    }
}
class rect{
    public rect() {
        int length=4;
        int breadth=5;
        System.out.println("area of rectangle:"+length*breadth);
    }
    public rect(int length,int breadth) {
        System.out.println("area:"+ length*breadth);
    }
}
class sphere{
    double radius;
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void areaVolumeSphere(){
        double area=4* Math.PI*radius*radius;
        double volume=4/3d* Math.PI*radius*radius*radius;
        System.out.println("surface area of sphere:"+area);
        System.out.println("volume of sphere:"+volume);
    }
}
public class CWS_49_PracticeSet_9 {
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        //problem 1=>class cylinder setters nd getters nd calculate area nd volume
        Cylinder obj1=new Cylinder();
        obj1.setHeight(55);
        obj1.setRadius(22);
        System.out.println("area of cylinder :"+obj1.area());
        System.out.println("volume of cylinder :"+obj1.volume());


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //problem 2=>use constructor nd repeat p1

        CylinderP2 obj2=new CylinderP2(22,55);


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //problem 3=>overload a constructor and l,b of rectangle
        //for existing l,b
        rect obj3=new rect();
        //for custom l,b
        rect obj4=new rect(5,50);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //problem 4=>repeat 1 for sphere
        sphere obj5=new sphere();
        obj5.setRadius(4);
        obj5.areaVolumeSphere();
    }
}
