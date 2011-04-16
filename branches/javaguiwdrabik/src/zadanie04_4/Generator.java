package zadanie04_4;

public class Generator {
    public void run() {
        int x = 0;
        while (true) {
            x++;
            System.out.println(x);

            if (x > 150000) {
                return;
            }
        }
    }
}
