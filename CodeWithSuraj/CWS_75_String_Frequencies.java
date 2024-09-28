package CodeWithSuraj;

import java.util.HashMap;

public class CWS_75_String_Frequencies {
    public static void main(String[] args) {
        String s="surajsanjaykhot";

        HashMap<Character,Integer> map=new HashMap<>();

        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        System.out.println(map);
    }
}
