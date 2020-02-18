package yi_java3st_1team.viewsmanagement.ui.graph;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class EmployeeGraphPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public EmployeeGraphPanel() {

		initialize();
	}
	private void initialize() {
		setSize(new Dimension(670, 650));
		setLayout(new BorderLayout(0, 0));
	}

}
