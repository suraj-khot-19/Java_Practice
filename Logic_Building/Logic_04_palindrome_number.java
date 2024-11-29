public class Logic_04_palindrome_number {
    public static void main(String[] args) {
        int x=12121;
        int original=x;
        int rev=0;
        while (x > 0) {
            rev=rev*10+x%10;
            x/=10;
        }
        if (original==rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
