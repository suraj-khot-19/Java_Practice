package CodeWithSuraj;

import java.util.Scanner;

public class CWS_23_SwitchCaseStatement
{
    public static void main(String[] args) {
        /*
        datatype var;
        switch(var)
        {
            case 1:
                //statement1
                break;
            case 2:
                //statement2
                break;
                .
                .
                .
            case n:
                //statement n
                break;
            default:
                //statement
        }
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your profession:");
        String str=sc.nextLine();

        switch (str)
        {
            case "student":
                System.out.println("hello,student ....");
                break;
            case "employee":
                System.out.println("hello,employee...");
                break;
            case "parent":
                System.out.println("hello,parent...");
                break;
            default:
                System.out.println("suggest us new professions");
        }

        int a=10;
        switch (a)
        {
            case 1:
                System.out.println("integer is 1");
                break;
            case 2:
                System.out.println("integer is 2");
                break;
            case 10:
                System.out.println("integer is 10");
                break;
            default:
                System.out.println("dont know");
        }
    }
}
