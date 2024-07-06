package CodeWithSuraj;
import java.util.Scanner;
public class CWS_07_PercentageOfSub {
    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your marks of listed subjects out of 100");
            System.out.println("cyber security:");
            float s1=sc.nextFloat();
            System.out.println("software testing:");
            float s2=sc.nextFloat();
            System.out.println("cloud computing:");
            float s3=sc.nextFloat();
            System.out.println("Artificial intelligence:");
            float s4=sc.nextFloat();
            System.out.println("Big Data:");
            float s5=sc.nextFloat();
            float TotalMarks=s1+s2+s3+s4+s5;
            System.out.println("Total Marks:"+TotalMarks+"/500");
            float percentage=(TotalMarks/5);
            System.out.println("total percentage:"+percentage+"/100");
            sc.close();
        }

    }

