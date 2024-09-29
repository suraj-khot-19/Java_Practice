package CodeWithSuraj;

public class CWS_72_Factorial_Recursions {
    static int fact(int n){
        if(n!=0){
            return n*fact(n-1);
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fact(n));
    }
}
