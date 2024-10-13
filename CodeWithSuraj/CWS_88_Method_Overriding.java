package CodeWithSuraj;

class PARENT{
   int height(){
       return 155;
    }
}
class CHILD extends PARENT{
    @Override
    int height(){
       return 154;
    }
}
public class CWS_88_Method_Overriding {
    public static void main(String[] args) {
        PARENT child=new CHILD();

        System.out.println(child.height());
    }
}
