package CodeWithSuraj;

import java.util.Scanner;

public class CWS_82_Prime_Number {
    public static boolean isPrime(int n){
        if(n<=1){
           return false;
        }else{
            for (int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();

        boolean prime=isPrime(x);

        if(prime)
            System.out.println(x+" Prime number");
        else
            System.out.println(x+" Not Prime number");
    }
}
