package zadanie04_1;

public class MyRunnable implements Runnable {
    public void run() {
        try {
            int x = 0;
            while (true) {
                System.out.println(++x);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            return;
        }
    }
}
