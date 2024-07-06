package CodeWithSuraj;

import java.util.Scanner;

public class CWS_22_IfElseIfLadder
{
    /*
   if(condition 1){
       //if condition is true;
      }
    else if(condition 2){
       //if condition is true;
      }
      .
      .
      .
    else if(condition n){
       //if condition is true;
      }
    else{
           //if all conditions are false
    }
    */
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        if(age<18)
        {
            System.out.println("you are not valid");
        }
        else if (age==18)
        {
            System.out.println("you go and apply for licence");
        }
        else if(age>18)
        {
            System.out.println("yes you can drive");
        }
        else
        {
            System.out.println("plz enter valid age");
        }
        System.out.println("end of if else");
    }
}
