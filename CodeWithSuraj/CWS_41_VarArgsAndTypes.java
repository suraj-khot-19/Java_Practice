package CodeWithSuraj;

public class CWS_41_VarArgsAndTypes {
    //type 1 which can accept null argument
    public static int sum(int ...arr){
        //it will available as int[] arr means as an array
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }

    //type 1 which can accept null argument
    public static int sumType2(int z,int ... arr){
        //it will available as int[] arr means as an array
        int result=z;   //and must initialize with first argument
        for(int a:arr){
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("for type 1");
        //for type 1
        System.out.println("\n\nsum of nothing:"+sum()); //it can accept null argument
        System.out.println("sum of 1:"+sum(1));
        System.out.println("sum of 1,2:"+sum(1,2));
        System.out.println("sum of 1,2,3:"+sum(1,2,3));
        System.out.println("sum of 56,-66:"+sum(56,-66));
        System.out.println("sum of 0,-0:"+sum(0,-0));


        System.out.println("for type 2");
        //for type 2
        //error=> System.out.println("sum of nothing:"+sumType2()); //it can not  accept null argument
        System.out.println("sum of 1:"+sumType2(1));
        System.out.println("sum of 1,2:"+sumType2(1,2));
        System.out.println("sum of 1,2,3:"+sumType2(1,2,3));
        System.out.println("sum of 56,-66:"+sumType2(56,-66));
        System.out.println("sum of 0,-0:"+sumType2(0,-0));
    }
}
