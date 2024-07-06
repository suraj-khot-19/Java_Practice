package CodeWithSuraj;

public class CWS_30_BreakAndContinue {
    public static void main(String[] args) {
 /*
        //break will exit the loop
        for (int i=0;i<5;i++)
        {
            System.out.println(i);
            if (i==3)
            {
                break;
            }
        }
        int i=0;
        while(i<=5)
        {
            if (i==3)
                break;
            System.out.println(i);
            i++;
        }
*/
        //continue will skip the specified iteration
        for (int i=0;i<5;i++)
        {
            if (i==3)
            {
                continue;
            }
            System.out.println(i);
        }
        int x=0;
        while (x<5)
        {
            x++;
            if (x==2)
            {
                continue;
            }
            System.out.println(x);

        }
    }
}
