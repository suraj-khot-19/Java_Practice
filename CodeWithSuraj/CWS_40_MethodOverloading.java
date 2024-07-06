package CodeWithSuraj;

public class CWS_40_MethodOverloading {
    static int add(){
        return 0;
    }

    static int add(int x){
        return x;
    }

    static int add(int x,int y){
        return x+y;
    }

    /*
    error cause void int are change in return type but not valid in method overloading
    static void add(int x,int y){
        System.out.println(x+y);
    }
    */

    public static void main(String[] args) {
        int x=30,y=50;
        System.out.println(add());
        System.out.println(add(x));
        System.out.println(add(x,y));
    }
}
