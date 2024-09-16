package CodeWithSuraj;

import java.util.HashSet;
import java.util.Iterator;

public class CWS_72_Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        set.add(5);
        set.add(7);
        set.add(5);
        set.add(6);

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(4));
        System.out.println(set.remove(5));


        Iterator<Integer> i=set.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
