package CodeWithSuraj;
import java.util.Random;
import java.util.Scanner;
/*
    Create a class Game, which allows a user to play "Guess the Number game once, Game should have the following methods:

    1. Constructor to generate the random number
    2. takeUserInput to take a user input of number
    3. IsCorrectNumber() to detect whether the number entered by the user is true
    4. getter and setter for noOfGuesses
    Use properties such as noOfGuesses(int), etc to get this task done!
     */

class GuessNoGame{
    //to generate random number btn 1 to 100
    Random rand=new Random();

    //scanner class to read a user input
    Scanner sc=new Scanner(System.in);
    public static int x,num,count=0;

    //constructor
    public GuessNoGame(){
        x=rand.nextInt(101);
    }
    public void takeUserInput()
    {
        System.out.println("Enter random number between 1-100:");
        num=sc.nextInt();
    }
    public void IsCorrectNumber(){
        do{
            if (num > x) {
                System.out.println("your guess is greater than computer guessed number plz take one more chance...");
            } else  {
                System.out.println("your guess is less than computer guessed number plz take one more chance...");
            }
            takeUserInput();
            count++;
        }while (num!=x);
        System.out.println("contract's your guess is correct!\nBut you take _* "+count+" *_ number of guesses to reach a guessed number......");

    }
}
public class CWS_50_Exercise_3_GuessGame {
    public static void main(String[] args) {
        GuessNoGame obj=new GuessNoGame();
        obj.takeUserInput();
        obj.IsCorrectNumber();
    }
}
