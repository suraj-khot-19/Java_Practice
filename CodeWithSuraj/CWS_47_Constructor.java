package CodeWithSuraj;

class My_Employee
{
     public My_Employee(int id,String name) // =>constructor can take 0 or more arguments // it not have any return type
    {
        System.out.println("my id="+id);
        System.out.println("my name="+name);
    }
}
public class CWS_47_Constructor {
    public static void main(String[] args) {
        My_Employee obj=new My_Employee(20,"suraj");    //=>after creating object constructor run automatically
    }
}
