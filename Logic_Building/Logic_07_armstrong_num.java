public class Logic_07_armstrong_num {
    public static void main(String[] args) {
        int x = 120; //153,1634
        int original = x;

        int count = 0;
        double arm = 0;

        while (x > 0) {
            count++;
            x = x / 10;
        }

        x = original; //reset

        while (x > 0) {
            int num = x % 10;
            arm += Math.pow(num, count);
            x /= 10;
        }

        if ((int)arm==original){
            System.out.println("armstrong number");
        }else{
            System.out.println("not an armstrong number");
        }
    }
}
