package CodeWithSuraj;

public class CWS_32_ArraysInJava
{
    public static void main(String[] args)
    {
        //array is a collection of similar type of data => datatype[] arrayname;
        //int[] marks;        //initializing array

        //array creating methods
        //1
        int[] marks;    //->declaration
        marks=new int[5];   //->memory allocation 4*5=>20 bytes

        //2
        String[] MyStringArr=new String[5]; //->declaration + memory allocation

        //3
        String[] name={"suraj","shubham","ram"};    //->declaration + memory allocation + initialization

        //array index start from zero ends with n-1 where n is an length of an array

        //accessing array elements
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        //System.out.println(name[3]);  => error->Index 3 out of bounds for length 3

    }
}
