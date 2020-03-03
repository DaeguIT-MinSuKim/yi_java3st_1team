package yi_java3st_1team.clientmanagement.ui.content;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import yi_java3st_1team.clientmanagement.ui.panel.CRegisterPanel;
import yi_java3st_1team.clientmanagement.ui.service.ClientUIService;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import yi_java3st_1team.clientmanagement.ui.list.CListTblPanel;

@SuppressWarnings("serial")
public class ClientUIPanel extends JPanel {
	private CRegisterPanel pCRPanel;
	private JLabel lblSC;
	private JButton btnUpdate;
	private JButton btnDel;
	private JButton btnGoMain;
	private JButton btnDplCheck;
	private JButton btnPostNum;
	private JLabel lblImg;
	private JLabel lblCList;
	private JTextField tfSerch;
	private JButton btnSerch;
	private JLabel lblNewLabel;
	private CListTblPanel pCTblPanel;
	private ClientUIService service;

	public ClientUIPanel() {
		service = new ClientUIService();
		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(1270, 700));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pRegisterPanel = new JPanel();
		pRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pRegisterPanel);
		pRegisterPanel.setLayout(null);
		
		pCRPanel = new CRegisterPanel();
		pCRPanel.setBackground(Color.WHITE);
		pCRPanel.setBounds(55, 115, 400, 430);
		pRegisterPanel.add(pCRPanel);
		
		lblSC = new JLabel("고 객 사 관 리");
		lblSC.setForeground(Color.BLACK);
		lblSC.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblSC.setHorizontalAlignment(SwingConstants.CENTER);
		lblSC.setBounds(0, 52, 635, 54);
		pRegisterPanel.add(lblSC);
		
		btnUpdate = new JButton("수 정");
		btnUpdate.setFocusable(false);
		btnUpdate.setBackground(new Color(135, 206, 250));
		btnUpdate.setForeground(new Color(0, 102, 204));
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnUpdate.setBounds(66, 580, 100, 30);
		pRegisterPanel.add(btnUpdate);
		
		btnDel = new JButton("취 소");
		btnDel.setFocusable(false);
		btnDel.setBackground(new Color(135, 206, 250));
		btnDel.setForeground(new Color(0, 102, 204));
		btnDel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDel.setBounds(270, 580, 100, 30);
		pRegisterPanel.add(btnDel);
		
		btnGoMain = new JButton("메인화면");
		btnGoMain.setFocusable(false);
		btnGoMain.setBackground(new Color(25, 25, 112));
		btnGoMain.setForeground(Color.WHITE);
		btnGoMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnGoMain.setBounds(465, 580, 100, 30);
		pRegisterPanel.add(btnGoMain);
		
		btnDplCheck = new JButton("중복확인");
		btnDplCheck.setFocusable(false);
		btnDplCheck.setForeground(Color.WHITE);
		btnDplCheck.setBackground(new Color(240, 128, 128));
		btnDplCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDplCheck.setBounds(465, 210, 100, 30);
		pRegisterPanel.add(btnDplCheck);
		
		btnPostNum = new JButton("주소검색");
		btnPostNum.setFocusable(false);
		btnPostNum.setBackground(new Color(70, 130, 180));
		btnPostNum.setForeground(Color.WHITE);
		btnPostNum.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnPostNum.setBounds(465, 350, 100, 30);
		pRegisterPanel.add(btnPostNum);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(455, 115, 124, 430);
		pRegisterPanel.add(lblNewLabel);
		
		JPanel pListPanel = new JPanel();
		pListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pListPanel);
		pListPanel.setLayout(null);
		
		pCTblPanel = new CListTblPanel();
		pCTblPanel.setBounds(22, 125, 590, 510);
		pCTblPanel.loadDate(service.showClientList());
		pListPanel.add(pCTblPanel);
		
		lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\etc\\list.png"));
		lblImg.setBounds(22, 60, 40, 40);
		pListPanel.add(lblImg);
		
		lblCList = new JLabel("고 객 사 LIST");
		lblCList.setForeground(Color.BLACK);
		lblCList.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		lblCList.setHorizontalAlignment(SwingConstants.CENTER);
		lblCList.setBounds(72, 60, 170, 40);
		pListPanel.add(lblCList);
		
		JComboBox cmbCate = new JComboBox();
		cmbCate.setBounds(252, 65, 120, 30);
		pListPanel.add(cmbCate);
		
		tfSerch = new JTextField();
		tfSerch.setColumns(10);
		tfSerch.setBounds(392, 65, 130, 30);
		pListPanel.add(tfSerch);
		
		btnSerch = new JButton("검색");
		btnSerch.setFocusable(false);
		btnSerch.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSerch.setForeground(Color.WHITE);
		btnSerch.setBackground(new Color(135, 206, 250));
		btnSerch.setBounds(542, 65, 70, 30);
		pListPanel.add(btnSerch);
	}
}
