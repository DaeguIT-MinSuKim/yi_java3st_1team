package yi_java3st_1team.clientmanagement.ui.list;

import java.awt.BorderLayout;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

@SuppressWarnings("serial")
public abstract class AbstractTblPanel<T> extends JPanel {
	protected JTable table;
	private JScrollPane scrollPane;
	protected List<T> list;
	protected NotEditableModel model;
	protected CheckTableModel model2;

	public AbstractTblPanel() {

		initialize();
	}

	private void initialize() {
		setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		scrollPane.setViewportView(table);
	}

	public void setPopupMenu(JPopupMenu popupMenu) {
		scrollPane.setComponentPopupMenu(popupMenu);
		table.setComponentPopupMenu(popupMenu);
	}

	public void loadDate(List<T> items) {
		list = items;
		model = new NotEditableModel(getRows(items), getColNames());
		table.setModel(model);

		setTblWidthAlign();

		RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
		table.setRowSorter(sorter);
	}
	
	public void loadDateCheck(List<T> items) {
		list = items;
		model2 = new CheckTableModel(getRows(items), getColNames());
		table.setModel(model2);

		setTblWidthAlign();

		RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model2);
		table.setRowSorter(sorter);
	}

	protected abstract void setTblWidthAlign();

	protected abstract Object[] getColNames();

	private Object[][] getRows(List<T> items) {
		Object[][] rows = new Object[items.size()][];
		for (int i = 0; i < rows.length; i++) {
			rows[i] = toArray(items.get(i));
		}
		return rows;
	}

	protected abstract Object[] toArray(T item);

	protected void tableCellAlign(int align, int... idx) {
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align);

		TableColumnModel cModel = table.getColumnModel();
		for (int i = 0; i < idx.length; i++) {
			cModel.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}

	protected void tableSetWidth(int... width) {
		TableColumnModel cModel = table.getColumnModel();
		for (int i = 0; i < width.length; i++) {
			cModel.getColumn(i).setPreferredWidth(width[i]);	
		}
	}

	public void removeRow() {
		int selectedIdx = getSelectedRowIdx();
		model.removeRow(selectedIdx);
	}

	public abstract void updateRow(T item, int updateIdx);

	public void addItem(T item) {
		model.addRow(toArray(item));
	}

	public int getSelectedRowIdx() {
		int selectedIdx = table.getSelectedRow();
		if (selectedIdx == -1) {
			JOptionPane.showMessageDialog(null, "수정/삭제할 사항을 선택하세요.");
			throw new RuntimeException();
		}
		return selectedIdx;
	}

	public T getSelectedItem() {
		int selectedIdx = getSelectedRowIdx();
		return list.get(selectedIdx);
	}

	// 수정금지하기위한 모델 선언
	protected class NotEditableModel extends DefaultTableModel {

		public NotEditableModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
	}
	
	protected class CheckTableModel extends DefaultTableModel {

		public CheckTableModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);
		}

		@Override
		public Class<?> getColumnClass(int columnIndex) {
			Class clazz = String.class;
			switch (columnIndex) {
			case 0:
				clazz = Integer.class;
				break;
			case 6:
				clazz = Boolean.class;
				break;
			}
			return clazz;
		}
		
		@Override
		public boolean isCellEditable(int row, int column) {
			return column == 6;
		}

		@Override
		public void setValueAt(Object aValue, int row, int column) {
			if (aValue instanceof Boolean && column == 6) {
				Vector rowData = (Vector) getDataVector().get(row);
				rowData.set(6, (boolean) aValue);
				fireTableCellUpdated(row, column);
			}
		}
	}

	public void clearSelection() {
		table.clearSelection();
	}
}
