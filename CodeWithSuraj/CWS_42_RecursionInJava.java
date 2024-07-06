package CodeWithSuraj;

public class CWS_42_RecursionInJava {
    //using recursion means calling function/method in its own body
    public static int factorial_using_recursion(int i)
    {
        if (i==0||i==1)
        {
            return 1;
        }
        else
        {
            return i*factorial_using_recursion(i-1);    //calling function again nd again
        }
    }
    public static int factorial_without_recursion(int x)
    {
        int fact=1;
        for (int i=x;i>=1;i--)
        {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        System.out.println("factorial of 5 using recursion:"+factorial_using_recursion(5));
        System.out.println("factorial of 5 without recursion:"+factorial_without_recursion(5));

    }
}
