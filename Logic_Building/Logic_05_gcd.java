public class Logic_05_gcd {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 16;
        int gcd = 1;

        for (int i=Math.min(n1,n2); i>=1; i--){
            if (n1%i==0 && n2%i==0){
                gcd=i;
                break;
            }
        }

        System.out.println("gcd:"+gcd);
    }
}
