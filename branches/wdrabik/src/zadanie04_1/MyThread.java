package zadanie04_1;

public class MyThread extends Thread {
    protected boolean stopThisMadness = false;
    protected Integer x = 0;
    protected boolean ready = false;

    public void setReady(boolean status) {
        ready = status;
    }
    public void stopThis() {
        stopThisMadness = true;
    }

    public void run() {
        while (true) {
            try {
                while (!ready) {
                    wait();
                }
                synchronized (x) {
                    System.out.println("echo " + (++x));
                }
                sleep(500);

                if (stopThisMadness) {
                    return;
                }
            } catch (InterruptedException e) {
            }
        }

    }
}
