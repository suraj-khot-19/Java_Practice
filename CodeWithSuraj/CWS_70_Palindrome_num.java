package CodeWithSuraj;

public class CWS_70_Palindrome_num {
    public static void main(String[] args) {
        int i=1221;
        int original=i;
        int reverse=0;

        while (i>0){
            reverse=reverse*10+i%10;
            i/=10;
        }

        if (reverse==original){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
