package yi_java3st_1team.viewsmanagement.ui.chart;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class EmployeeChartPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public EmployeeChartPanel() {

		initialize();
	}
	private void initialize() {
		setSize(new Dimension(670, 650));
		setLayout(new BorderLayout(0, 0));
	}

}
