import java.util.Arrays;

public class Logic_03_palindrome_string {
    public static void main(String[] args) {
        String s="sos",rev="";

        for (int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }

        if (s.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
