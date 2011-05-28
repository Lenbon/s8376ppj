package zadanie04_2;

import javax.swing.JOptionPane;

public class GroupB extends Spy {
    public GroupB(Password password, String[] initials) {
        super(password, initials);
    }

    public void run() {
        String passCandidate, input;
        
        String message = "Nasze propozycje haseł";
        
        while (password.isPassUnknown()) {
            passCandidate = "";
            input = JOptionPane.showInputDialog(message);
            
            if (input == null) {
                return;
            } else if (password.compare(input)) {
                password.setPassBroken();
                System.out.println("Hasło złamane: " + passCandidate);
                return;
            } else {
                System.out.println("nie udało się");
            }
        }
    }
}
