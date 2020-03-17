package yi_java3st_1team.ordermanagement.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import javafx.application.Platform;
import yi_java3st_1team.main.ClientMainFrame;
import yi_java3st_1team.main.chart.PanelPieChart;
import yi_java3st_1team.main.logout.ClientLoginOkPanel;
import yi_java3st_1team.main.ui.ClientMainUIPanel;
import yi_java3st_1team.ordermanagement.ui.content.ClientOrderUIPanel;
import yi_java3st_1team.ordermanagement.ui.panel.ClientOCheckPanel;

@SuppressWarnings("serial")
public class ClientOMainPanel extends JPanel implements ActionListener{
	public JTabbedPane tpClientManagement;
	private JPanel pORegister;
	private JPanel pListPanel;
	private ClientOCheckPanel pOCheckPanel;
	private ClientOrderUIPanel pCOrderUIPanel;
	private ClientLoginOkPanel pCLogin;
	private ClientMainUIPanel client;

	public ClientOMainPanel() {

		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(1530, 700));
		setBackground(SystemColor.inactiveCaption);
		setBounds(new Rectangle(0, 0, 1530, 700));
		setLayout(new GridLayout(0, 1, 0, 0));
		
		tpClientManagement = new JTabbedPane(JTabbedPane.TOP);
		tpClientManagement.setForeground(Color.BLACK);
		tpClientManagement.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tpClientManagement.setBackground(SystemColor.inactiveCaptionBorder);
		add(tpClientManagement);
		
		pORegister = new JPanel();
		pORegister.setBounds(0, 0, 100, 50);
		pORegister.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagement.addTab("주문 등록", null, pORegister, null);
		pORegister.setLayout(new BorderLayout(0, 0));
		
		pCOrderUIPanel = new ClientOrderUIPanel();
		pORegister.add(pCOrderUIPanel, BorderLayout.CENTER);
		
		pListPanel = new JPanel();
		pListPanel.setBounds(0, 0, 100, 50);
		pListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagement.addTab("주문 현황", null, pListPanel, null);
		pListPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		pOCheckPanel = new ClientOCheckPanel();
		pListPanel.add(pOCheckPanel);
		
		pCOrderUIPanel.btnGoMain.addActionListener(this);
		pOCheckPanel.btnGoMain.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == pCOrderUIPanel.btnGoMain) {
			actionPerformedMainBtn(e);
		}
		if(e.getSource() == pOCheckPanel.btnGoMain) {
			actionPerformedMainBtn(e);
		}
		
		// 로그아웃
		try {
			if (e.getSource() == pCLogin.btnLogout) {
				actionPerformedBtnLogout(e);
			}
		} catch (NullPointerException a) {

		}
	}
	private void actionPerformedBtnLogout(ActionEvent e) {
		removeAll();
		revalidate();
		repaint();
		client = new ClientMainUIPanel();
		add(client);
		client.loginCl = null;
		ClientMainFrame.btnlogout.setVisible(false);
		
		
	}
	private void actionPerformedMainBtn(ActionEvent e) {
		removeAll();
		revalidate();
		repaint();
		
		client = new ClientMainUIPanel();
		add(client);
		ClientMainFrame.btnlogout.setVisible(false);
		
		client.pStop.removeAll();
		pCLogin = new ClientLoginOkPanel();
		client.pStop.add(pCLogin, BorderLayout.WEST);
		
		pCLogin.manager.setText("[고객 로그인]");
		
		pCLogin.loginImg.setIcon(new ImageIcon(
				"D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\loginMain\\loginCustomer.png"));
		pCLogin.loginSuc.setText(
				"<html>반갑습니다!<br><span style='color:blue'>" + client.loginCl.getcName() + " 고객</span>님이<br>로그인 하셨습니다.</html>");
		String cNum = String.format("C%04d", client.loginCl.getcNo());
		pCLogin.empInfo.setText("<html>- 고객번호 : <span style='color:red'>" + cNum
				+ "</span><br>- 상호명 : <span style='color:green'>" + client.loginCl.getcName() + "</span></html>");

		client.pStop.add(client.pImg01);
		
		// 파이차트
		client.pImg02.remove(client.pLogo);
		PanelPieChart pie = new PanelPieChart();
		pie.setPreferredSize(new Dimension(350, 250));
		client.pImg02.add(pie, BorderLayout.NORTH);
		Platform.runLater(() -> client.initFX(pie));
		client.pStop.add(pCLogin, BorderLayout.WEST);
		client.pStop.revalidate();
		client.pStop.repaint();
		
		//로그아웃버튼
		pCLogin.btnLogout.addActionListener(this);
		
		
	}
}
