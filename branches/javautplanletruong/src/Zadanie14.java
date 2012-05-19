import zadanie14.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.TreeSet;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * Zadanie 14
 *
 * Napisać program ilustrujący internacjonalizację prostego edytora tekstowego
 * przy użyciu dodatkowych zasobów (ang. resource bundle). Program powinien być
 * przygotowany na działanie w różnych środowiskach językowych (np. polskim
 * i angielskim). Edytor powinien posiadać obszar edycji oraz menu rozwijalne
 * działające zgodnie z opisem poniżej.
 *
 * Opis menu rozwijalnego (tu, w wersji angielskiej):
 *
 * File
 *  Exit
 * Edit
 *  Background - możliwe jest wybranie koloru tła
 *      Red
 *      Green
 *      Blue
 *  Foreground - możliwe jest wybranie koloru czcionki
 *      Red
 *      Green
 *      Blue
 *
 * Użytkownik podaje lokalizację (polską lub angielską) z linii wywołania.
 *
 * @version     $Id$
 */
public class Zadanie14 extends JFrame
{
    ResourceBundle msgs;
    boolean isChange = false;
    JTextArea textArea;
    String titlePrefix, titleSufix, titleSufixDefault;
    FileManager fileManager;
    Hashtable<String, Color> colors;
    HashMap<Integer, String> fonts;
    {

    }

    Zadanie14(String lang)
    {
System.out.println(lang);


        msgs = ResourceBundle.getBundle("files/dictionary/EditorMessages", new Locale(lang));

        titlePrefix = msgs.getString("title_prefix");
        titleSufixDefault = msgs.getString("title_sufix_default");

        initLists();
        initElements();
        initUI();
    }

    protected void initLists()
    {
        colors = new Hashtable<String, Color>();

        colors.put(msgs.getString("blue"), Color.BLUE);
        colors.put(msgs.getString("yellow"), Color.YELLOW);
        colors.put(msgs.getString("orange"), Color.ORANGE);
        colors.put(msgs.getString("red"), Color.RED);
        colors.put(msgs.getString("white"), Color.WHITE);
        colors.put(msgs.getString("black"), Color.BLACK);
        colors.put(msgs.getString("green"), Color.GREEN);

        fonts = new HashMap<Integer, String>();

        fonts.put(8, "8 " + msgs.getString("pts"));
        fonts.put(10, "10 " + msgs.getString("pts"));
        fonts.put(12, "12 " + msgs.getString("pts"));
        fonts.put(14, "14 " + msgs.getString("pts"));
        fonts.put(16, "16 " + msgs.getString("pts"));
        fonts.put(18, "18 " + msgs.getString("pts"));
        fonts.put(20, "20 " + msgs.getString("pts"));
        fonts.put(22, "22 " + msgs.getString("pts"));
        fonts.put(24, "24 " + msgs.getString("pts"));
    }

