package br.ufjf.caed.exemplo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import org.dianaframework.view.BusinessObjectsCollection;
import org.dianaframework.view.CollectionModel;
import org.dianaframework.view.JTableColumnModel;

/**
 *
 * Abstract table model for br.ufjf.caed.exemplo.model.ColecaoNoticiasPublicadas objects;
 * Generated by Diana Framework. DO NOT EDIT!!!
 *
 */
public class ColecaoNoticiasPublicadasTableModel extends AbstractTableModel implements CollectionModel, JTableColumnModel {
    private List objects;
    private BusinessObjectsCollection boc;
    private br.ufjf.caed.exemplo.model.Noticia selectedObject;
    private int[] columnWidths;
    private String rowSelection;
    private JTable jtable;
    private int[] columnsOrder;
    private HashMap<String, String> parameters = new HashMap();

    public ColecaoNoticiasPublicadasTableModel() {
        // @todo 22012007: Alterar as ordens das colunas no table-model
        columnsOrder = new int[1];
columnsOrder[0] = 0;

    }

    public ColecaoNoticiasPublicadasTableModel(List objects) {
        this.objects = objects;
    }

    public void setSelectedItem(int item) {
    }

    public void setObjects(ArrayList val) {
        this.objects = val;
    }
    public String getColumnName(int col) {
        col = columnsOrder[col];
        switch (col) {
            case 0: return "Titulo";

            default: return "";
        }
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        br.ufjf.caed.exemplo.model.Noticia object = (br.ufjf.caed.exemplo.model.Noticia)objects.get(rowIndex);
        columnIndex = columnsOrder[columnIndex];
        if (object != null) {
            switch (columnIndex) {
            case 0: return object.getTitulo();

            }
        }
        return null;
    }

    public int getRowCount() {
        if (objects != null) {
            return this.objects.size();
        }
        return 0;
    }

    public int getColumnCount() {
        return 1;

    }
    public br.ufjf.caed.exemplo.model.Noticia getObjectAt(int row) {
        if (row >= 0) {
            return (br.ufjf.caed.exemplo.model.Noticia)this.objects.get(row);
        }
        return null;
    }

    public void setBusinessObjectsCollection(BusinessObjectsCollection boc) {
        this.boc = boc;
    }

    public List getObjects() {
        return objects;
    }

    public void reload() {
        boc.setParameters(parameters);
        objects = boc.collection();
        // @todo 23012007: Resolvido o problema com cache na sequencia Consulta > Exclusao > Consutla
        selectedObject = null;
        selectedObject = null;
        if (jtable != null) {
            jtable.clearSelection();
            jtable.updateUI();
        }
    }

    public void setObjectsCollection(List objects) {
        this.objects = objects;
        selectedObject = null;
        jtable.clearSelection();
        jtable.updateUI();
    }

    public String getSelectedValue() {
        return String.valueOf(selectedObject.getId());
    }
    public br.ufjf.caed.exemplo.model.Noticia getSelectedObject() {
        return selectedObject;
    }

    public void setSelectedObject(Object selectedObject) {
        this.selectedObject = (br.ufjf.caed.exemplo.model.Noticia)selectedObject;
    }

    public void addObject(Object obj) {
        // For work around the lazy object initialization on Hibernate
        ((br.ufjf.caed.exemplo.model.Noticia)obj).getTitulo();

        if (objects == null)
            objects = new ArrayList();
        objects.add(obj);
    }

    public void removeAll() {
        if (objects != null)
            objects.clear();
    }

    public Object removeObject(int index) {
        return objects.remove(index);
    }

    public Object removeObject(Object obj) {
        return objects.remove(obj);
    }

    public Object removeSelectedObject() {
        for (int inc = 0; inc < objects.size(); inc++) {
            if (objects.get(inc) == selectedObject) {
                return objects.remove(inc);
            }
        }
        return null;
    }

    public BusinessObjectsCollection getBoc() {
        return boc;
    }

    public void setBoc(BusinessObjectsCollection val) {
        this.boc = val;
    }

    public void setSelectedObject(br.ufjf.caed.exemplo.model.Noticia val) {
        this.selectedObject = val;
    }

    public void setColumnWidths(int[] widths) {
        columnWidths = widths;
    }

    public int[] getColumnWidths() {
        return columnWidths;
    }

    public void setRowSelection(String arg) {
        rowSelection = arg;
    }

    public String getRowSelection() {
        return rowSelection;
    }

    public void setUIReference(Object table) {
        jtable = (JTable)table;
    }

    public JTable getUIReference() {
        return jtable;
    }

    public List getSelectedObjects() {
        int[] rows = jtable.getSelectedRows();
        ArrayList objs = new ArrayList();
        if (objects.size() > 0) {
           for (int inc = 0; inc < rows.length; inc++) {
               objs.add(objects.get(rows[inc]));
           }
        }
        return objs;
    }

    public void setColumnsOrder(int[] columnsOrder) {
        this.columnsOrder = columnsOrder;
    }

    public void setParameters(HashMap<String, String> parameters) {
        this.parameters = parameters;
    }
    public HashMap<String, String> getParameters() {
        return parameters;
    }

    public void addParameter(String name, String value) {
        parameters.put(name, value);
    }

    public void sortByColumn(int column, boolean isAscent) {}

}
