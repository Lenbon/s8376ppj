import zadanie07_3.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 * Zadanie 3 (max 12 punktów)
 * 
 * Stworzyć prosty edytor tekstu z opcjami umieszczonymi w menu rozwijalnym
 * File
 *  Open - otwiera plik wybrany w dialogu wynoru plików i wczytuje plik do edytora
 *  Save - zapisuje zawartość edytora do bieżącego pliku (jeśli nie ma pliku, to dialog)
 *  Save As... zapisuje zawartość do pliku wybranego z dialogu
 *  Exit   - zamknięcie okna i zakończenie działania aplikacji
 * 
 * Edit
 *  Adresy
 *      Dom      - dopisuje do edytora adres domowy
 *      Szkoła    - dopisuje do edytora adres szkoły
 *      Firma     - dopisuje do edutora adres służbowy
 *      
 * Options
 *  Foreground     - zmienia kolor pisma na wybraną opcję
 *      kolor1
 *      ...
 *      kolorN
 *  Background    - zmienia kolor tła na wybraną opcję
 *      kolor1
 *      ...
 *      kolorN
 *  Font size          - zmienia rozmiar pisma na wybraną opcję
 *      8
 *      10
 *      ...
 *      24
 *      
 * Zapewnić:
 * mnemoniki i akceleratory dla opcji Open, Save, Save As..., Exit, Dom, Szkoła, Firma
 * pokazywanie kolorów w opcjach wyboru koloru (tła i pierwszego planu) w postaci kolorowych kółek
 * pokazywanie nazwy edytowanego pliku an pasku tytułu (jeślie nie ma pliku - "bez tytułu") 
 * 
 * Uwagi:
 * łatwe umieszczenie kolorów = własna klasa implementująca Icon
 * należy napisać kilka metod uniwersalnych (np. tworzące opcje menu z zadanymi charakterystykami), w przeciwnym razie kod będzie duży i słabo czytelny
 *  
 * @author s8376
 * @version $Id$
 */
public class Zadanie07_3 extends JFrame implements ActionListener {
    JMenuItem menuFileOpen, menuFileSave, menuFileSaveAs, menuFileExit;
    JMenuItem menuEditAddressWork, menuEditAddressShool, menuEditAddressHome;
    JTextArea textArea;
    Hashtable<String, Color> colors;
    {
        colors = new Hashtable<String, Color>();

        colors.put("Blue", Color.BLUE);
        colors.put("Yellow", Color.YELLOW);
        colors.put("Orange", Color.ORANGE);
        colors.put("Red", Color.RED);
        colors.put("White", Color.WHITE);
        colors.put("Black", Color.BLACK);
        colors.put("Green", Color.GREEN);
    }

    Zadanie07_3() {
        super("Word processor - bez tytułu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300));
        //        setResizable(false);
        setLocation(100, 100);

        Container container = getContentPane();
        container.setBackground(Color.RED);
        container.setLayout(null);

        // listeners
        //        ActionListener listenerDefault = new ListenerDefault(this);

        // menubar
        JMenuBar menu = new JMenuBar();
        setJMenuBar(menu);

        // menubar - file
        JMenu menuFile = new JMenu("File");

        menuFileOpen = new JMenuItem("Open");
        menuFile.add(menuFileOpen);
        menuFileSave = new JMenuItem("Save");
        menuFile.add(menuFileSave);
        menuFileSaveAs = new JMenuItem("Save as");
        menuFile.add(menuFileSaveAs);
        //        menuFile.add(new JMenuItem("Open", 1)); // separator // FIXME
        menuFile.addSeparator();
        menuFileExit = new JMenuItem("Exit");
        menuFileExit.addActionListener(this);
        menuFile.add(menuFileExit);

        menu.add(menuFile);

        // menubar - edit
        JMenu menuEdit = new JMenu("Edit");
        JMenu menuEditAddress = new JMenu("Adres");

        menuEditAddressWork = new JMenuItem("Praca");
        menuEditAddressWork.addActionListener(this);
        menuEditAddress.add(menuEditAddressWork);

        menuEditAddressShool = new JMenuItem("Szkoła");
        menuEditAddressShool.addActionListener(this);
        menuEditAddress.add(menuEditAddressShool);

        menuEditAddressHome = new JMenuItem("Dom");
        menuEditAddressHome.addActionListener(this);
        menuEditAddress.add(menuEditAddressHome);

        menuEdit.add(menuEditAddress);
        menu.add(menuEdit);

        // menubar - options
        JMenu menuOptions = new JMenu("Options");

        JMenu menuOptionsForeground = new JMenu("Foreground");
        // getColorItems
        JMenuItem menuItem;
        
        ListenerForeground listenerForeground = new ListenerForeground(textArea);
        for(String key : colors.keySet()) {
            menuItem = new JMenuItem(key, new MyIcon(colors.get(key)));
            menuItem.addActionListener(listenerForeground);
            menuOptionsForeground.add(menuItem);
        }
        menuOptions.add(menuOptionsForeground);
        
        JMenu menuOptionsBackground = new JMenu("Background");
        ListenerBackground listenerBackground = new ListenerBackground(textArea);
        for(String key : colors.keySet()) {
            menuItem = new JMenuItem(key, new MyIcon(colors.get(key)));
            menuItem.addActionListener(listenerBackground);
            menuOptionsBackground.add(menuItem);
        }
        menuOptions.add(menuOptionsBackground);

        JMenu menuOptionsFont = new JMenu("Font size");
        // getFontItems
        menuOptions.add(menuOptionsFont);

        menu.add(menuOptions);

        container.add(menu);

        // textarea
        textArea = new JTextArea();
        textArea.setBounds(10, 30, 300, 200);
        textArea.setToolTipText("Word processor");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        container.add(textArea);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // file menu
        if (e.getSource() == menuFileExit) {
            int wybor = JOptionPane.showConfirmDialog(null, "Zakończyć pracę?",
                    "Wyjście z programu", 2);
            if (wybor == JOptionPane.OK_OPTION) {
                System.exit(0);
            } else {
                return;
            }
        }

        if (e.getSource() == menuEditAddressWork) {
            textArea.insert("Warszawa, Domaniewska 39", textArea
                    .getCaretPosition());
        }
        if (e.getSource() == menuEditAddressShool) {
            textArea.insert("Warszawa, Koszykowa 86", textArea
                    .getCaretPosition());
        }
        if (e.getSource() == menuEditAddressHome) {
            textArea.insert("Konstancin, Kwiatowa 15", textArea
                    .getCaretPosition());
        }

//        if (e.getSource() == testColotOption) {
//            //            textArea.setBackground(Color.RED);
//            textArea.setForeground(Color.RED);
//
//        }
        //        Font font = new Font("Serif", Font.ITALIC, 20);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Zadanie07_3();
            }
        });
    }
}
