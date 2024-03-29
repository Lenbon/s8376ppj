package zadanie07_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileManager {
    JFileChooser chooser;
    JPanel panel;
    JTextArea textArea;
    String name;
    File storage;

    public FileManager(JTextArea textArea) {

        this.textArea = textArea;

        chooser = new JFileChooser();
        chooser.addChoosableFileFilter(new FileNameExtensionFilter(
                "pliki tekstowe", "txt"));
        panel = new JPanel();
    }

    public String getName() {
        return storage.getName();
    }

    public void read() {

        int ret = chooser.showDialog(panel, "Otwórz plik");
        if (ret == JFileChooser.APPROVE_OPTION) {
            try {
                storage = chooser.getSelectedFile();
                
                BufferedReader br = new BufferedReader(new FileReader(chooser
                        .getSelectedFile()));
                String line;
                textArea.setText("");

                while ((line = br.readLine()) != null) {
                    textArea.append(line + "\n");
                }

                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void save() {

        if (storage == null) {
            this.saveAs();
            return;
        } else {
            _save(storage);
        }
    }

    public void saveAs() {

        int ret = chooser.showDialog(panel, "Zapisz jako");
        if (ret == JFileChooser.APPROVE_OPTION) {
            storage = chooser.getSelectedFile();
            _save(chooser.getSelectedFile());
        }
    }

    private void _save(File file) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(storage));
            bw.write(textArea.getText());
            bw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
