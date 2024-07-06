package CodeWithSuraj;

import java.util.Scanner;

public class CWS_31_PracticeSet_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        //1 .sum of n even numbers      2*n
        System.out.println("enter number to sum of *n even numbers");
        int i= sc.nextInt();
        int sum=0,x=1;
        while (x<i)
        {
            sum=sum+(2*x);
            x++;
        }
        System.out.println("sum of first "+i+" even numbers:"+sum);
        */


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        //2.    sum of n odd numbers    2*n+1
        System.out.println("enter range of sum of *n odd numbers:");
        int n= sc.nextInt();
        int sum=0,x=0;
        while(x<n)
        {
            sum=sum+(2*x+1);
            x++;
        }
        System.out.println("sum of first "+n+" odd numbers:"+sum);
        */


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        /*
        //3. multiplication table of n number
        System.out.println("enter which numbers table *n you want");
        int n= sc.nextInt();
        System.out.println("table of "+n+"\n");
        int x=1;
        while (x<=10)
        {
            System.out.println(n*x);
            x++;
        }
        */

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*4. print pattern
              ****
              ***
              * *
              *
         */
        /*
        for (int i=4;i>0;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        */

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*  5.      printing pattern
            *
            **
            ***
            ****
         */
        /*
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
         */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        //6. multiplication table of *n in reverse order
        System.out.println("enter which *n table you want in rev order:");
        int c= sc.nextInt();
        for (int i=10;i>=1;i--)
        {
            System.out.printf("%d X %d= %d \n",c,i,c*i);
        }
         */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
        //7. factorial of *n numbers
        //i) for loop
        System.out.println("enter which number factorial you want:");
        int x= sc.nextInt();
        int fact=1;
        for (int i=1;i<=x;i++)
        {
            fact*=i;
        }
        System.out.printf("factorial of %d is %d",x,fact);

        //ii) while loop
        System.out.println(" \n enter which number factorial you want:");
        int n= sc.nextInt();
        int fac=1,i=1;
        while (i<=n)
        {
            fac*=i;
            i++;
        }
        System.out.printf("factorial of %d is %d",n,fac);
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        /*8. print pattern using while loop
         ****
         ***
         * *
         *
         */
        /*
        int x=4;
        while (x>0)
        {
            int i=1;
            while (i<=x)
            {
                System.out.print("*");
                i++;
            }
            System.out.print("\n");
            x--;
        }
        */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

         /*9. print pattern using while loop
         *
         **
         ***
         ****
          */
        /*
        int i=1;
        while (i<=4)
        {
            int j=1;
            while(j<=i) {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i++;
        }
         */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
        //10.pgm to calculate sum of number occurring in the multiplication table of *n th number
        System.out.println("enter your table number *n");
        int x= sc.nextInt();
        int sum=0;
        for (int i=1;i<=10;i++)
        {
            sum=sum+(i*x);
        }
        System.out.println("sum of number occurring in the multiplication table of "+x+" th number :"+sum);
        */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //11 .sum of n even numbers using for
        System.out.println("enter number to find sum of *n even numbers using for");
        int n= sc.nextInt();
        int sum=0;
        for (int i=0;i<n;i++)
        {
            sum=sum+(2*i);
        }
        System.out.println("sum of "+n+" even numbers :"+sum);

    }
}
