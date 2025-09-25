package Unit3;

public class MyMain {
    public static void main(String[] args) {
        Thread th1=new Thread1();
        Thread th2=new Thread2();
        th1.start();
        th2.start();
    }
}
