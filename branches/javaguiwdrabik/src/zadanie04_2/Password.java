package zadanie04_2;

public class Password {
    protected String password;

    public boolean compare(String password) {
        return this.password.equals(password) ? true : false;
    }

    public void generate(String[][] storage) {
        int randomIndex = (int) (storage.length * Math.random());
        password = storage[randomIndex][0] + storage[randomIndex][1]
                + storage[randomIndex][2] + storage[randomIndex][3];
    }

    public String getPassword() {
        return password;
    }
}
