package yi_java3st_1team.ordermanagement.ui.content;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import yi_java3st_1team.ordermanagement.ui.list.ClientOListPanel;
import yi_java3st_1team.ordermanagement.ui.list.OListPanel;
import yi_java3st_1team.ordermanagement.ui.panel.ClientORegisterPanel;
import yi_java3st_1team.ordermanagement.ui.panel.OCheckPanel;
import yi_java3st_1team.ordermanagement.ui.panel.ORegisterPanel;

@SuppressWarnings("serial")
public class ClientOContent extends JPanel {
	private JTabbedPane tpClientManagement;
	private JPanel pORegister;
	private JPanel pListPanel;
	private ClientORegisterPanel pCORegisterPanel;
	private ClientOListPanel pCOListPanel;

	public ClientOContent() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setBounds(new Rectangle(0, 0, 1270, 700));
		setLayout(new BorderLayout(0, 0));
		
		tpClientManagement = new JTabbedPane(JTabbedPane.TOP);
		tpClientManagement.setBackground(SystemColor.inactiveCaptionBorder);
		add(tpClientManagement, BorderLayout.CENTER);
		
		pORegister = new JPanel();
		pORegister.setBounds(0, 0, 100, 50);
		pORegister.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagement.addTab("주문 등록", null, pORegister, null);
		pORegister.setLayout(new GridLayout(0, 2, 0, 0));
		
		pCORegisterPanel = new ClientORegisterPanel();
		pCORegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pORegister.add(pCORegisterPanel);
		pCORegisterPanel.setLayout(null);
		
		pCOListPanel = new ClientOListPanel();
		pCOListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pORegister.add(pCOListPanel);
		pCOListPanel.setLayout(null);
		
		pListPanel = new JPanel();
		pListPanel.setBounds(0, 0, 100, 50);
		pListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagement.addTab("주문 현황", null, pListPanel, null);
		pListPanel.setLayout(new GridLayout(0, 1, 0, 0));
	}
}
