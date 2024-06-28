package CodeWithSuraj;

public class CWS_66_fibonacci {
    public static void main(String[] args) {
        int first=0;
        int secound=1;

        System.out.println(first+"\n"+secound);
        for(int i=3;i<=10;i++){
            int next=first+secound;
            first=secound;
            secound=next;
            System.out.println(next);
        }
    }
}
