package March_31;

import java.util.Scanner;

public class fact1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int fact=1;
        for (int i=1;i<=x;i++){
            fact*=i;
        }
        System.out.println("factorial of "+x+" is : "+fact);
    }
}
