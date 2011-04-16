package zadanie04_2;

public class GroupB extends Spy {
    public GroupB(Password password, String[] initials) {
        super(password, initials);
    }

    public void run() {
        String passCandidate;
        while (true) {
            passCandidate = "";

            if (password.compare(passCandidate)) {
                Registry.setPassBroken();
                System.out.println("Hasło złamane: " + passCandidate);
                return;
            }

            System.out.println("Nie odnaleziono hasła");
            break;
        }
    }
}
