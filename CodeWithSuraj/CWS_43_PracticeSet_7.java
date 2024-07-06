package CodeWithSuraj;

import java.util.Scanner;

public class CWS_43_PracticeSet_7 {
    //p1 function
    public static void MulTable(int n)
    {
        int mul=1;
        for (int i=1;i<=10;i++)
        {
            System.out.println(n+" X "+i+" = "+i*n);
        }
    }
    //p2 function
    public static void PrintPatternCorrectOrder(int r)
    {
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void PrintPatternReverseOrder(int r)
    {
        for (int i=r;i>=0;i--)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    //p3 function
    /*
    sum(n)=1+2+3+4+.....+(n-1)+n
    sum(n)=sum(n-1)+n
    sum(3)=3+sum(3-1)
    sum(3)=3+sum(2)
    sum(3)=3+2+sum(2-1)
    sum(3)=3+2+sum(1)=>1

     */
    public static int SumOfNatNum(int n)
    {
       if(n==1)
           return 1;
       return n+SumOfNatNum(n-1);
    }
    //p4 function
    public static int Fibo(int n)
    {
        /*
        if(n==1)
            return 0;
        else if (n==2)
            return 1;
         */
        if (n==1 || n==2)
            return n-1;
        else
            return Fibo(n-1)+Fibo(n-2);
    }
    //p5 function
    public static int AvgOfArgs(int ...arr)
    {
        int sum=0;
        for(int e:arr)
        {
            sum+=e;
        }
        return sum/arr.length;
    }
    //p6 function
    public static void PrintPatternCorrectOrderRecursion(int r)
    {
        System.out.println("\n correct order \n");

        if (r>0)
        {
            PrintPatternCorrectOrderRecursion(r-1);
            for (int i=0;i<r;i++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void PrintPatternReverseOrderRecursion(int r)
    {
        if (r>0)
        {
            for (int i=r;i>0;i--)
                System.out.print("* ");
            System.out.println();
            PrintPatternReverseOrderRecursion(r-1);
        }
    }
    //p7 function
    public static double CtoF(double c)
    {
        return (9/5d)*c+32;
    }
    public static double FtoC(double f)
    {
        return (f-32)*(5/9d);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //problem 1 => printing multiplication table
        System.out.println("enter which table you want:");
        int x=sc.nextInt();
        MulTable(x);


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //problem 2=> printing pattern using function
        /*
                *
                * *
                * * *
                * * * *
         */
        System.out.println("enter the row for pattern printing:");
        int row=sc.nextInt();
        System.out.println("correct order: \n");
         PrintPatternCorrectOrder(row);
        System.out.println("\n reverse order :\n");
         PrintPatternReverseOrder(row);



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //problem 3=> finding sum of n natural numbers using recursion
        System.out.println("enter the number to find sum upto that **natural number");
        int n=sc.nextInt();
        System.out.println("sum of "+n+" natural number="+SumOfNatNum(n));



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //problem 4=> returning nth term of a febonacii series-0,1,1,2,3,5.....
        System.out.println("enter which term of fibonachii series you want");
        int m=sc.nextInt();
        System.out.println(m+" th term of fibo series is:"+Fibo(m));


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //problem 5=> function to find avg of set of a numbers passed as an arguments
        System.out.println("avg of args:"+AvgOfArgs(1));
        System.out.println("avg of args:"+AvgOfArgs(1,2,3,4,5));
        System.out.println("avg of args:"+AvgOfArgs(1,0,-3,-9));
        System.out.println("avg of args:"+AvgOfArgs(111,222,333,444,555));



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        //problem 6=>printing pattern using function recursion
                /*
                        *
                        * *
                        * * *
                        * * * *
                 */
        System.out.println("enter the row for pattern printing:");
        int r=sc.nextInt();
        PrintPatternCorrectOrderRecursion(r);
        System.out.println("\n reverse order \n");
        PrintPatternReverseOrderRecursion(r);



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        //problem 7=>function to convert Celsius to Fahrenheit    f=(9/5)*cel+32
        System.out.println(" Celsius => Fahrenheit enter celcius value");
        double c= sc.nextDouble();
        System.out.println(c+"c = "+CtoF(c)+"f");
        System.out.println(" Fahrenheit => Celsius enter celcius value");
        double f= sc.nextDouble();
        System.out.println(f+"f = "+FtoC(f)+"c");
    }
}
