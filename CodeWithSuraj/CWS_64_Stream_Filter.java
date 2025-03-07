package CodeWithSuraj;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CWS_64_Stream_Filter {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Stream<Integer> even=list.stream().filter(n->n%2==0);

        List<Integer> evenLists = even.toList();
        System.out.println(evenLists);
    }
}
