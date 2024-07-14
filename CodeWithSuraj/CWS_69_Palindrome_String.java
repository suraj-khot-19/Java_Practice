package CodeWithSuraj;

public class CWS_69_Palindrome_String {
    public static void main(String[] args) {
        String s="Sos";
        String rev="";

        for (int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }

        if (s.toLowerCase().equals(rev.toLowerCase())){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
