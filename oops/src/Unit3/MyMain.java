package Unit3;

import Unit2.Thread1;
import Unit2.Thread2;

public class MyMain {
    public static void main(String[] args) {
        Thread th1=new Thread1();
        Thread th2=new Thread2();
        System.out.println(th1.getPriority());
        th1.setPriority(10);
        th1.start();
        th2.start();
    }
}
