package yi_java3st_1team.clientmanagement.ui.content;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class CMMainMenu extends JPanel {
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;

	public CMMainMenu() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setBounds(new Rectangle(0, 0, 210, 700));
		setLayout(null);
		
		lblNewLabel = new JLabel("M E N U");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(30, 40, 150, 40);
		add(lblNewLabel);
		
		btnNewButton = new JButton("");
		btnNewButton.setFocusable(false);
		btnNewButton.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\menu1.png"));
		btnNewButton.setBounds(40, 90, 130, 100);
		add(btnNewButton);
		
		button = new JButton("");
		button.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\menu2.png"));
		button.setFocusable(false);
		button.setBackground(SystemColor.inactiveCaptionBorder);
		button.setBounds(40, 240, 130, 100);
		add(button);
		
		button_1 = new JButton("");
		button_1.setFocusable(false);
		button_1.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\menu3.png"));
		button_1.setBackground(SystemColor.inactiveCaptionBorder);
		button_1.setBounds(40, 390, 130, 100);
		add(button_1);
		
		button_2 = new JButton("");
		button_2.setFocusable(false);
		button_2.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\menu4.png"));
		button_2.setBackground(SystemColor.inactiveCaptionBorder);
		button_2.setBounds(40, 530, 130, 100);
		add(button_2);
		
		lblNewLabel_1 = new JLabel("거래처 관리");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(55, 200, 100, 20);
		add(lblNewLabel_1);
		
		label = new JLabel("제품 관리");
		label.setFont(new Font("굴림", Font.BOLD, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(55, 350, 100, 20);
		add(label);
		
		label_1 = new JLabel("주문 관리");
		label_1.setFont(new Font("굴림", Font.BOLD, 16));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(55, 500, 100, 20);
		add(label_1);
		
		label_2 = new JLabel("현황조회/보고");
		label_2.setFont(new Font("굴림", Font.BOLD, 16));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(40, 640, 130, 20);
		add(label_2);
	}
}
