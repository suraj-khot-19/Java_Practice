package CodeWithSuraj;

public class CWS_04_DataTypes {
    public static void main(String[] args) {
            // data types are the types of the variables
            /*
             * primitive=>>already defined by java
             */
            byte b=23; //1 bytes
            System.out.println(b);

            short s=34;	//2 bytes
            System.out.println(s);

            int i=1; //4 bytes
            System.out.println(i);

            long l=23456789; //8 bytes
            System.out.println(l);

            float f=347979797979797979.00808999084937f; //4 bytes ,initial value 0.0f
            System.out.println(f);

            double d=1222222115; // 8 bytes,initial value 0.0d
            System.out.println(d);

            char x='s'; //2 bytes,initial value='\u0000'
            System.out.println(x);

            boolean k=false;//depends on jvm, initial value=false
            System.out.println(k);

            /*
             * non primitive data types
             * are defined by programmer
             */
            String st="suraj";
            System.out.println(st);


        }

    }


