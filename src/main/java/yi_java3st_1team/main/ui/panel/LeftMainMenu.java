package yi_java3st_1team.main.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class LeftMainMenu extends JPanel{
	private JLabel lblMenu;
	public JButton btnCM;
	public JButton btnPM;
	public JButton btnOM;
	public JButton btnViews;
	private JLabel lblCM;
	private JLabel lblPM;
	private JLabel lblOM;
	private JLabel lblViews;
	private JLabel lblWhite;

	public LeftMainMenu() {

		initialize();
	}

	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setBounds(new Rectangle(0, 0, 210, 700));
		setLayout(null);

		lblMenu = new JLabel("M E N U");
		lblMenu.setForeground(Color.BLACK);
		lblMenu.setFont(new Font("Arial", Font.BOLD, 33));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(30, 40, 150, 40);
		add(lblMenu);

		btnCM = new JButton("");
		btnCM.setFocusable(false);
		btnCM.setBackground(SystemColor.inactiveCaptionBorder);
		btnCM.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\leftMainMenu\\menu1.png"));
		btnCM.setBounds(40, 90, 130, 100);
		add(btnCM);

		btnPM = new JButton("");
		btnPM.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\leftMainMenu\\menu2.png"));
		btnPM.setFocusable(false);
		btnPM.setBackground(SystemColor.inactiveCaptionBorder);
		btnPM.setBounds(40, 240, 130, 100);
		add(btnPM);

		btnOM = new JButton("");
		btnOM.setFocusable(false);
		btnOM.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\leftMainMenu\\menu3.png"));
		btnOM.setBackground(SystemColor.inactiveCaptionBorder);
		btnOM.setBounds(40, 390, 130, 100);
		add(btnOM);

		btnViews = new JButton("");
		btnViews.setFocusable(false);
		btnViews.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\leftMainMenu\\menu4.png"));
		btnViews.setBackground(SystemColor.inactiveCaptionBorder);
		btnViews.setBounds(40, 530, 130, 100);
		add(btnViews);

		lblCM = new JLabel("거래처 관리");
		lblCM.setForeground(Color.BLACK);
		lblCM.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		lblCM.setHorizontalAlignment(SwingConstants.CENTER);
		lblCM.setBounds(55, 200, 100, 20);
		add(lblCM);

		lblPM = new JLabel("제품 관리");
		lblPM.setForeground(Color.BLACK);
		lblPM.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		lblPM.setHorizontalAlignment(SwingConstants.CENTER);
		lblPM.setBounds(55, 350, 100, 20);
		add(lblPM);

		lblOM = new JLabel("주문 관리");
		lblOM.setForeground(Color.BLACK);
		lblOM.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		lblOM.setHorizontalAlignment(SwingConstants.CENTER);
		lblOM.setBounds(55, 500, 100, 20);
		add(lblOM);

		lblViews = new JLabel("현황조회/보고");
		lblViews.setForeground(Color.BLACK);
		lblViews.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		lblViews.setHorizontalAlignment(SwingConstants.CENTER);
		lblViews.setBounds(40, 640, 130, 20);
		add(lblViews);

		lblWhite = new JLabel("");
		lblWhite.setOpaque(true);
		lblWhite.setBackground(Color.WHITE);
		lblWhite.setBounds(26, 25, 159, 651);
		add(lblWhite);
	}

}
