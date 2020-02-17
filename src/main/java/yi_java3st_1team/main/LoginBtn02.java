package yi_java3st_1team.main;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class LoginBtn02 extends JPanel {

	/**
	 * Create the panel.
	 */
	public LoginBtn02() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaption);
		setPreferredSize(new Dimension(1134, 166));
		setLayout(new BorderLayout(10, 10));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(240, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\subMainImg2.png"));
		lblNewLabel.setPreferredSize(new Dimension(640, 15));
		add(lblNewLabel, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainBtn3.png"));
		add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainBtn4.png"));
		btnNewButton_1.setPreferredSize(new Dimension(240, 23));
		add(btnNewButton_1, BorderLayout.EAST);
	}

}
