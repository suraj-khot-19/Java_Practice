//Implement method overloading for a Calculator class (add, subtract, multiply).
package CodeWithSuraj;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }


    int add(int a, int b, int c) {
        return a + b + c;
    }

    int sub(int a,int b){
        return a-b;
    }

    int sub(int a,int b,int c){
        return a-b-c;
    }
}

public class CWS_86_Method_overloading_calculator {
    public static void main(String[] args) {
            Calculator calculator=new Calculator();

            System.out.println(calculator.add(1,2));
            System.out.println(calculator.add(10,2,89));

            System.out.println(calculator.sub(4,3,5));
            System.out.println(calculator.sub(3,-9));

    }
}
