package CodeWithSuraj;
//************  ---  one java file contain only one public class  ----- ************//
class MyClass
{
    int id;
    String name;
    //creating method
    public void getValues()
    {
        System.out.println("\nprinting values with help of method");
        System.out.println("my id :"+id);
        System.out.println("my name :"+name);
    }
}
public class CWS_44_CustomClass {
    public static void main(String[] args) {
        //to access external classes we need to create an object
        MyClass obj=new MyClass();

        //setting values with the help of objects
        obj.id=111;
        obj.name="suraj";

        //printing Attributes
        System.out.println(obj.id);
        System.out.println(obj.name);

        //printing values with the help of method
        obj.getValues();
    }
}
