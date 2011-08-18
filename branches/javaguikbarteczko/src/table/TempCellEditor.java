package table;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class TempCellEditor extends DefaultCellEditor {

    JPanel p = new JPanel(new BorderLayout());
    JSlider slider;
    int slVal; // wartość na suwaku

    TempCellEditor(int mies) { // argument: numer miesiąca

        // trzeba wybrać jeden z trzech konstruktorów nadklasy!
        // DefaultCellEditor z JCheckBox otwiera edycję po jednym kliknięciu

        super(new JCheckBox());

        slider = new JSlider(JSlider.HORIZONTAL,
                KalTableModel.minTemp[mies - 1],
                KalTableModel.maxTemp[mies - 1],
                KalTableModel.minTemp[mies - 1]);

        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Obsługa zmian położenia suwaka

        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                if (!slider.getValueIsAdjusting()) { // gdy przesuwanie zakończone
                    slVal = slider.getValue(); // pobranie wartości
                    fireEditingStopped(); // koniec edycji
                }
            }
        });
        p.add(slider);
    }

    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {

        if (isSelected) { // kolory
            p.setForeground(table.getSelectionForeground());
            slider.setForeground(table.getSelectionForeground());
            p.setBackground(table.getSelectionBackground());
            slider.setBackground(table.getSelectionBackground());
        } else {
            slider.setForeground(Color.black);
            slider.setBackground(table.getBackground());
            p.setBackground(table.getBackground());
        }

        slVal = ((Integer) value).intValue(); // ustawienie wartości na suwaku
        slider.setValue(slVal);
        return p;
    }

    public Object getCellEditorValue() {
        return new Integer(slVal); // zwracamy aktualną wartość suwaka
    }

    protected void fireEditingStopped() {
        super.fireEditingStopped(); // wywołanie metody z nadklasy
    }
}
