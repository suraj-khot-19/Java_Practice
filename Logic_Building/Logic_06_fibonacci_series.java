public class Logic_06_fibonacci_series {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int series=10;

        System.out.println(n1);
        System.out.println(n2);

        for (int i=3;i<=series;i++){
            int next = n1 + n2;
            System.out.println(next);
            n1=n2;
            n2=next;
        }
    }
}
