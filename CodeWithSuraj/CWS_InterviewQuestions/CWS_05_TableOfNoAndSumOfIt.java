package CodeWithSuraj.CWS_InterviewQuestions;

import java.util.Scanner;

/*
Problem: Write a program in C to display the table of a number and print the sum of all the multiples in it.
 */
class table{
    public void TableAndSum(int x){
        int sum=0,tablemul=0;
        for(int i=1;i<=10;i++){
            tablemul=x*i;
            sum=sum+tablemul;
            System.out.println(x+"X"+i+":"+tablemul);
        }
        System.out.println("sum:"+sum);
    }
}
public class CWS_05_TableOfNoAndSumOfIt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter which non zero number's table you want and its sum you want to find:");
        int num=sc.nextInt();
        table t=new table();
        t.TableAndSum(num);
    }
}
