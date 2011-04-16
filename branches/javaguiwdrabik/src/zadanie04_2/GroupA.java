package zadanie04_2;

public class GroupA extends Spy {
    public GroupA(Password password, String[] initials) {
        super(password, initials);
    }

    public void run() {
        String passCandidate;
        while (true) {
            for (int x = 0; x < initials.length; x++) {
                for (int y = 0; y < 1000000; y++) {
                    passCandidate = initials[x]
                            + (("" + (1000000 + y)).substring(1));

                    if (password.compare(passCandidate)) {
                        Registry.setPassBroken();
                        System.out.println("Hasło złamane: " + passCandidate);
                        return;
                    }
                }
            }
            System.out.println("Nie odnaleziono hasła");
            break;
        }
    }
}
