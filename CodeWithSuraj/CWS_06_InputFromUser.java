package CodeWithSuraj;

import java.util.Scanner;
//java.util.Scanner ==> contain scanner class's multiple methods
public class CWS_06_InputFromUser {
    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);

            System.out.println("enter first number");
            int a=sc.nextInt();
            System.out.println("enter secound number");
            int b=sc.nextInt();

            System.out.println("sum of entered numbers ="+a+b); //it will add numbers as a string
            System.out.println("sum of entered numbers ="+(a+b));

            //to check correct data types
            System.out.println("enter any Input");
            boolean bool=sc.hasNextInt();
            System.out.println(bool);

            System.out.println("   ");
            //one deep knowledge of sc.next()
            System.out.println("enter string  =");
            String str1=sc.next();	//it will read only single word not line
            System.out.println("enter string  =");
            String str2=sc.nextLine();	//it will read an entire line as a str2
            System.out.println(str1);
            System.out.println(str2);
            sc.close();
        }

    }

