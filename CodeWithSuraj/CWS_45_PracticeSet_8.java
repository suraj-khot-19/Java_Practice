package CodeWithSuraj;
class Employee
{
    //properties
    int salary;
    String name;

      //methods
    public void setSalary(int newSalary)
    {
        salary=newSalary;
    }
    public void setName(String newName)
    {
        name=newName;
    }
    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }

}
class Mobile
{
    public void ringing()
    {
        System.out.println("Ringing...");
    }
    public void vibrating()
    {
        System.out.println("Vibrating...");
    }
}
class Square
{
    int side=45;
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}
class Rectangle
{
    int length,breadh;
    public void setLengthBreadth(int l,int b)
    {
        length=l;
        breadh=b;
    }
    public int area()
    {
        return length*breadh;
    }
    public int perimeter()
    {
        return 2*(length+breadh);
    }
}
class Circle
{
    int radius;
    public void setRadius(int r)
    {
        radius=r;
    }
    public double area()
    {
        return 3.142*(radius*radius);
    }
    public double perimeter()
    {
        return 2*3.142*radius;
    }
}
public class CWS_45_PracticeSet_8 {
    public static void main(String[] args) {

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //problem 1=>creating class employee with properties and methods
        Employee obj1=new Employee();
        ///seting salary
        obj1.setSalary(400000);
        System.out.println("salary:"+obj1.getSalary());
        ///seting name
        obj1.setName("Ram");
        System.out.println("name:"+obj1.getName());

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //problem2=>create class mobile and ringing vibrating methods
        Mobile obj2=new Mobile();
        obj2.ringing();
        obj2.vibrating();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //problem3=> class square
        Square obj3=new Square();
        System.out.println("area of square:"+obj3.area());
        System.out.println("perimeter of square:"+obj3.perimeter());

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //problem4=> class rectangle
        Rectangle obj4=new Rectangle();
        obj4.setLengthBreadth(4,5);
        System.out.println("area of rect:"+obj4.area());
        System.out.println("perimeter of rect:"+obj4.perimeter());

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //problem5=>class circle
        Circle obj5=new Circle();
        obj5.setRadius(5);
        System.out.println("area of circle:"+obj5.area());
        System.out.println("perimeter of circle:"+obj5.perimeter());
    }
}
