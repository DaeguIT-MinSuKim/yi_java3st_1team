package yi_java3st_1team.viewsmanagement.ui.graph;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTable;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class ClientGraphPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ClientGraphPanel() {

		initialize();
	}
	private void initialize() {
		setSize(new Dimension(670, 650));
		setLayout(new BorderLayout(0, 0));
	}

}
