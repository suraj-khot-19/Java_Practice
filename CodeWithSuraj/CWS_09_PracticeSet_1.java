package CodeWithSuraj;
import java.util.Scanner;
public class CWS_09_PracticeSet_1 {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your name:");
            String name=sc.nextLine();
            System.out.println("hello "+name+", have a good day");

            System.out.println("enter value in kilometer");
            float km=sc.nextFloat();
            double mi=km*0.621371192;
            System.out.println(mi+"miles");

            System.out.println("enter integer value:");
            boolean b=sc.hasNextInt();
            System.out.println(b);
        }

    }

