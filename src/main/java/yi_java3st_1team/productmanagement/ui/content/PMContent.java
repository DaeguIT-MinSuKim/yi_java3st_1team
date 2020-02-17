package yi_java3st_1team.productmanagement.ui.content;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import yi_java3st_1team.productmanagement.ui.list.SWListPanel;
import yi_java3st_1team.productmanagement.ui.panel.SWRegisterPanel;
import yi_java3st_1team.productmanagement.ui.panel.SCSORegisterPanel;
import yi_java3st_1team.productmanagement.ui.list.SCSOListPanel;
import yi_java3st_1team.productmanagement.ui.panel.CDRegisterPanel;
import yi_java3st_1team.productmanagement.ui.list.CDListPanel;

@SuppressWarnings("serial")
public class PMContent extends JPanel {
	private JTabbedPane tpClientManagement;
	private JPanel pSWRegister;
	private JPanel pSCSO;
	private JPanel pClientDelivery;
	private SWRegisterPanel pSWRegisterPanel;
	private SWListPanel pSWListPanel;
	private SCSORegisterPanel pSCSORegisterPanel;
	private SCSOListPanel pSCSOListPanel;
	private CDRegisterPanel pCDRegisterPanel;
	private CDListPanel pCDListPanel;

	public PMContent() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setBounds(new Rectangle(0, 0, 1270, 700));
		setLayout(new BorderLayout(0, 0));
		
		tpClientManagement = new JTabbedPane(JTabbedPane.TOP);
		tpClientManagement.setBackground(SystemColor.inactiveCaptionBorder);
		add(tpClientManagement, BorderLayout.CENTER);
		
		pSWRegister = new JPanel();
		pSWRegister.setBounds(0, 0, 100, 50);
		pSWRegister.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagement.addTab("제품 등록", null, pSWRegister, null);
		pSWRegister.setLayout(new GridLayout(0, 2, 0, 0));
		
		pSWRegisterPanel = new SWRegisterPanel();
		pSWRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pSWRegister.add(pSWRegisterPanel);
		pSWRegisterPanel.setLayout(null);
		
		pSWListPanel = new SWListPanel();
		pSWListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pSWRegister.add(pSWListPanel);
		pSWListPanel.setLayout(null);
		
		pSCSO = new JPanel();
		pSCSO.setBounds(0, 0, 100, 50);
		pSCSO.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagement.addTab("매입 / 발주", null, pSCSO, null);
		pSCSO.setLayout(new GridLayout(0, 2, 0, 0));
		
		pSCSORegisterPanel = new SCSORegisterPanel();
		pSCSORegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pSCSO.add(pSCSORegisterPanel);
		pSCSORegisterPanel.setLayout(null);
		
		pSCSOListPanel = new SCSOListPanel();
		pSCSOListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pSCSO.add(pSCSOListPanel);
		pSCSOListPanel.setLayout(null);
		
		pClientDelivery = new JPanel();
		pClientDelivery.setBounds(0, 0, 100, 50);
		pClientDelivery.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagement.addTab("출  고", null, pClientDelivery, null);
		pClientDelivery.setLayout(new GridLayout(0, 2, 0, 0));
		
		pCDRegisterPanel = new CDRegisterPanel();
		pCDRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pClientDelivery.add(pCDRegisterPanel);
		pCDRegisterPanel.setLayout(null);
		
		pCDListPanel = new CDListPanel();
		pCDListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pClientDelivery.add(pCDListPanel);
		pCDListPanel.setLayout(null);
	}
}
