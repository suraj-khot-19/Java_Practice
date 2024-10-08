package CodeWithSuraj;

public class CWS_83_reverse_string_without_using_method {
    public static void main(String[] args) {
        String s="Suraj Khot";

        String rev="";

        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            rev+=ch;
        }

        System.out.println(rev);
    }
}
