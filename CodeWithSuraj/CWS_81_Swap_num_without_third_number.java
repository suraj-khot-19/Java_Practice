package CodeWithSuraj;

public class CWS_81_Swap_num_without_third_number {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        b=a+b;
        a=b-a;
        b=b-a;

        System.out.println(a);
        System.out.println(b);
    }
}
