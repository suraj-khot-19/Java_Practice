package CodeWithSuraj;

import java.util.Scanner;

public class CWS_25_PracticeSet_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your annual income in INR lack");
        float inc=sc.nextFloat();

        if (inc<=250000)
        {
            System.out.println("no tax");
        }
        else if(inc>250000 && inc<=500000)
        {
            float tax=(5/100.0f)*inc;
            System.out.println("your income tax is:"+tax);
        }
        else if(inc>500000 && inc<=1000000)
        {
            float tax=(20/100.0f)*inc;
            System.out.println("your income tax is:"+tax);
        }
        else
        {
            float tax=(30/100.0f)*inc;
            System.out.println("your income tax is:"+tax);
        }

        //2
        System.out.println("enter day number:");
        byte day=sc.nextByte();
        switch (day)
        {
            case 1 -> System.out.println("sunday");
            case 2 -> System.out.println("monday");
            case 3 -> System.out.println("tuesday");
            case 4 -> System.out.println("wednesday");
            case 5 -> System.out.println("thursday");
            case 6 -> System.out.println("friday");
            case 7 -> System.out.println("saturday");
            default -> System.out.println("enter number less than 7");
        }

        //3
        //leap year
        System.out.println("enter year");
        int year=sc.nextInt();

        if(year % 4==0 || year % 400==0)
        {
            System.out.println("leap year:"+year);
        }
        else
        {
            System.out.println(year+" is not leap year");
        }

        //4
        System.out.println("enter the extension of website :");
        String web=new String(sc.nextLine());
        switch(web)
        {
            case ".com" -> System.out.println("commercial website");
            case ".org" -> System.out.println("organization website");
            case ".in" -> System.out.println("indian website");
            default -> System.out.println("i dont know");
        }
    }
}
