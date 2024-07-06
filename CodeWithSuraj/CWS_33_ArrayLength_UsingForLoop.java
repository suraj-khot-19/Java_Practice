package CodeWithSuraj;

public class CWS_33_ArrayLength_UsingForLoop {
    public static void main(String[] args) {
        int[] marks={80,90,60,70,98};
                    //0//1//2//3//4 =>size 5
        //  .length is a way to print a length of an array

        System.out.println(marks.length);   //5

        //printing array using for loop
        for (int i=0;i<marks.length;i++)    //=> just lees than <
        {
            System.out.println(marks[i]);
        }


        float[] Farray={90.60f,70.0f,80,90,100};
        for (int i=0;i<Farray.length;i++)    //=> just lees than <
        {
            System.out.println(Farray[i]);
        }


        //Q.printing array elements in reverse order
        float[] FArray={10,20,30,40,50,60.90f,70,80,90,100.0f};
        System.out.println("\n arrray in reverse order:");
        for (int i=FArray.length-1;i>=0;i--)    // => greater than equals to >=
        {
            System.out.println(FArray[i]);
        }
    }
}
