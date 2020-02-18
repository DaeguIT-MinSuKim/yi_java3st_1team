package yi_java3st_1team.test;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import yi_java3st_1team.clientmanagement.ui.list.CListPanel;
import yi_java3st_1team.clientmanagement.ui.list.SCListPanel;
import yi_java3st_1team.clientmanagement.ui.panel.CRegisterPanel;
import yi_java3st_1team.clientmanagement.ui.panel.SCRegisterPanel;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class CMContentTest extends JPanel {
	private JTabbedPane tpClientManagement;
	private JPanel pSupplyCompany;
	private JPanel pClient;
	private SCRegisterPanelTest pSCRegisterPanel;
	private SCListPanelTest pSCListPanelTest;
	private CRegisterPanel pCRegisterPanel;
	private CListPanel pCListPanel;

	public CMContentTest() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setBounds(new Rectangle(0, 0, 1270, 700));
		setLayout(new BorderLayout(0, 0));
		
		tpClientManagement = new JTabbedPane(JTabbedPane.TOP);
		tpClientManagement.setForeground(Color.BLACK);
		tpClientManagement.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		tpClientManagement.setBackground(SystemColor.inactiveCaptionBorder);
		add(tpClientManagement, BorderLayout.CENTER);
		
		pSupplyCompany = new JPanel();
		pSupplyCompany.setBounds(0, 0, 100, 50);
		pSupplyCompany.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagement.addTab("공급회사", null, pSupplyCompany, null);
		pSupplyCompany.setLayout(new GridLayout(0, 2, 0, 0));
		
		pSCRegisterPanel = new SCRegisterPanelTest();
		pSCRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pSupplyCompany.add(pSCRegisterPanel);
		pSCRegisterPanel.setLayout(null);
		
		pSCListPanelTest = new SCListPanelTest();
		pSCListPanelTest.setBackground(SystemColor.inactiveCaptionBorder);
		pSupplyCompany.add(pSCListPanelTest);
		pSCListPanelTest.setLayout(null);
		
		pClient = new JPanel();
		pClient.setBounds(0, 0, 100, 50);
		pClient.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagement.addTab("고객사", null, pClient, null);
		pClient.setLayout(new GridLayout(0, 2, 0, 0));
		
		pCRegisterPanel = new CRegisterPanel();
		pCRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pClient.add(pCRegisterPanel);
		pCRegisterPanel.setLayout(null);
		
		pCListPanel = new CListPanel();
		pCListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pClient.add(pCListPanel);
		pCListPanel.setLayout(null);
	}
}
