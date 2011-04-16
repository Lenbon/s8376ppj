package zadanie04_1;

public class MyThread extends Thread {
    protected boolean stopThisMadness = false;
    protected Integer x = 0;
    protected boolean sleep = false;

    public void getSleep() {
        sleep = true;
    }

    public void stopThis() {
        stopThisMadness = true;
    }

    public void run() {
        while (true) {
            if (stopThisMadness) {
                return;
            }
            try {
                synchronized (this) {
                    while (sleep) {
                        wait();
                    }
                }

                synchronized (x) {
                    System.out.println("echo " + (++x));
                }
                sleep(500);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    public void wakeUp() {
        sleep = false;
        synchronized (this) {
            notify();
        }
    }
}
