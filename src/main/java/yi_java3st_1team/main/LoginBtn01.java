package yi_java3st_1team.main;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

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
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setPreferredSize(new Dimension(240, 23));
		add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("New button");
		add(btnNewButton_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\subMainImg1.png"));
		add(lblNewLabel, BorderLayout.EAST);
	}

}
