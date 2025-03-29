/*

     *
    * *
   * * *
  * * * *
 * * * * *

 */


public class CWS_09_left_side_pattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int z = 5 - i; z >= 0; z--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
