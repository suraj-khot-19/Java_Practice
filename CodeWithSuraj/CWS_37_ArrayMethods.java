package CodeWithSuraj;

import java.sql.Array;
import java.util.Arrays;

public class CWS_37_ArrayMethods {
    public static void main(String[] args) {
        //sort method
        int[] ar1={-5,4,9,8,10,30,80,20000,500,30,-1000000};
        Arrays.sort(ar1);
        for (int x:ar1)
            System.out.println(x+" ");

    }
}
