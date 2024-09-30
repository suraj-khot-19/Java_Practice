package CodeWithSuraj;

import java.util.ArrayList;

public class CWS_78_Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(10);
        list.add(10);
        list.add(15);
        list.add(16);

        System.out.println(list);

        list.set(1,0);
        list.set(2,1);
        list.set(3,2);

        System.out.println(list);

        System.out.println(list.contains(5));
        System.out.println(list.get(4));
    }
}
