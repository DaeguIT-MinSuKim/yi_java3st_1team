package yi_java3st_1team.main.ui.panel;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

public class LogoImg01Panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public LogoImg01Panel() {

		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(350, 250));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setOpaque(true);
		lblLogo.setBackground(Color.WHITE);
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\teamLog.png"));
		add(lblLogo, BorderLayout.CENTER);
	}

}
