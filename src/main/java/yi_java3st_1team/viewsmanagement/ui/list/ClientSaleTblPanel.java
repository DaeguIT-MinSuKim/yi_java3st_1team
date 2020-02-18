package yi_java3st_1team.viewsmanagement.ui.list;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class ClientSaleTblPanel extends JPanel {
	private JTable table;

	public ClientSaleTblPanel() {

		initialize();
	}
	private void initialize() {
		setSize(new Dimension(1300, 655));
		setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		add(table, BorderLayout.NORTH);
	}

}