    protected void initElements()
    {
        // components
        textArea = new JTextArea();
        textArea.getDocument().addDocumentListener(new DocumentListener()
        {
            @Override
            public void changedUpdate(DocumentEvent e)
            {
            }

            @Override
            public void insertUpdate(DocumentEvent e)
            {
                isChange = true;
            }

            @Override
            public void removeUpdate(DocumentEvent e)
            {
            }
        });
        add(new JScrollPane(textArea));

        fileManager = new FileManager(textArea, msgs);

        // menu: file
        JMenu file = new JMenu(msgs.getString("file"));

        JMenuItem fileOpen = new JMenuItem(

        msgs.getString("open"));
        fileOpen.setToolTipText(msgs.getString("open_file"));
        fileOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,
                ActionEvent.CTRL_MASK));
        fileOpen.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                fileManager.read();
                setTitleText(fileManager.getName());
            }
        });

        JMenuItem fileSave = new JMenuItem(msgs.getString("save"));
        fileSave.setToolTipText(msgs.getString("save_to_file"));
        fileSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
                ActionEvent.CTRL_MASK));
        fileSave.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                fileManager.save();
            }
        });

        JMenuItem fileSaveas = new JMenuItem(msgs.getString("save_as"));
        fileSaveas.setToolTipText(msgs.getString("save_as_new_file"));
        fileSaveas.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,
                ActionEvent.CTRL_MASK));
        fileSaveas.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                fileManager.saveAs();
                setTitleText(fileManager.getName());
            }
        });

        JMenuItem fileExit = new JMenuItem(msgs.getString("exit"));
        fileExit.setToolTipText(msgs.getString("close_editor"));
        fileExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,
                ActionEvent.CTRL_MASK));
        fileExit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (isChange == false)
                    System.exit(0);

                int choice = JOptionPane.showConfirmDialog(null,
                        msgs.getString("close_editor_query"),
                        msgs.getString("exit_from_application"), 2);
                if (choice == JOptionPane.OK_OPTION) {
                    System.exit(0);
                } else {
                    return;
                }
            }
        });

        file.add(fileOpen);
        file.add(fileSave);
        file.add(fileSaveas);
        file.addSeparator();
        file.add(fileExit);

        // menu: edit
        JMenu edit = new JMenu(msgs.getString("edit"));
        JMenu editAddresses = new JMenu(msgs.getString("addresses"));

        JMenuItem editAddressesWork = new JMenuItem(msgs.getString("work"));
        editAddressesWork.setToolTipText(msgs.getString("insert_work_address"));
        editAddressesWork.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,
                ActionEvent.CTRL_MASK + ActionEvent.SHIFT_MASK));
        editAddressesWork.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textArea.insert("Warszawa, Domaniewska 39",
                        textArea.getCaretPosition());
            }
        });

        JMenuItem editAddressesHome = new JMenuItem(msgs.getString("home"));
        editAddressesHome.setToolTipText(msgs.getString("insert_home_address"));
        editAddressesHome.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
                ActionEvent.CTRL_MASK + ActionEvent.SHIFT_MASK));
        editAddressesHome.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textArea.insert("Konstancin, Kwiatowa 15",
                        textArea.getCaretPosition());
            }
        });

        JMenuItem editAddressesSchool = new JMenuItem(msgs.getString("school"));
        editAddressesSchool.setToolTipText(msgs
                .getString("insert_school_address"));
        editAddressesSchool.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_D, ActionEvent.CTRL_MASK + ActionEvent.SHIFT_MASK));
        editAddressesSchool.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textArea.insert("Warszawa, Koszykowa 86",
                        textArea.getCaretPosition());
            }
        });

        editAddresses.add(editAddressesWork);
        editAddresses.add(editAddressesHome);
        editAddresses.add(editAddressesSchool);
        edit.add(editAddresses);

        // menu: options
        JMenu options = new JMenu(msgs.getString("options"));
        JMenuItem menuItem;

        JMenu optionsForeground = new JMenu(msgs.getString("foreground"));
        ListenerForeground listenerForeground = new ListenerForeground(textArea);
        for (String key : colors.keySet()) {
            menuItem = new JMenuItem(key, new MyIcon(colors.get(key)));
            menuItem.addActionListener(listenerForeground);
            optionsForeground.add(menuItem);
        }

        JMenu optionsBackground = new JMenu(msgs.getString("background"));
        ListenerBackground listenerBackground = new ListenerBackground(textArea);
        for (String key : colors.keySet()) {
            menuItem = new JMenuItem(key, new MyIcon(colors.get(key)));
            menuItem.addActionListener(listenerBackground);
            optionsBackground.add(menuItem);
        }

        JMenu optionsFontsize = new JMenu(msgs.getString("font_size"));
        TreeSet<Integer> sortedSet = new TreeSet<Integer>(
                new ArrayList<Integer>(fonts.keySet()));
        for (Object key : sortedSet.toArray()) {
            menuItem = new JMenuItem(fonts.get(key));
            menuItem.addActionListener(new ListenerFontSize(textArea,
                    (Integer) key));
            optionsFontsize.add(menuItem);
        }

        options.add(optionsForeground);
        options.add(optionsBackground);
        options.add(optionsFontsize);

        JMenuBar menu = new JMenuBar();
        menu.add(file);
        menu.add(edit);
        menu.add(options);

        setJMenuBar(menu);
    }

    protected void initUI()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(300, 300));
        setLocationRelativeTo(null);
        setTitle(titlePrefix + titleSufixDefault);

        setVisible(true);
    }

    protected void setTitleText(String sufix)
    {
        titleSufix = sufix;
        setTitle(titlePrefix + titleSufix);
    }

    public static void main(String[] args)
    {
        String tmpLang;
        try {
            tmpLang = args[0];
        } catch (Exception e) {
            tmpLang = "pl";
        }

        final String lang = tmpLang;

        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Zadanie14(lang);
            }
        });
    }
}
