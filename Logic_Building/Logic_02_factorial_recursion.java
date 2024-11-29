public class Logic_02_factorial_recursion {
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        int factOf5 = fact(5);
        int factOf7 = fact(7);

        System.out.println(factOf5);
        System.out.println(factOf7);
    }
}
