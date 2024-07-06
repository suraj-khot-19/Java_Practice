package CodeWithSuraj;
import java.util.Scanner;
import java.util.Random;
public class CWS_26_RockPaperCisearGame {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Random rand=new Random();



        int ccount=0,pcount=0,count=0;

        while (count<=5)
        {
            int cchoice=rand.nextInt(3);
            System.out.println("enter your choice: \n 0.Rock \n 1.paper \n 2.Scissor");
            int pchoice= sc.nextInt();

            if(cchoice==pchoice)
            {
                System.out.println("both have same choice "+cchoice+","+pchoice);
                pcount++;
                ccount++;
            }
            else if (cchoice==0 && pchoice==2 || cchoice==1 && pchoice==0 ||cchoice==2 && pchoice==1)
            {
                System.out.println("computer win its choice was:"+cchoice+" and your choice was:"+pchoice);
                ccount++;
            }
            else
            {
                System.out.println("you win because your choice is: "+pchoice+" computer choice was:"+cchoice);
                pcount++;
            }
            System.out.println("Your score board is \n you:"+pcount+" computer:"+ccount);
            count++;
        }
        System.out.println("\n *********-> total points <-**********\n");
        System.out.println("You:"+pcount+", computer:"+ccount);
        if (pcount>ccount)
        {
            System.out.println("\n *******=> Congratulations You Win ");
        }
        else
        {
            System.out.println("\n Sorry you lose Haaahaha");
        }
    }
}
