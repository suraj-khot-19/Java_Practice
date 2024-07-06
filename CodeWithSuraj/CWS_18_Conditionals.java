package CodeWithSuraj;

import java.util.Objects;
import java.util.Scanner;

public class CWS_18_Conditionals {
    public static void main(String[] args) {
        //1.   simple if

        /*
        if(condition){
            //if condition is true;
           }
        //other code
         */


        //2. if-else statement
        /*
        if(condition){
            //if condition is true;
           }
         else{
            //if all conditions are false
         }
         */


        //3.    if-else if-else statement
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


        Scanner sc = new Scanner(System.in);
        System.out.println("enter user name:");
        String usr = sc.nextLine();

//1
/*
        if(usr.equals("suraj") || usr.equals("Suraj") )
        {
            System.out.println("yes! login successful");
        }
        else
        {
            System.out.println("not! your account is not valid");
        }

 */

        //2
        /*
        if(usr.equals("suraj"))
        {

            System.out.println("enter user password:");
            String pass=sc.nextLine();
            if(pass.equals("Suraj@rowdy"))
            {
                System.out.println("yes! login successful");
            }
        }
        else
        {
            System.out.println("not! your account is not valid");
        }

         */


        //3
        /*if(usr.equals("suraj"))
        {
            System.out.println("enter user password:");
        }
        else if (usr.equals("Suraj"))
        {
            System.out.println("enter user password");
        }
        else if (usr.equals("SURAJ"))
        {
            System.out.println("enter user password");
        }
        */
        //instead of using this much ifelse statements i will use usr.equalsIgnoreCase() method
        if (usr.equalsIgnoreCase("suraj")) {
            System.out.println("enter password");
            String pass = sc.nextLine();
            if (pass.equals("Suraj@rowdy")) {
                System.out.println("yes! login successful");
            }
        } else {
            System.out.println("account not valid!");
        }
        System.out.println("Welcome to my page");


    }

}
