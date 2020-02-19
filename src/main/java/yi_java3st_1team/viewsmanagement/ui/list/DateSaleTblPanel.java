package yi_java3st_1team.viewsmanagement.ui.list;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTable;
import java.awt.GridLayout;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class DateSaleTblPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public DateSaleTblPanel() {

		initialize();
	}
	private void initialize() {
		setSize(new Dimension(1300, 620));
		setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		add(table, BorderLayout.NORTH);
	}

}
