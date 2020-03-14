package yi_java3st_1team.productmanagement.ui.content;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import yi_java3st_1team.productmanagement.ui.panel.CDRegisterPanel;
import yi_java3st_1team.productmanagement.ui.service.CDUIService;
import yi_java3st_1team.productmanagement.ui.list.CDListPanel;
import yi_java3st_1team.productmanagement.ui.list.CDListTblPanel;

public class CDUIPanel extends JPanel {

	private JLabel lblCD;
	private CDRegisterPanel pCDregiPanel;

	private CDUIService cdService;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnDel;
	private JButton btnGoMain;
	private JPanel panel;
	private CDListTblPanel panel_1;
	
	public CDUIPanel() {
		cdService = new CDUIService();
		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(1270, 700));
		setLayout(null);
		
		JPanel pRegisterPanel = new JPanel();
		pRegisterPanel.setLocation(0, 0);
		pRegisterPanel.setSize(new Dimension(635, 700));
		pRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pRegisterPanel);
		pRegisterPanel.setLayout(null);
		
		pCDregiPanel = new CDRegisterPanel();
		pCDregiPanel.setBackground(Color.WHITE);
		pCDregiPanel.setBounds(54, 116, 525, 430);
		pCDregiPanel.setCDNum(cdService.showlastNum()); //마지막번호
		pRegisterPanel.add(pCDregiPanel);
		pCDregiPanel.setLayout(null);
		
		//제목
		lblCD = new JLabel("출고 이력 관리");
		lblCD.setForeground(Color.BLACK);
		lblCD.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblCD.setHorizontalAlignment(SwingConstants.CENTER);
		lblCD.setBounds(0, 52, 635, 54);
		pRegisterPanel.add(lblCD);
		
		btnAdd = new JButton("등 록");
		btnAdd.setBackground(new Color(135, 206, 250));
		btnAdd.setForeground(new Color(0, 102, 204));
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnAdd.setFocusable(false);
		btnAdd.setBounds(66, 580, 100, 30);
		pRegisterPanel.add(btnAdd);
		
		btnUpdate = new JButton("수 정");
		btnUpdate.setBackground(new Color(135, 206, 250));
		btnUpdate.setForeground(new Color(0, 102, 204));
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnUpdate.setFocusable(false);
		btnUpdate.setBounds(198, 580, 100, 30);
		pRegisterPanel.add(btnUpdate);
		
		btnDel = new JButton("취 소");
		btnDel.setBackground(new Color(135, 206, 250));
		btnDel.setForeground(new Color(0, 102, 204));
		btnDel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDel.setFocusable(false);
		btnDel.setBounds(330, 580, 100, 30);
		pRegisterPanel.add(btnDel);
		
		btnGoMain = new JButton("메인화면");
		btnGoMain.setBackground(new Color(25, 25, 112));
		btnGoMain.setForeground(Color.WHITE);
		btnGoMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnGoMain.setFocusable(false);
		btnGoMain.setBounds(465, 580, 100, 30);
		pRegisterPanel.add(btnGoMain);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(635, 0, 635, 700);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\etc\\list.png"));
		lblImg.setBounds(22, 60, 40, 40);
		panel.add(lblImg);
		
		JLabel lblCDList = new JLabel("출고 LIST");
		lblCDList.setForeground(Color.BLACK);
		lblCDList.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		lblCDList.setHorizontalAlignment(SwingConstants.CENTER);
		lblCDList.setBounds(72, 60, 120, 40);
		panel.add(lblCDList);
		
		panel_1 = new CDListTblPanel();
		panel_1.setBounds(22, 125, 590, 510);
		panel_1.loadDate(cdService.shpwClientDeliveryList());
		panel.add(panel_1);
	}
}
