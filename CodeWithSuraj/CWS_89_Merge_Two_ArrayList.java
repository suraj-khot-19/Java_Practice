package CodeWithSuraj;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CWS_89_Merge_Two_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1= new ArrayList<>();

        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);

        ArrayList<Integer> arrayList2=new ArrayList<>();

        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(6);
        arrayList2.add(5);

        //printing

        System.out.println("list 1: "+arrayList1);

        System.out.println("list 2: "+arrayList2);

        //arraylist is merging
        arrayList1.addAll(arrayList2);

        System.out.println("merged:" +arrayList1);

        //now removing duplicates with the help of set
        Set<Integer> set=new HashSet<>(arrayList1);

        //now converting set to arraylist
        ArrayList<Integer> uniques=new ArrayList<>(set);

        System.out.println("Uniques:"+uniques);

    }
}
