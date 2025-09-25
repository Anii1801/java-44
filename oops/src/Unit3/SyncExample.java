package Unit3;

import org.w3c.dom.css.Counter;

public class SyncExample {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1=new Thread(()->{
            for (int i = 0; i <= 100; i++)
                counter.increment();
        });
        Thread t2=new Thread(()->{
            for(int i = 0; i <= 100; i++)
                counter.increment();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Count: "+counter.getCount());
        }

    }