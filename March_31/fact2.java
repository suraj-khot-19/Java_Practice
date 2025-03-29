package March_31;

import java.util.Scanner;

class factorial {
    public static int find(int x) {
        if (x < 1) {
            return 1;
        }
        return x * find(x - 1);
    }
}

public class fact2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println(factorial.find(x));
        ;
    }
}
