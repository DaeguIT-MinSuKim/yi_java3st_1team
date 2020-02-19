package yi_java3st_1team.ordermanagement.ui.content;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import yi_java3st_1team.ordermanagement.ui.list.OListPanel;
import yi_java3st_1team.ordermanagement.ui.panel.OCheckPanel;
import yi_java3st_1team.ordermanagement.ui.panel.ORegisterPanel;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public class OMContent extends JPanel {
	private JTabbedPane tpClientManagement;
	private JPanel pORegister;
	private JPanel pListPanel;
	private ORegisterPanel pORegisterPanel;
	private OListPanel pOListPanel;
	private OCheckPanel pOCheckPanel;

	public OMContent() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setBounds(new Rectangle(0, 0, 1270, 700));
		setLayout(new BorderLayout(0, 0));
		
		tpClientManagement = new JTabbedPane(JTabbedPane.TOP);
		tpClientManagement.setForeground(Color.BLACK);
		tpClientManagement.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tpClientManagement.setBackground(SystemColor.inactiveCaptionBorder);
		add(tpClientManagement, BorderLayout.CENTER);
		
		pORegister = new JPanel();
		pORegister.setBounds(0, 0, 100, 50);
		pORegister.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagement.addTab("주문등록", null, pORegister, null);
		pORegister.setLayout(new GridLayout(0, 2, 0, 0));
		
		pORegisterPanel = new ORegisterPanel();
		pORegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pORegister.add(pORegisterPanel);
		pORegisterPanel.setLayout(null);
		
		pOListPanel = new OListPanel();
		pOListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pORegister.add(pOListPanel);
		pOListPanel.setLayout(null);
		
		pListPanel = new JPanel();
		pListPanel.setBounds(0, 0, 100, 50);
		pListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagement.addTab("확인 & 처리", null, pListPanel, null);
		pListPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		pOCheckPanel = new OCheckPanel();
		pOCheckPanel.setBounds(new Rectangle(0, 0, 1270, 700));
		pOCheckPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pListPanel.add(pOCheckPanel);
		pOCheckPanel.setLayout(null);
	}
}
