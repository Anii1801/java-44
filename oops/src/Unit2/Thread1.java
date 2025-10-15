package Unit2;

public class Thread1 extends Thread {
    public void run() {
        try {
            for(int i=1;i<11;i++) {
                System.out.println("Thread 1"+1);
                Thread.sleep(2000);
            }

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
