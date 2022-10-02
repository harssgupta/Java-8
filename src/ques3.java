public class ques3 {
    public static void main(String[] args) {
        Runnable newThread= ()->{
            Thread.currentThread().setName("My Thread");
            System.out.println(Thread.currentThread().getName());
        };
        Thread thread=new Thread(newThread);
        thread.start();
    }
}