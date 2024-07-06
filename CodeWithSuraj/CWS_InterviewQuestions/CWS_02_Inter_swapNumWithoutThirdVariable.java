package CodeWithSuraj.CWS_InterviewQuestions;

import java.util.Scanner;

public class CWS_02_Inter_swapNumWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("numbers before swapping: a:"+a+",b:"+b);
        //10,20
        b=a+b;  //b=30;
        a=b-a;  //a=30-10=>20
        b=b-a;  //a=20, b=30-20;
        System.out.println("numbers after swapping: a:"+a+",b:"+b);

    }
}
