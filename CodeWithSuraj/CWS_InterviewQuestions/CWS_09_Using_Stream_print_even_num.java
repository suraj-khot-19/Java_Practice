package CodeWithSuraj.CWS_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CWS_09_Using_Stream_print_even_num {
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5,6,7,8,9,10};
        Stream<Integer> s= Arrays.stream(arr);

        List<Integer> l=s.filter(n-> n%2==0).toList();

        System.out.println(l);
    }
}
