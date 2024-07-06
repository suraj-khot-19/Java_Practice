package CodeWithSuraj.CWS_InterviewQuestions;

import java.util.Scanner;

public class CWS_01_Inter_swapNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("numbers before swapping: a:"+a+",b:"+b);
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("numbers after swapping: a:"+a+",b:"+b);
    }
}
