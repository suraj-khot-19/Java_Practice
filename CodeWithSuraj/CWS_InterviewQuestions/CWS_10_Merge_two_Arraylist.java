package CodeWithSuraj.CWS_InterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CWS_10_Merge_two_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        //merging
        ArrayList<Integer> merged=new ArrayList<>();
        merged.addAll(list1);
        merged.addAll(list2);

        //printing merged
        System.out.println("merged:"+merged);

        //now removing duplicated
        Set<Integer> uniqueSet=new HashSet<>(merged);

        //now casting
        ArrayList<Integer> uniqueArray=new ArrayList<>(uniqueSet);

        //printing
        System.out.println("unique:"+uniqueArray);

    }
}
