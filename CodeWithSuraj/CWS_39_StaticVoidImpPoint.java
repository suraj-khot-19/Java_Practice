package CodeWithSuraj;

public class CWS_39_StaticVoidImpPoint {
    static int change1(int x){
        return x=90;
    }
    static int[] change2(int[] x){
        x[0]=3000;
        return x;
    }

    public static void main(String[] args) {
        //change 1  =>change is not valid
        int a=10;
        change1(a);
        System.out.println(a);

        //change 2  => change is valid because reference is passed
        int[] arr={1,2,3};
        change2(arr);
        System.out.println(arr[0]);
    }
}
