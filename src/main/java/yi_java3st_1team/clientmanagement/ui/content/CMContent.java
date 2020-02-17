package yi_java3st_1team.clientmanagement.ui.content;

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

@SuppressWarnings("serial")
public class CMContent extends JPanel {
	private JTabbedPane tpClientManagement;
	private JPanel pSupplyCompany;
	private JPanel pClient;
	private SCRegisterPanel pSCRegisterPanel;
	private SCListPanel pSCListPanel;
	private CRegisterPanel pCRegisterPanel;
	private CListPanel pCListPanel;

	public CMContent() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setBounds(new Rectangle(0, 0, 1270, 700));
		setLayout(new BorderLayout(0, 0));
		
		tpClientManagement = new JTabbedPane(JTabbedPane.TOP);
		tpClientManagement.setBackground(SystemColor.inactiveCaptionBorder);
		add(tpClientManagement, BorderLayout.CENTER);
		
		pSupplyCompany = new JPanel();
		pSupplyCompany.setBounds(0, 0, 100, 50);
		pSupplyCompany.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagement.addTab("공급회사", null, pSupplyCompany, null);
		pSupplyCompany.setLayout(new GridLayout(0, 2, 0, 0));
		
		pSCRegisterPanel = new SCRegisterPanel();
		pSCRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pSupplyCompany.add(pSCRegisterPanel);
		pSCRegisterPanel.setLayout(null);
		
		pSCListPanel = new SCListPanel();
		pSCListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pSupplyCompany.add(pSCListPanel);
		pSCListPanel.setLayout(null);
		
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
