package CodeWithSuraj;

import java.util.*;

public class CWS_74_Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> names=new HashMap<>();

        names.put("suraj",1);
        names.put("Sohan",2);
        names.put("sohan",3);
        names.put("Suraj",4);
        names.put("suraj",5);
        names.put("sohan",6);

        System.out.println(names);

        System.out.println(names.containsKey("suraj"));
        System.out.println(names.get("suraj"));

        Set<Map.Entry<String, Integer>> entries = names.entrySet();
        System.out.println(entries);

        Set<String> strings = names.keySet();
        System.out.println(strings);

        Collection<Integer> values = names.values();
        System.out.println(values);
    }
}
