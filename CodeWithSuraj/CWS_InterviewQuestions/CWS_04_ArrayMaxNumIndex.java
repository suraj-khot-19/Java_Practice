/*
Find the maximum value and its index in the array
Problem Statement :
You are given a function, void MaxInArray(int arr[], int length); The function accepts an integer array ‘arr’ of size ‘length’ as its argument. Implement the function to find the maximum element of the array and print the maximum element and its index to the standard output

 */
package CodeWithSuraj.CWS_InterviewQuestions;

import java.sql.Array;
import java.util.Scanner;

class array{
    public void MaxInArray(int arr[], int length){
        int temp=0,n=0;
        for (int i=0;i<length;i++){
            if(arr[i]>=temp){
                temp=arr[i];
                n=i;
            }
        }
        System.out.println("max element: "+temp+" at the index of: "+n);

    }
}
public class CWS_04_ArrayMaxNumIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size that you are going to enter:");
        int l=sc.nextInt();
        int[] arr=new int[l];
        for (int i=0;i<l;i++){
            System.out.println("enter "+i+"th element");
            arr[i]=sc.nextInt();
        }
        int len= arr.length;
        array a=new array();
        a.MaxInArray(arr,len);
    }
}
