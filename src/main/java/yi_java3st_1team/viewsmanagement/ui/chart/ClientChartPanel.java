package yi_java3st_1team.viewsmanagement.ui.chart;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTable;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class ClientChartPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ClientChartPanel() {

		initialize();
	}
	private void initialize() {
		setSize(new Dimension(670, 650));
		setLayout(new BorderLayout(0, 0));
	}

}
