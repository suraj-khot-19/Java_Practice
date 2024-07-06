package CodeWithSuraj;
class Animal{
    public Animal(){
        System.out.println("Animal sounds be Any");
    }
}
class Dog extends Animal{
    public Dog() {
        System.out.println("dog sound bark");
    }
}
class Cat extends Dog{
    public Cat() {
        System.out.println("cat sound meow");
    }
}
public class CWS_51_Inheritance {
    public static void main(String[] args) {
        // Animal obj1 = new Animal();   if we create animal obj then just we can access animal class properties
       //Dog obj2 = new Dog(); //we can access both animal nd dog class properties
        Cat obj3=new Cat(); //we can access cat nd animal class nd dog classes
    }
}
