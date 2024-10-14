package CodeWithSuraj.CWS_InterviewQuestions;

class parent{
    String name="Suraj";
}

class child extends parent{
    String name="Santosh";
}

public class CWS_08_Parent_Child_both_Names {
    public static void main(String[] args) {
        parent p=new child();
        System.out.println(p.name); //print parent class value

        child c=new child();
        System.out.println(c.name); // print child class value
    }
}
