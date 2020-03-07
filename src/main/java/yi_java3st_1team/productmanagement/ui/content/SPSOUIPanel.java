package yi_java3st_1team.productmanagement.ui.content;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import yi_java3st_1team.productmanagement.ui.list.SOListTblPanel;
import yi_java3st_1team.productmanagement.ui.list.SPListTblPanel;
import yi_java3st_1team.productmanagement.ui.panel.SPSORegisterPanel;
import yi_java3st_1team.productmanagement.ui.service.SOUIService;
import yi_java3st_1team.productmanagement.ui.service.SPUIService;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

@SuppressWarnings("serial")
public class SPSOUIPanel extends JPanel implements ActionListener {

	private SPSORegisterPanel pSPSOPanel;
	private JLabel lblSPSO;
	private JButton btnSPAdd;
	private JButton btnSOAdd;
	private JButton btnDel;
	private JButton btnGoMain;
	private JButton btnPSSearch;
	private JLabel lblNewLabel;
	private SOListTblPanel pSOTblPanel;
	private JLabel lblImg;
	private JLabel lblSWList;
	private JRadioButton rdbtnSP;
	private JRadioButton rdbtnSO;
	private SPUIService sPService;
	private SOUIService sOService;
	private JPanel pListPanel;
	private SPListTblPanel pSPTblPanel;
	
	public SPSOUIPanel() {
		sPService = new SPUIService();
		sOService = new SOUIService();
		initialize();
	}
	
	private void initialize() {
		setPreferredSize(new Dimension(1270, 700));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pRegisterPanel = new JPanel();
		pRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pRegisterPanel);
		pRegisterPanel.setLayout(null);
		
		pSPSOPanel = new SPSORegisterPanel();
		pSPSOPanel.setBounds(55, 115, 400, 440);
		pRegisterPanel.add(pSPSOPanel);
		pSPSOPanel.setLayout(null);
		
		lblSPSO = new JLabel("매입 & 발주 이력 관리");
		lblSPSO.setForeground(Color.BLACK);
		lblSPSO.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblSPSO.setHorizontalAlignment(SwingConstants.CENTER);
		lblSPSO.setBounds(0, 52, 635, 54);
		pRegisterPanel.add(lblSPSO);
		
		btnSPAdd = new JButton("매입등록");
		btnSPAdd.setFocusable(false);
		btnSPAdd.setBackground(new Color(135, 206, 250));
		btnSPAdd.setForeground(new Color(0, 102, 204));
		btnSPAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSPAdd.setBounds(66, 580, 100, 30);
		pRegisterPanel.add(btnSPAdd);
		
		btnSOAdd = new JButton("발주등록");
		btnSOAdd.setEnabled(false);
		btnSOAdd.setFocusable(false);
		btnSOAdd.setBackground(new Color(135, 206, 250));
		btnSOAdd.setForeground(new Color(0, 102, 204));
		btnSOAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSOAdd.setBounds(198, 580, 100, 30);
		pRegisterPanel.add(btnSOAdd);
		
		btnDel = new JButton("취 소");
		btnDel.setFocusable(false);
		btnDel.setBackground(new Color(135, 206, 250));
		btnDel.setForeground(new Color(0, 102, 204));
		btnDel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDel.setBounds(330, 580, 100, 30);
		pRegisterPanel.add(btnDel);
		
		btnGoMain = new JButton("메인화면");
		btnGoMain.setFocusable(false);
		btnGoMain.setBackground(new Color(25, 25, 112));
		btnGoMain.setForeground(Color.WHITE);
		btnGoMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnGoMain.setBounds(465, 580, 100, 30);
		pRegisterPanel.add(btnGoMain);
		
		btnPSSearch = new JButton("조 회");
		btnPSSearch.setFocusable(false);
		btnPSSearch.setBackground(SystemColor.activeCaptionBorder);
		btnPSSearch.setForeground(Color.WHITE);
		btnPSSearch.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnPSSearch.setBounds(465, 219, 100, 30);
		pRegisterPanel.add(btnPSSearch);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(455, 115, 124, 440);
		pRegisterPanel.add(lblNewLabel);
		
