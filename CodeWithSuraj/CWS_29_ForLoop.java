package CodeWithSuraj;

import java.util.Scanner;

public class CWS_29_ForLoop {
    public static void main(String[] args) {
        /*
        for(initialize;bool_condition;update)
        {
            statements;
         }
         */


        for (int i=0;i<=10;i++)
        {
            System.out.println(i);
        }

        //print n odd numbers
        Scanner sc=new Scanner(System.in);
        System.out.println("enter range of input value:");
        int n= sc.nextInt();
        for (int i=0;i<=n;i++)
        {
            System.out.println(2*i+1);
        }
        //print n even numbers
        System.out.println("enter range of input value:");
        int x= sc.nextInt();
        for (int i=0;i<=x;i++)
        {
            System.out.println(2*i);
        }

        //printing n number in reverse order
        for (int i=10;i!=0;i--)
        {
            System.out.println(i);
        }


    }
}
