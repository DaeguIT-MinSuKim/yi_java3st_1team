package yi_java3st_1team.main.ui.content;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class LoginBtn01 extends JPanel {

	/**
	 * Create the panel.
	 */
	public LoginBtn01() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaption);
		setPreferredSize(new Dimension(1134, 166));
		setLayout(new BorderLayout(10, 10));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainBtn1.png"));
		btnNewButton.setPreferredSize(new Dimension(240, 23));
		add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainBtn2.png"));
		add(btnNewButton_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setPreferredSize(new Dimension(645, 0));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(240, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\subMainImg1.png"));
		add(lblNewLabel, BorderLayout.EAST);
	}

}
