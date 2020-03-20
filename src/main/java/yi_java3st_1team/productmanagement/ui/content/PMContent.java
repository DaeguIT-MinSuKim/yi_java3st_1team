package yi_java3st_1team.productmanagement.ui.content;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class PMContent extends JPanel {
	private JTabbedPane tpClientManagement;
	private JPanel pSWRegister;
	private JPanel pSCSO;
	private JPanel pClientDelivery;

	
	public SWUIPanel pSWUIPanel; // 제품등록
	public SPSOUIPanel pSCSOUIPanel; // 매입발주
	public CDUIPanel pCDUIPPanel; // 출고

	public PMContent() {
		initialize();
	}
	
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setBounds(new Rectangle(0, 0, 1270, 700));
		setLayout(new BorderLayout(0, 0));
		
		tpClientManagement = new JTabbedPane(JTabbedPane.TOP);
		tpClientManagement.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tpClientManagement.setForeground(Color.BLACK);
		tpClientManagement.setBackground(SystemColor.inactiveCaptionBorder);
		add(tpClientManagement, BorderLayout.CENTER);
		
		pSWRegister = new JPanel();
		pSWRegister.setBounds(0, 0, 100, 50);
		pSWRegister.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagement.addTab("제품 등록", null, pSWRegister, null);
		pSWRegister.setLayout(new BorderLayout(0, 0));
		
		pSWUIPanel = new SWUIPanel();
		pSWRegister.add(pSWUIPanel, BorderLayout.CENTER);
		
		pSCSO = new JPanel();
		pSCSO.setBounds(0, 0, 100, 50);
		pSCSO.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagement.addTab("발주 / 매입", null, pSCSO, null);
		pSCSO.setLayout(new BorderLayout(0, 0));
		
		pSCSOUIPanel = new SPSOUIPanel();
		pSCSO.add(pSCSOUIPanel, BorderLayout.CENTER);
		
		pClientDelivery = new JPanel();
		pClientDelivery.setBounds(0, 0, 100, 50);
		pClientDelivery.setBackground(SystemColor.inactiveCaptionBorder);
		tpClientManagement.addTab("출  고", null, pClientDelivery, null);
		pClientDelivery.setLayout(new BorderLayout(0, 0));
		
		pCDUIPPanel = new CDUIPanel();
		pClientDelivery.add(pCDUIPPanel, BorderLayout.CENTER);
		
//		pCDRegisterPanel = new CDRegisterPanel();
//		pCDRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
//		pClientDelivery.add(pCDRegisterPanel);
//		pCDRegisterPanel.setLayout(null);
//		
//		pCDListPanel = new CDListPanel();
//		pCDListPanel.setBackground(SystemColor.inactiveCaptionBorder);
//		pClientDelivery.add(pCDListPanel);
//		pCDListPanel.setLayout(null);
	}
}
