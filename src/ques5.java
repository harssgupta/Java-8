interface myInterface1{
    default void display(){
        System.out.println("This is My Interface1");
    }
}
interface myInterface2{
    default void display(){
        System.out.println("This is My Interface2");
    }
}
interface myInterface3 extends myInterface1, myInterface2{
    default void display(){
        myInterface1.super.display();
        myInterface2.super.display();
        System.out.println("This is My Interface3");
    }
}

public class ques5 implements myInterface3{
    public void display(){
        myInterface3.super.display();
        System.out.println("Default Method Display in Class");
    }
    public static void main(String[] args) {
        ques5 ques5= new ques5();
        ques5.display();
    }
}
