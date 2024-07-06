package CodeWithSuraj.CWS_InterviewQuestions;

import java.util.Scanner;

public class CWS_03_Inter_swapNumWithout12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("numbers before swapping: a:"+a+",b:"+b);

        //we can swap numbers with xor
        /*  if bits are same then 0 otherwise 1
            1^1 => 0
            0^0 => 0
            1^0 => 1
            0^1 => 1
         */
        /*
                A=10=>1010
                B=20=>10100
                 A^B                     B^A
                x1010                   10100
                10100                   x1010
              ---------                -------
                11110=30                11110=30
         */
        a=a^b;  //a=30
        b=a^b;  //30^20=>10
        a=b^a;  //10^30=>20
        System.out.println("numbers after swapping: a:"+a+",b:"+b);
    }
}
