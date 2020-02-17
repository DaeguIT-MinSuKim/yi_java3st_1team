package yi_java3st_1team.productmanagement.ui.content;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import yi_java3st_1team.productmanagement.ui.panel.SWRegisterPanel;
import yi_java3st_1team.productmanagement.ui.panel.SWListPanel;

@SuppressWarnings("serial")
public class PMContent extends JPanel {
	private JTabbedPane tpClientManagetment;
	private JPanel pSWRegister;
	private JPanel pSCSO;
	private JPanel pClientDelivery;
	private SWRegisterPanel pSWRegisterPanel;
	private SWListPanel pSWListPanel;
	private JPanel panel;
	private JPanel panel_1;

	public PMContent() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setBounds(new Rectangle(0, 0, 1270, 700));
		setLayout(new BorderLayout(0, 0));
		
		tpClientManagetment = new JTabbedPane(JTabbedPane.TOP);
		tpClientManagetment.setBackground(SystemColor.inactiveCaption);
		add(tpClientManagetment, BorderLayout.CENTER);
		
		pSWRegister = new JPanel();
		pSWRegister.setBounds(0, 0, 100, 50);
		pSWRegister.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagetment.addTab("제품 등록", null, pSWRegister, null);
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
		tpClientManagetment.addTab("매입 / 발주", null, pSCSO, null);
		pSCSO.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel = new JPanel();
		pSCSO.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel_1 = new JPanel();
		pSCSO.add(panel_1);
		
		pClientDelivery = new JPanel();
		pClientDelivery.setBounds(0, 0, 100, 50);
		pClientDelivery.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagetment.addTab("출  고", null, pClientDelivery, null);
	}
}
