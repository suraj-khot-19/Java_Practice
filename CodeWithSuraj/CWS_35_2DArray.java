package CodeWithSuraj;

public class CWS_35_2DArray {
    public static void main(String[] args) {
        //multidimensional arrays are array of an array
        /*
        2-D
            int[][] array=new int[2][3];
               2d array          row col
               => 2 rows
               => 3 columns

         */

        int[][] flats=new int[2][3];    //declaration+memory allocation

        //initialization
        flats[0][0]=101;
        flats[0][2]=102;
        flats[0][1]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        //System.out.println(flats[0][1]);

        //accessing array elements
        for (int i=0;i<flats.length;i++)
        {
            for (int j=0;j<flats[i].length;j++)
            {
                System.out.print("flats[i][j] : "+flats[i][j]);
                System.out.print(", ");
            }
            System.out.println("");
        }

    }
}
