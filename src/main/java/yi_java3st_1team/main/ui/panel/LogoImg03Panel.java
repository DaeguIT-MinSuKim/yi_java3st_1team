package yi_java3st_1team.main.ui.panel;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class LogoImg03Panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public LogoImg03Panel() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setPreferredSize(new Dimension(1134, 348));
		setLayout(null);
		
		JLabel lblImg1 = new JLabel("");
		lblImg1.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainLogo1.png"));
		lblImg1.setBounds(149, 37, 286, 169);
		add(lblImg1);
		
		JLabel lblImg2 = new JLabel("");
		lblImg2.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\cuLog.png"));
		lblImg2.setBounds(669, 37, 335, 298);
		add(lblImg2);
		
		JLabel lblImg3 = new JLabel("");
		lblImg3.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainLogo2.png"));
		lblImg3.setBounds(159, 216, 325, 119);
		add(lblImg3);
	}
}
