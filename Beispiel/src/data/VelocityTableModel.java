package data;

import bl.VelocityBL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class VelocityTableModel extends AbstractTableModel {

    private List<VelocityBL> liste = new ArrayList<>();
    public static final String[] colNames = {"Datum", "Uhrzeit", "Kennzeichen", "Gemessen", "Erlaubt", "Übertretung"};
    
    @Override
    public int getRowCount() {
        return liste.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }
    
    @Override
    public String getColumnName(int colIndex) {
        return colNames[colIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int colIndex) {
       VelocityBL v = liste.get(rowIndex);
        switch(colIndex){
            case 0: return v.getDatum();
            case 1: return v.getUhrzeit();
            case 2: return v.getKennzeichen();
            case 3: return v.getGemessen();
            case 4: return v.getErlaubt();
            case 5: return v.getUebertretung();
        }
        return "?";
    }
    
    public void add(VelocityBL v){
        liste.add(v);
    }
    
    public void remove(int i){
        liste.remove(i);
    }
    
}
