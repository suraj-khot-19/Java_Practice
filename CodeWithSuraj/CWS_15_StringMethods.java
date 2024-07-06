package CodeWithSuraj;

public class CWS_15_StringMethods {
    public static void main(String args[])
    {
        //String index starts from 0
        //Strings are immutable
        String name="Suraj";
        /*
            S u r a j
            0 1 2 3 4
         */

        //1 .length()
        System.out.println(name.length());

        //2 .toLowerCase()
        String str1=name.toLowerCase();
        System.out.println(str1);

        //3 .toUpperCase()
        String str2=name.toUpperCase();
        System.out.println(str2);

        //4 .trim() =>remove first and last spaces
        String name2= new String("     hello my name is suraj   ");
        String str3=name2.trim();
        System.out.println(str3);

        //5 .substring(int start); =>create substring with specifying start index
        String str4=name.substring(3);
        System.out.println(str4);

        //6 .substring(int start,int end);  =>create substring with specifying start index(includes) and end index(excludes)
        //String str5=name.substring(2,4);
        String str5=name.substring(2,5);
        System.out.println(str5);

        //7 .replace(' ' , ' ')
        //  .replace(" " , " ")
        String str6=name.replace("r","suraj");
        String str7=name.replace("r","s");
        System.out.println(str6);
        System.out.println(str7);

        //8 .startsWith()   =>return boolean    =>case-sensitive
        System.out.println(name.startsWith("s"));
        System.out.println(name.startsWith("S"));

        //9 .endsWith   =>return boolean    =>case-sensitive
        System.out.println(name.endsWith("aj"));
        System.out.println(name.endsWith("Aj"));

        //10    charAt(int i)   =>if not present return exception
        System.out.println(name.charAt(3));
        //System.out.println(name.charAt(5));

        // 11 12 13 14 returns -1 for not finding any o/p or search
        String name3="surajrajraj";
        /*
                       s u r a j r a j r a j
                       0 1 2 3 4 5 6 7 8 9 10
         */

        //11    .indexOf(String str)  =>return first occurrence index of given string
        System.out.println(name3.indexOf("raj"));

        //12    .indexOf(String s,int i)    =>return first occurrence index of given string considering i as a starting index
        System.out.println(name3.indexOf("raj",4));

        //13  .lastIndexOf(String str)    =>return occurrence index of given string str from last of that string
        System.out.println(name3.lastIndexOf("raj"));

        //14    .lastIndexOf(String s, int i)   =>return occurrence index of given string str from last of that string by considering int i as a index
        System.out.println(name3.lastIndexOf("raj",3));
        System.out.println(name3.lastIndexOf("raj",6));

        //15    .equals(String str) =>return bool   =>case-sensitive
        System.out.println(name.equals("suraj"));
        System.out.println(name.equals("Suraj"));

        //16    .equalsIgnoreCase(String str)   =>case insensitive
        System.out.println(name.equalsIgnoreCase("SuRaJ"));

    }
}
