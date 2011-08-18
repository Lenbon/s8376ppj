package table;

import java.util.List;

import javax.swing.Icon;

public class CarTabModel extends RowListModel<Car> {
    public CarTabModel(List<Car> elist, String[] cols) {
        super(elist, cols);
    }

    @Override
    public Object getValueAt(int r, int c) {
        Car o = getRow(r);
        switch (c) {
        case 0:
            return o.getMake();
        case 1:
            return o.getModel();
        case 2:
            return o.getYear();
        case 3:
            return o.getPrice();
        case 4:
            return o.getIcon();
        default:
            return null;
        }
    }

    @Override
    public void setValueAt(Object val, int r, int c) {
        Car car = getRow(r);
        switch (c) {
        case 0:
            car.setMake((String) val);
            break;
        case 1:
            car.setModel((String) val);
            break;
        case 2:
            car.setYear((Integer) val);
            break;
        case 3:
            car.setPrice((Integer) val);
            break;
        case 4:
            car.setIcon((Icon) val);
            break;
        default:
            break;
        }
        this.fireTableCellUpdated(r, c);
    }
}
