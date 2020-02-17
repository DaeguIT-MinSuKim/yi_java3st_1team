package yi_java3st_1team.main.ui.content;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;

public class MainBtns01Panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainBtns01Panel() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaption);
		setPreferredSize(new Dimension(1134, 348));
		setLayout(new GridLayout(0, 1, 0, 10));
		
		JPanel pBtns01 = new JPanel();
		pBtns01.setBackground(SystemColor.inactiveCaption);
		add(pBtns01);
		pBtns01.setLayout(new BorderLayout(10, 0));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainBtn1.png"));
		btnNewButton.setPreferredSize(new Dimension(240, 23));
		pBtns01.add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainBtn2.png"));
		pBtns01.add(btnNewButton_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(240, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\subMainImg1.png"));
		lblNewLabel.setPreferredSize(new Dimension(640, 15));
		pBtns01.add(lblNewLabel, BorderLayout.EAST);
		
		JPanel pBtns02 = new JPanel();
		pBtns02.setBackground(SystemColor.inactiveCaption);
		add(pBtns02);
		pBtns02.setLayout(new BorderLayout(10, 10));
		
		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(new Color(240, 255, 255));
		label.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\subMainImg2.png"));
		label.setPreferredSize(new Dimension(640, 15));
		pBtns02.add(label, BorderLayout.WEST);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainBtn3.png"));
		pBtns02.add(button, BorderLayout.CENTER);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\mainBtn4.png"));
		button_1.setPreferredSize(new Dimension(240, 23));
		pBtns02.add(button_1, BorderLayout.EAST);
	}
}
