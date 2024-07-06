package CodeWithSuraj;

import java.util.Scanner;

public class CWS_17_PracticeSet_3 {
    public static void main(String[] args) {
        //p1=>updating stingg itself in lower case
        String str1="Suraj Khot";
        str1=str1.toLowerCase();
        System.out.println(str1);

        //p2=>converting spaces to _ underscore
        String str2="   hello   my  name   is   suraj   ";
        str2=str2.replace(" ", "_");
        System.out.println(str2);

        //p3=>creating letter temp where we can replace <name> with user name
        Scanner sc=new Scanner(System.in);
        System.out.println("enter letter receiver name: ");
        String n=sc.nextLine();
        String letter="dear <name>, his is awesome \n \t Jay Siya Ram";
        letter=letter.replace("<name>",n);
        System.out.println(letter);

        //p4=>to detect double and triple quote
        String str4="this have  double space and  triple spaces";
        //double space
        if(str4.indexOf("  ")>=0)
        {
            System.out.println("it contain double quotes");
        }
        else
        {
            System.out.println("can not contain triple spaces");
        }
        //triple spaces
        if(str4.indexOf("   ")>=0)
        {
            System.out.println("it contain double & triple quotes");
        }
        else
        {
            System.out.println("can not contain double & triple spaces");
        }

        //p5=>using escape sequences print letter format
        String str5="\n______ letter to ram : _______ \n hello ram,\n\t\tI love you.\n\t\tThank you.";
        System.out.println(str5);
    }
}