		pListPanel = new JPanel();
		pListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pListPanel);
		pListPanel.setLayout(null);
		
		lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\etc\\list.png"));
		lblImg.setBounds(22, 60, 40, 40);
		pListPanel.add(lblImg);
		
		lblSWList = new JLabel("매입&발주 LIST");
		lblSWList.setForeground(Color.BLACK);
		lblSWList.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		lblSWList.setHorizontalAlignment(SwingConstants.CENTER);
		lblSWList.setBounds(72, 60, 170, 40);
		pListPanel.add(lblSWList);
		
		rdbtnSP = new JRadioButton("  매입 이력");
		rdbtnSP.addActionListener(this);
		rdbtnSP.setForeground(Color.BLACK);
		rdbtnSP.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnSP.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		rdbtnSP.setBounds(320, 70, 110, 20);
		pListPanel.add(rdbtnSP);
		
		rdbtnSO = new JRadioButton("  발주 이력");
		rdbtnSO.addActionListener(this);
		rdbtnSO.setForeground(Color.BLACK);
		rdbtnSO.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnSO.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		rdbtnSO.setBounds(460, 70, 110, 20);
		pListPanel.add(rdbtnSO);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnSP);
		bg.add(rdbtnSO);
		
		rdbtnSP.setSelected(true);
		
		pSPTblPanel = new SPListTblPanel();
		pSPTblPanel.setBounds(22, 125, 590, 510);
		pSPTblPanel.loadDate(sPService.showSupplierPurchaseList());
		pListPanel.add(pSPTblPanel);
		
	}
	
	private void initializeB() {
		setPreferredSize(new Dimension(1270, 700));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pRegisterPanel = new JPanel();
		pRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pRegisterPanel);
		pRegisterPanel.setLayout(null);
		
		pSPSOPanel = new SPSORegisterPanel();
		pSPSOPanel.setBounds(55, 115, 400, 440);
		pRegisterPanel.add(pSPSOPanel);
		pSPSOPanel.setLayout(null);
		
		lblSPSO = new JLabel("매입 & 발주 이력 관리");
		lblSPSO.setForeground(Color.BLACK);
		lblSPSO.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblSPSO.setHorizontalAlignment(SwingConstants.CENTER);
		lblSPSO.setBounds(0, 52, 635, 54);
		pRegisterPanel.add(lblSPSO);
		
		btnSPAdd = new JButton("매입등록");
		btnSPAdd.setEnabled(false);
		btnSPAdd.setFocusable(false);
		btnSPAdd.setBackground(new Color(135, 206, 250));
		btnSPAdd.setForeground(new Color(0, 102, 204));
		btnSPAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSPAdd.setBounds(66, 580, 100, 30);
		pRegisterPanel.add(btnSPAdd);
		
		btnSOAdd = new JButton("발주등록");
		btnSOAdd.setFocusable(false);
		btnSOAdd.setBackground(new Color(135, 206, 250));
		btnSOAdd.setForeground(new Color(0, 102, 204));
		btnSOAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSOAdd.setBounds(198, 580, 100, 30);
		pRegisterPanel.add(btnSOAdd);
		
		btnDel = new JButton("취 소");
		btnDel.setFocusable(false);
		btnDel.setBackground(new Color(135, 206, 250));
		btnDel.setForeground(new Color(0, 102, 204));
		btnDel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDel.setBounds(330, 580, 100, 30);
		pRegisterPanel.add(btnDel);
		
		btnGoMain = new JButton("메인화면");
		btnGoMain.setFocusable(false);
		btnGoMain.setBackground(new Color(25, 25, 112));
		btnGoMain.setForeground(Color.WHITE);
		btnGoMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnGoMain.setBounds(465, 580, 100, 30);
		pRegisterPanel.add(btnGoMain);
		
		btnPSSearch = new JButton("조 회");
		btnPSSearch.setFocusable(false);
		btnPSSearch.setBackground(SystemColor.activeCaptionBorder);
		btnPSSearch.setForeground(Color.WHITE);
		btnPSSearch.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnPSSearch.setBounds(465, 219, 100, 30);
		pRegisterPanel.add(btnPSSearch);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(455, 115, 124, 440);
		pRegisterPanel.add(lblNewLabel);
		
		pListPanel = new JPanel();
		pListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pListPanel);
		pListPanel.setLayout(null);
		
		lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\etc\\list.png"));
		lblImg.setBounds(22, 60, 40, 40);
		pListPanel.add(lblImg);
		
		lblSWList = new JLabel("매입&발주 LIST");
		lblSWList.setForeground(Color.BLACK);
		lblSWList.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		lblSWList.setHorizontalAlignment(SwingConstants.CENTER);
		lblSWList.setBounds(72, 60, 170, 40);
		pListPanel.add(lblSWList);
		
		rdbtnSP = new JRadioButton("  매입 이력");
		rdbtnSP.addActionListener(this);
		rdbtnSP.setForeground(Color.BLACK);
		rdbtnSP.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnSP.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		rdbtnSP.setBounds(320, 70, 110, 20);
		pListPanel.add(rdbtnSP);
		
		rdbtnSO = new JRadioButton("  발주 이력");
		rdbtnSO.addActionListener(this);
		rdbtnSO.setForeground(Color.BLACK);
		rdbtnSO.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnSO.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		rdbtnSO.setBounds(460, 70, 110, 20);
		pListPanel.add(rdbtnSO);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnSP);
		bg.add(rdbtnSO);
		
		rdbtnSO.setSelected(true);
		
		pSOTblPanel = new SOListTblPanel();
		pSOTblPanel.setBounds(22, 125, 590, 510);
		pSOTblPanel.loadDate(sOService.showSupplierOrderList());
		pListPanel.add(pSOTblPanel);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == rdbtnSP) {
			rdbtnSPActionPerformed(e);
		}
		if (e.getSource() == rdbtnSO) {
			rdbtnSOActionPerformed(e);
		}
	}
	protected void rdbtnSOActionPerformed(ActionEvent e) {
		removeAll();
		revalidate();
		repaint();
		initializeB();
		revalidate();
		repaint();
	}
	protected void rdbtnSPActionPerformed(ActionEvent e) {
		removeAll();
		revalidate();
		repaint();
		initialize();
		revalidate();
		repaint();
	}
}
