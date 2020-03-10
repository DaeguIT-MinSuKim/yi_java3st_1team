package yi_java3st_1team.ordermanagement.ui.content;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import yi_java3st_1team.ordermanagement.ui.list.OListPanel;
import yi_java3st_1team.ordermanagement.ui.panel.ClientOCheckPanel;
import yi_java3st_1team.ordermanagement.ui.panel.ORegisterPanel;
import java.awt.Font;
import java.awt.Color;
import yi_java3st_1team.ordermanagement.ui.panel.OCheckPanel;

@SuppressWarnings("serial")
public class OMContent extends JPanel {
	private JTabbedPane tpClientManagement;
	private JPanel pORegister;
	private JPanel pListPanel;
	
	public OCheckPanel pOCheckPanel;
	private OrderUIPanel pOrderUIPanel;

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
		pORegister.setLayout(new BorderLayout(0, 0));
		
		pOrderUIPanel = new OrderUIPanel();
		pORegister.add(pOrderUIPanel, BorderLayout.CENTER);
		
		pListPanel = new JPanel();
		pListPanel.setBounds(0, 0, 100, 50);
		pListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagement.addTab("확인 & 처리", null, pListPanel, null);
		pListPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		pOCheckPanel = new OCheckPanel();
		pListPanel.add(pOCheckPanel);
	}
}
