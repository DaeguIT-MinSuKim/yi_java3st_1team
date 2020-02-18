package yi_java3st_1team.viewsmanagement.ui.list;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class SWTotalTblPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public SWTotalTblPanel() {

		initialize();
	}
	private void initialize() {
		setSize(new Dimension(660, 650));
		setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		add(table, BorderLayout.NORTH);
	}

}
