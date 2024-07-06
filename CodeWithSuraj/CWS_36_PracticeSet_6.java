package CodeWithSuraj;

import java.util.Arrays;

public class CWS_36_PracticeSet_6 {
    public static void main(String[] args) {
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //1  problem
        //create array of 5 floats and print their sum
        //using for
        float[] p1={10.50f,20.50f,30.50f,40.50f,50.50f};
        float p1Sum=0.0f;
        for (int i=0;i<p1.length;i++)
        {
            p1Sum+=p1[i];
        }
        System.out.println("sum of array p1 using for:"+p1Sum);
        // using for each
        p1Sum=0;
        for (float element:p1)
        {
            p1Sum+=element;
        }
        System.out.println("sum of array p1vusing foreach:"+p1Sum);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //problem 2
        //to check given element is present in array ir not
        int[] p2={1,2,3,4,5};
        int num=6;
        boolean NumPresent=false;
        for (int i=0;i<p2.length;i++)
        {
            if(num==p2[i])
            {
                NumPresent=true;
                break;
            }
        }
        if (NumPresent==true)
            System.out.println("number "+num+" is present in array");
        else
            System.out.println("number "+num+" is *not present in array");

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //problem 3
        //calculate average marks of student from an array
        double[] p3={50.60,70.80,90,80.95,45,45.70,60};
        double sum=0;
        for (double element:p3)
        {
            sum+=element;
        }
        System.out.println("average marks of student *p3:"+(sum/p3.length));
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //problem 4
        //pgm to add two matrix of size 2X3
        int[][] p4_1={{1,2,3},{4,5,6}};
        int[][] p4_2={{10,20,30},{40,50,60}};
        int[][] p4_final = new int[2][3];
        sum=0;
        for (int i=0;i<p4_1.length && i<p4_2.length;i++)
        {
            for (int j=0;j<p4_1[i].length && j<p4_2[i].length;j++)
            {
                p4_final[i][j]=p4_1[i][j]+p4_2[i][j];
            }
        }
        for (int i=0;i<p4_final.length;i++)
        {
            for (int j=0;j<p4_final[i].length;j++)
            {
                System.out.print(p4_final[i][j]+" ");
            }
            System.out.println(" ");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //problem 5
        //reverse the element of an array 2-d
        int[][] p5={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("\narray *p5 is:");
        for (int i=0;i<p5.length;i++)
        {
            for (int j=0;j<p5[i].length;j++)
            {
                System.out.print(p5[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("\narray *p5 in reverse order:");
        int i=0,j=0;

        for (i=p5.length-1;i>=0;i--)
        {
            for(j=p5.length-1;j>=0;j--)
            {
                System.out.print(p5[i][j]+" ");
            }
            System.out.println(" ");
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //problem 6
        //reverse the element of an array 1-d using logic of math
        int[] p6={1,2,3,4,5,6,7};
        int n=Math.floorDiv(p6.length,2);
        int l=p6.length,temp=0;
        for (i=0;i<n;i++)
        {
           /*
            |3| |4| | |
            a    b   temp
            */
            temp=p6[i];
            p6[i]=p6[l-1-i];
            p6[l-1-i]=temp;
        }
        System.out.println("\narray *p6 in reverse order using math logic:");
        for (int elemtn:p6)
        {
            System.out.print(elemtn+" ");
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //problem 7
        //find minimum and maximum number in array
        int[] p7={90,70,-70,80,-110};

        //finding minimum value
        /****************************************star_point********************************/
        int min=Integer.MAX_VALUE;
        /****************************************star_point********************************/
        for(int x:p7)
        {
            if(x<=min)
                min=x;
        }
        System.out.println("\n minimum element in *p7 is:"+ min);



        //finding max value
        /****************************************star_point********************************/
        int max=Integer.MIN_VALUE;
        /****************************************star_point********************************/
        for(int x:p7)
        {
            if(x>=max)
                max=x;
        }
        System.out.println("\n maximum element in *p7 is:"+ max);


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //problem 8
        //sorting array
        int[] p8={7,4,5,1,0,9,-7};
        temp=0;
        int minv=Integer.MAX_VALUE;
        for (i=0;i<p8.length;i++)
        {
            for (j=i+1;j<p8.length;j++)
            {
                if(p8[i]>p8[j])
                {
                    /*
                        |i| |j| | |
                        a    b   temp
                    */
                    temp=p8[i];
                    p8[i]=p8[j];
                    p8[j]=temp;
                }
            }

        }
        System.out.println("\n array *p8 in sorted order:");
        for (i=0;i<p8.length;i++)
        {
            System.out.print(p8[i]+" ");
        }

        //we can also use Arrays.sort(arrayname); methods
    }
}
