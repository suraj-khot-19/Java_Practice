package CodeWithSuraj;

public class CWS_34_ForEachLoopArray {
    public static void main(String[] args) {
        String[] name={"Suraj","Ram","Laxaman","hanuman"};
        for (String element:name)
        {
            System.out.println(element);
        }

        char[] charr=new char[5];
        charr= new char[]{'a', 'b', 'c', 'd', 'f'};
        for (char element:charr)
        {
            System.out.println(element);
        }
    }
}
