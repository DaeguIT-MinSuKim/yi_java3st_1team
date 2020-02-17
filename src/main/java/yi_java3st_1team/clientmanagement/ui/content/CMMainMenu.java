package yi_java3st_1team.clientmanagement.ui.content;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CMMainMenu extends JPanel implements ActionListener {
	private JLabel lblMenu;
	private JButton btnCM;
	private JButton btnPM;
	private JButton btnOM;
	private JButton btnViews;
	private JLabel lblCM;
	private JLabel lblPM;
	private JLabel lblOM;
	private JLabel lblViews;

	public CMMainMenu() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setBounds(new Rectangle(0, 0, 210, 700));
		setLayout(null);
		
		lblMenu = new JLabel("M E N U");
		lblMenu.setFont(new Font("굴림", Font.BOLD, 30));
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(30, 40, 150, 40);
		add(lblMenu);
		
		btnCM = new JButton("");
		btnCM.addActionListener(this);
		btnCM.setFocusable(false);
		btnCM.setBackground(SystemColor.inactiveCaptionBorder);
		btnCM.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\menu1.png"));
		btnCM.setBounds(40, 90, 130, 100);
		add(btnCM);
		
		btnPM = new JButton("");
		btnPM.addActionListener(this);
		btnPM.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\menu2.png"));
		btnPM.setFocusable(false);
		btnPM.setBackground(SystemColor.inactiveCaptionBorder);
		btnPM.setBounds(40, 240, 130, 100);
		add(btnPM);
		
		btnOM = new JButton("");
		btnOM.addActionListener(this);
		btnOM.setFocusable(false);
		btnOM.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\menu3.png"));
		btnOM.setBackground(SystemColor.inactiveCaptionBorder);
		btnOM.setBounds(40, 390, 130, 100);
		add(btnOM);
		
		btnViews = new JButton("");
		btnViews.setFocusable(false);
		btnViews.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\menu4.png"));
		btnViews.setBackground(SystemColor.inactiveCaptionBorder);
		btnViews.setBounds(40, 530, 130, 100);
		add(btnViews);
		
		lblCM = new JLabel("거래처 관리");
		lblCM.setFont(new Font("굴림", Font.BOLD, 16));
		lblCM.setHorizontalAlignment(SwingConstants.CENTER);
		lblCM.setBounds(55, 200, 100, 20);
		add(lblCM);
		
		lblPM = new JLabel("제품 관리");
		lblPM.setFont(new Font("굴림", Font.BOLD, 16));
		lblPM.setHorizontalAlignment(SwingConstants.CENTER);
		lblPM.setBounds(55, 350, 100, 20);
		add(lblPM);
		
		lblOM = new JLabel("주문 관리");
		lblOM.setFont(new Font("굴림", Font.BOLD, 16));
		lblOM.setHorizontalAlignment(SwingConstants.CENTER);
		lblOM.setBounds(55, 500, 100, 20);
		add(lblOM);
		
		lblViews = new JLabel("현황조회/보고");
		lblViews.setFont(new Font("굴림", Font.BOLD, 16));
		lblViews.setHorizontalAlignment(SwingConstants.CENTER);
		lblViews.setBounds(40, 640, 130, 20);
		add(lblViews);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOM) {
			btnOMActionPerformed(e);
		}
		if (e.getSource() == btnPM) {
			btnPMActionPerformed(e);
		}
		if (e.getSource() == btnCM) {
			btnCMActionPerformed(e);
		}
	}
	protected void btnCMActionPerformed(ActionEvent e) {
		
	}
	protected void btnPMActionPerformed(ActionEvent e) {
	}
	protected void btnOMActionPerformed(ActionEvent e) {
	}
}
