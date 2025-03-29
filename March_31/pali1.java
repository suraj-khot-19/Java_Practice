package March_31;

import java.util.Scanner;

public class pali1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ori = x;
        int rev = 0;

        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        if (rev == ori) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome!");
        }
    }
}
