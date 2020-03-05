package yi_java3st_1team.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import yi_java3st_1team.main.ui.EmployeeMainUIPanel;
import yi_java3st_1team.ordermanagement.ui.OMMainPanel;

@SuppressWarnings("serial")
public class LeftMainMenu extends JPanel implements ActionListener {
	private JLabel lblMenu;
	private JButton btnCM;
	private JButton btnPM;
	private JButton btnOM;
	private JButton btnViews;
	private JLabel lblCM;
	private JLabel lblPM;
	private JLabel lblOM;
	private JLabel lblViews;
	private JLabel lblWhite;
	


	public JButton getBtnCM() {
		return btnCM;
	}
	public void setBtnCM(JButton btnCM) {
		this.btnCM = btnCM;
	}
	public JButton getBtnPM() {
		return btnPM;
	}
	public void setBtnPM(JButton btnPM) {
		this.btnPM = btnPM;
	}
	public JButton getBtnOM() {
		return btnOM;
	}
	public void setBtnOM(JButton btnOM) {
		this.btnOM = btnOM;
	}
	public JButton getBtnViews() {
		return btnViews;
	}
	public void setBtnViews(JButton btnViews) {
		this.btnViews = btnViews;
	}
	
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
		btnCM.addActionListener(this);
		btnCM.setFocusable(false);
		btnCM.setBackground(SystemColor.inactiveCaptionBorder);
		btnCM.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\leftMainMenu\\menu1.png"));
		btnCM.setBounds(40, 90, 130, 100);
		add(btnCM);
		
		btnPM = new JButton("");
		btnPM.addActionListener(this);
		btnPM.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\leftMainMenu\\menu2.png"));
		btnPM.setFocusable(false);
		btnPM.setBackground(SystemColor.inactiveCaptionBorder);
		btnPM.setBounds(40, 240, 130, 100);
		add(btnPM);
		
		btnOM = new JButton("");
		btnOM.addActionListener(this);
		btnOM.setFocusable(false);
		btnOM.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\leftMainMenu\\menu3.png"));
		btnOM.setBackground(SystemColor.inactiveCaptionBorder);
		btnOM.setBounds(40, 390, 130, 100);
		add(btnOM);
		
		btnViews = new JButton("");
		btnViews.addActionListener(this);
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
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnCM) {
			btnCMActionPerformed(e);
		}
		if (e.getSource() == btnPM) {
			btnPMActionPerformed(e);
		}
		if (e.getSource() == btnOM) {
			btnOMActionPerformed(e);
		}
		if (e.getSource() == btnViews) {
			actionPerformedBtnViews(e);
		}

		
	}
	//거래처관리
	private void btnCMActionPerformed(ActionEvent e) {
	}
	
	//제품관리
	protected void btnPMActionPerformed(ActionEvent e) {		
	}
	
	//주문관리
	protected void btnOMActionPerformed(ActionEvent e) {
//		JFrame jf = new JFrame();
//		
//		EmployeeMainUIPanel emu = new EmployeeMainUIPanel();
//		emu.getpStop().removeAll();
//		emu.getpSbot().removeAll();
//		revalidate();
//		repaint();
		
//		JFrame np = new JFrame();
//		np.setSize(500,500);
//		pOMcontent = new OMContent();
//		np.getContentPane().add(pOMcontent);
//		np.setVisible(true);
		
//		pEmpui.pStop.removeAll();
//		revalidate();
//		repaint();
//		setLayout(new CardLayout(-19,0));
//		pOMpanel = new OMMainPanel();
//		pOMpanel.setPreferredSize(new Dimension(1544, 0));
//		pEmpui.pStop.add(pOMpanel, BorderLayout.WEST);
//		pEmpui.pStop.revalidate();
//		pEmpui.pStop.repaint();
		
		
//		EmployeeMainFrame np = new EmployeeMainFrame();
//		np.setSize(1500,900);
//		np.pSection.removeAll();
//		OMMainPanel omp = new OMMainPanel();
////		pEmpui.add(omp);
//		np.pSection.add(omp);
//		np.setVisible(true);
		
//		EmployeeMainUIPanel pEmpui = new EmployeeMainUIPanel();
//		pEmpui.getpStop().removeAll();
//		pEmpui.getpSbot().removeAll();
//		pEmpui.revalidate();
//		pEmpui.repaint();
//		pEmpui.setLayout(new CardLayout(-19,0));
//		OMMainPanel omp = new OMMainPanel();
//		omp.setPreferredSize(new Dimension(1544,0));
//		pEmpui.getpStop().add(omp, BorderLayout.WEST);
//		pEmpui.getpStop().revalidate();
//		pEmpui.getpStop().repaint();
		
		EmployeeMainFrame jf = new EmployeeMainFrame();
		jf.setSize(1500, 900);
		jf.setResizable(false);
		EmployeeMainUIPanel pEmpui = new EmployeeMainUIPanel();
		pEmpui.getpStop().removeAll();
		pEmpui.getpSbot().removeAll();
		OMMainPanel omp = new OMMainPanel();
		pEmpui.getpStop().add(omp);
		jf.getContentPane().add(pEmpui);
		jf.setVisible(true);
		
	}
	
	//현황조회/보고
	protected void actionPerformedBtnViews(ActionEvent e) {
	}
}
