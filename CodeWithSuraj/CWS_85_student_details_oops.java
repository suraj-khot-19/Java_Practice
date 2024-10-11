/*
Create a class Student with fields name, rollNo, and marks. Write a method to display the student details.
 */
package CodeWithSuraj;

class students{
    String name;
    int rollNo;
    int marks;

    public students(String name,int rollNo,int marks){
        this.marks=marks;
        this.name=name;
        this.rollNo=rollNo;
    }

    void details(){
        System.out.println("Name:"+name);
        System.out.println("Roll no:"+rollNo);
        System.out.println("Marks:"+marks);
    }
}
public class CWS_85_student_details_oops {
    public static void main(String[] args) {
        students obj=new students("suraj",20,82);
        obj.details();
    }
}
