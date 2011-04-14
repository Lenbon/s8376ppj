package zadanie04_1;

public class MyThread extends Thread {
    protected boolean stopThisMadness = false;

    public void stopThis() {
        stopThisMadness = true;
    }

    public void run() {
        try {
            int x = 0;
            while (true) {
                System.out.println("echo " + (++x));
                sleep(500);
                if (stopThisMadness) {
                    return;
                }
            }
        } catch (InterruptedException e) {
            return;
        }
    }
}
