package CodeWithSuraj;

public class CWS_10_OperatorsInJava {
    public static void main(String[] args)
        {
            //Arithmetic operator
            System.out.println("\n arithmetic operator");
            int x=10,y=80;
            System.out.println("addition:"+(x+y));
            System.out.println("substraction:"+(x-y));
            System.out.println("multiplication:"+(x*y));
            System.out.println("division:"+(x/y));
            System.out.println("modulo operator:"+(x%y));
            x=x++;
            y=y--;
            System.out.println("post increment:"+x);//10
            System.out.println("post decrement:"+y);//80
            x=++x;
            y=--y;
            System.out.println("pre increment:"+x);//11
            System.out.println("pre decrement:"+y);//79



            //assignment operator
            System.out.println("\n assignment operator");
            int a=10;//just assign value
            a+=20;//a=a+20;	=> like -= /= *=
            System.out.println(a);
            a%=12;//a=a%12;
            System.out.println(a);



            //Comparison operator
            System.out.println("\n comparison operator");
            System.out.println(20==3);//just return boolean value  => > < >= <=


            //logical operator
            System.out.println("\n logical operator");
            System.out.println(true&&false); // && => AND operator, true if both are true T&&T=T
            System.out.println(true||true); // || => OR operator, false if both are false F||F=F
            System.out.println(!true);     // ! => NOT operator, return opposite value !T=F !F=T



            //bit-wise operator
            System.out.println("\n bit-wise operator");
            System.out.println(2&3);  //it performed on single bit's of number &=>bitwise-AND 1&1=1 otherwise 0
            /*
             * 2=>   10
             * 3=>   11
             * 		----
             * *&*	 10   =>2
             *
             */
            System.out.println(5|4);  //it performed on single bit's of number |=>bitwise-OR 0|0=0 otherwise 1
            /*
             * 5=>   101
             * 4=>   100
             * 		----
             * *|*	 101  =>5
             *
             */
        }

    }

