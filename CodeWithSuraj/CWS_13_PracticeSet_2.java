package CodeWithSuraj;

public class CWS_13_PracticeSet_2 {
   public static void main(String[] args) {
            float a=7/4*9/2;
            /*a=7/4*9/2
             * =1*9/2	//int/int==>int and associativity of / * => L=>R
             * =9/2
             * =4	//as resulting data type is float it will just 4.0 not like 9/2=>4.5
             */
            System.out.println(a);	//4.0

            float x=9/2;
            System.out.println(x);	//4.0   not 4.5	int/int==>int


            /*
             * encrypting and decrypting grade
             * like crypto
             */
            /*
             * with type-casting
             */
            char grade='A';
            //encrypt
            grade=(char) (grade+8);	//grade=grade+8; errror char+int=>int but grade is char so =====> type casting
            System.out.println(grade);	//I
            //decrypt
            grade=(char)(grade-8);
            System.out.println(grade);	//A
            /*
             * without type-casting
             */

            grade+=10;
            System.out.println(grade);
            grade-=10;
            System.out.println(grade);


        }

    }

