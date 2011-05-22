package zadanie04_2;

public class PassGen {
    public String generate(String[][] storage) {
        int randomIndex = (int) (storage.length * Math.random());
        return storage[randomIndex][0] + storage[randomIndex][1]
                + storage[randomIndex][2] + storage[randomIndex][3];
    }
}
