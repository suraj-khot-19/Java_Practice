//gum -> mug anagram


import java.util.Arrays;
import java.util.Scanner;

public class Logic_08_anagram_string {
    public static String lowerString(String s){
        String x = s.replaceAll("\\s+", "").toLowerCase();
        System.out.println(x);
        return  x;
    }

    public static boolean isAnagram(String s1,String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }else{
           char[] arr1=s1.toCharArray();
           char[] arr2=s2.toCharArray();

            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1,arr2);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter two string");
        String s1=sc.nextLine();
        sc.next();
        String s2=sc.nextLine();

        boolean anagram = isAnagram(lowerString(s1),lowerString(s2));

        if (anagram){
            System.out.println("Strings are an anagram");
        }else{
            System.out.println("Strings are Not an anagram");
        }
    }
}
