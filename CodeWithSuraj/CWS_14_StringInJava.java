package CodeWithSuraj;
import java.util.Scanner;
public class CWS_14_StringInJava {
    public static void main(String[] args) {
            //strings are immutable and can-not be changed =>primitive data type also a class
            //way to create String
            String str1="JAY SHREE RAM";
            String str2=new String("Jay Siya Ram");		//str1 and str2 are reference and "jay shree ram" is object

            //way to print string
            System.out.println(str1);
            System.out.println(str2);

            System.out.print(str1);
            System.out.println(str2);


            System.out.printf("%s",str1);
            System.out.printf("%s",str2);

            System.out.format("%s",str1);
            System.out.format("%s",str2);

            //reversing a string
        String s="madamxx";
        String ss="";
        char ch;
        for (int i=0;i<s.length();i++)
        {
                ch=s.charAt(i);
                ss=ch+ss;
        }
            System.out.println("Reversed word: "+ ss);


        
		/*
		float f=1.123456f;
		System.out.printf(" %f ",f);
		*/

            //input from user
            Scanner sc=new Scanner(System.in);

            System.out.println("enter any String 1:");
            String str3=new String(sc.nextLine());
            System.out.println(str3);

            System.out.println("enter any String 2:");
            String str4=sc.nextLine();
            System.out.println(str4);


            sc.close();
        }

    }

