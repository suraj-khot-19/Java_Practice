package CodeWithSuraj;

import java.util.Scanner;

public class CWS_24_EnhancedSwitch
{
    public static void main(String[] args) {

        /*
        DataType a;

        switch(a)
        {
            case 1 -> statement1;
            case 2 -> {
                        statement2;
                        statement 2.2;
                        }
            case 3 -> statement1;
            .
            .
            .
            default -> statement1;
        }
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your profession:");
        String str=sc.nextLine();

        switch (str)
        {
            case "student" -> System.out.println("hello,student ....");
            case "employee" -> {
                                System.out.println("hello,employee...");
                                System.out.println("which is your company");
                                }
            case "parent" -> System.out.println("hello,parent...");

            default -> System.out.println("suggest us new professions");
        }


    }
}
