package CodeWithSuraj.CWS_InterviewQuestions;

import java.util.Scanner;

/*
You are given a function.
int CheckPassword(String str, int n);
The function accepts string str of size n as an argument. Implement the function which returns 1
if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.
•	– At least 4 characters
•	– At least one numeric digit
•	– At Least one Capital Letter
•	– Must not have space or slash (/)
•	– Starting character must not be a number
Assumption:
Input string will not be empty.
Example:
Input 1:
aA1_67
Input 2:
a987 abC012
Output 1:
1
Output 2:
0

 */
public class CWS_07_PasswordCheck {
    public static int CheckPassword(String str, int n){
        if (n<4){
            return 1;
        }
        //work
        char[] ch=new char[n];
        for (int i=0;i<n;i++){
            ch[i]=str.charAt(i);
        }
        for (int i=0;i<n;i++){

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a password:");
        String str=sc.nextLine();
        System.out.println(CheckPassword(str,str.length()));
    }
}
