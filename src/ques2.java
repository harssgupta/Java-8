interface MyInterface{
    void myMethod(int num1, int num2);
}
class MyClass{
    void addition(int num1,int num2){
        System.out.println("Sum of numbers is: "+(num1+num2));
    }
    void subtraction(int num1,int num2){
        System.out.println("Difference of numbers is: "+(num1-num2));
    }
    static void multiplication(int num1,int num2){
        System.out.println("Product of numbers is: "+(num1*num2));
    }
}
public class ques2 {
    public static void main(String[] args) {
        MyInterface myinterface= (num1, num2) -> {System.out.println(num1+" "+num2);
        };

        MyClass myClass= new MyClass();
        myinterface= myClass::addition;
        myinterface.myMethod(6,12);
        myinterface= myClass::subtraction;
        myinterface.myMethod(6,12);
        myinterface= MyClass::multiplication;
        myinterface.myMethod(6,12);
    }
}
