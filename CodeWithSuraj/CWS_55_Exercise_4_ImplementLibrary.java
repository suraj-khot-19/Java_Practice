package CodeWithSuraj;
class Library{
    String[] lib;
    int NoOfBooks;
    public Library(){
        this.lib=new String[100];
        this.NoOfBooks=0;
    }
    public void addBooks(String newBook){
        this.lib[NoOfBooks]=newBook;
        NoOfBooks++;
        System.out.println("\""+newBook+"\" book is added");
    }
    public void issueBook(String wantBook){
        for (int i=0;i<lib.length;i++){
            if (wantBook.equals(lib[i])){
                System.out.println(wantBook+" is issued");
                lib[i]=null;        //how to change the array's nth element
                return;
        }
        }
        System.out.println("this is book is not exist");
    }
    public void returnBook(String returnBok){
        for (int i=0;i< lib.length;i++){
            if (lib[i]==null){
                lib[i]=returnBok;
                System.out.println(returnBok+" this book is returned to the library");
                return; //if we dont write return here then the returnBok is initialized to all the null places
            }
        }
    }
    public void showAvailableBooks(){
        System.out.println("\navailable books are:");
        for (String a:lib) {
            if(a==null)
                continue;   //if we use *break then it exit the loop from where it receives Null
            System.out.println("* "+a);
        }
    }
}
public class CWS_55_Exercise_4_ImplementLibrary {
    public static void main(String[] args) {
        Library li=new Library();
        li.addBooks("bhagavatgeeta");
        li.addBooks("ramayan");
        li.addBooks("mahabharat");
        li.addBooks("vishnu puran");
        li.addBooks("shiv puran");
        li.showAvailableBooks();
        li.issueBook("mahabharat");
        li.showAvailableBooks();
        li.returnBook("mahabharat");
        li.showAvailableBooks();
    }
}
