package yi_java3st_1team.ordermanagement.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import yi_java3st_1team.ordermanagement.ui.list.ClientOListPanel;
import yi_java3st_1team.ordermanagement.ui.list.OListPanel;
import yi_java3st_1team.ordermanagement.ui.panel.ClientORegisterPanel;
import yi_java3st_1team.ordermanagement.ui.panel.ClientOCheckPanel;
import yi_java3st_1team.ordermanagement.ui.panel.ORegisterPanel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import yi_java3st_1team.ordermanagement.ui.content.ClientOrderUIPanel;

@SuppressWarnings("serial")
public class ClientOMainPanel extends JPanel {
	private JTabbedPane tpClientManagement;
	private JPanel pORegister;
	private JPanel pListPanel;
	private ClientOCheckPanel pOCheckPanel;
	private ClientOrderUIPanel pCOrderUIPanel;

	public ClientOMainPanel() {

		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(1530, 700));
		setBackground(SystemColor.inactiveCaptionBorder);
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
	}
}
