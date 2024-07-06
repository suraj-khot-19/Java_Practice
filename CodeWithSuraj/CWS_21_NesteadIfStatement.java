package CodeWithSuraj;

public class CWS_21_NesteadIfStatement
{
    public static void main(String[] args) {
         /*
         if(condition 1)
         {
            //if condition is true;

            if(condition 1.1)
            {
                //if condition 1 is true and condition 1.1 is true
            }
         }

          */
        int age=18;
        if (age>=18)
        {
            System.out.println("your verification is started");
            if(age>=18)
            {
                System.out.println("you can go and apply for licence");
                if(age>18)
                {
                    System.out.println("you can drive");
                }
            }
        }
    }
}
