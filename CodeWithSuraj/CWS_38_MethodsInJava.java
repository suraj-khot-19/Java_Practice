package CodeWithSuraj;

public class CWS_38_MethodsInJava {
//if we make any method static then need not to make object in main
    static int add(int x, int y)
    {
        int c=x+y;
        return c;
    }
    static int sub(int x,int y)
    {
        int c=x-y;
        return c;
    }
    public int mul(int x,int y)
    {
        int c=x*y;
        return c;
    }
    public int div(int x,int y)
    {
        int c=x/y;
        return c;
    }
    public static void main(String[] args) //main is also a method
    {
        int a=10,b=20;
        System.out.println(add(a,b));
        System.out.println(sub(a,b));

        //non static methods must be accessed by using object
        CWS_38_MethodsInJava obj=new CWS_38_MethodsInJava();
        System.out.println(obj.mul(a,b));
        System.out.println(obj.div(a,b));
    }
}
