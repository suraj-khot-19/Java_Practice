package CodeWithSuraj;
class MyEmployee{
    int id;
    String name;

    //setter=>setting a value to an any variable=>it must be void return type cause it cant return any value
    public void setId(int i) {
        this.id = i;
    }
    public void setName(String n){
        this.name=n;
    }

    //getter=>getting a value from any variable=>it can be int,String,char,.... return type except void for good programmers
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
}
public class CWS_46_GetterSettersInJava {
    public static void main(String[] args) {
        //creating object
        MyEmployee obj=new MyEmployee();
        //setting values
        obj.setId(20);
        obj.setName("Suraj");
        //getting values
        System.out.println("my id:"+obj.getId());
        System.out.println("my name:"+obj.getName());
    }
}
