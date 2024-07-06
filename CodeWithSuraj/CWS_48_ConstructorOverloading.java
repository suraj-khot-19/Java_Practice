package CodeWithSuraj;

public class CWS_48_ConstructorOverloading {
    int id=20;
    String name="Suraj";
    int salary=5000;
    public CWS_48_ConstructorOverloading(){
        System.out.println("my id="+id);
        System.out.println("my name="+name);
        System.out.println("my salary="+salary);

    }
    public CWS_48_ConstructorOverloading(int i){
        this.id=i;
        System.out.println("my id="+id);
        System.out.println("my name="+name);
        System.out.println("my salary="+salary);

    }
    public CWS_48_ConstructorOverloading(int i,String n){
        this.id=i;
        this.name=n;
        System.out.println("my id="+id);
        System.out.println("my name="+name);
        System.out.println("my salary="+salary);

    }
    /*
    error=>cause it CWS_48_ConstructorOverloading(int i){} same as this means compiler confuse if we  just pass
    an int argument then which constructor to call

    public CWS_48_ConstructorOverloading(int s){

        this.salary=s;
        System.out.println("my id="+id);
        System.out.println("my name="+name);
        System.out.println("my salary="+salary);
    }

     */
    public CWS_48_ConstructorOverloading(int i,String n,int s){
        this.id=i;
        this.name=n;
        this.salary=s;
        System.out.println("my id="+id);
        System.out.println("my name="+name);
        System.out.println("my salary="+salary);
    }
    public static void main(String[] args) {
        CWS_48_ConstructorOverloading obj=new CWS_48_ConstructorOverloading();
        //don't need this print statement cause it automatically run after creating an object
        // System.out.println(obj);
        CWS_48_ConstructorOverloading obj1=new CWS_48_ConstructorOverloading(500);
        CWS_48_ConstructorOverloading obj2=new CWS_48_ConstructorOverloading(600,"Ram");
        CWS_48_ConstructorOverloading obj3=new CWS_48_ConstructorOverloading(5,"Shri Ram",500000000);
    }
}
