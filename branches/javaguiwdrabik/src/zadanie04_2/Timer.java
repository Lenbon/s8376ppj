package zadanie04_2;

public class Timer extends Thread {
    protected int counter;
    protected boolean running = true;

    public void stopTimer() {
        this.running = false;
    }

    public void run() {
        while (running && !Registry.passBroken) {
            try {
                counter++;
                System.out.println("Czas: " + (counter / 60) + ":"
                        + (counter % 60));
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
