package yi_java3st_1team.clientmanagement.ui.content;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.clientmanagement.dto.Supplier;
import yi_java3st_1team.clientmanagement.ui.ZipCodePanel;
import yi_java3st_1team.clientmanagement.ui.list.CListTblPanel;
import yi_java3st_1team.clientmanagement.ui.panel.CRegisterPanel;
import yi_java3st_1team.clientmanagement.ui.service.ClientUIService;

@SuppressWarnings("serial")
public class ClientUIPanel extends JPanel implements ActionListener {
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
	private JFrame zipcodeFrame;

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
		pCRPanel.setNum(service.lastClient());
		pRegisterPanel.add(pCRPanel);
		
		lblSC = new JLabel("고 객 사 관 리");
		lblSC.setForeground(Color.BLACK);
		lblSC.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblSC.setHorizontalAlignment(SwingConstants.CENTER);
		lblSC.setBounds(0, 52, 635, 54);
		pRegisterPanel.add(lblSC);
		
		btnUpdate = new JButton("수 정");
		btnUpdate.addActionListener(this);
		btnUpdate.setFocusable(false);
		btnUpdate.setBackground(new Color(135, 206, 250));
		btnUpdate.setForeground(new Color(0, 102, 204));
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnUpdate.setBounds(66, 580, 100, 30);
		pRegisterPanel.add(btnUpdate);
		
		btnDel = new JButton("취 소");
		btnDel.addActionListener(this);
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
		btnDplCheck.addActionListener(this);
		btnDplCheck.setFocusable(false);
		btnDplCheck.setForeground(Color.WHITE);
		btnDplCheck.setBackground(new Color(240, 128, 128));
		btnDplCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDplCheck.setBounds(465, 210, 100, 30);
		pRegisterPanel.add(btnDplCheck);
		
		btnPostNum = new JButton("주소검색");
		btnPostNum.addActionListener(this);
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
		pCTblPanel.setPopupMenu(createPopupMenu());
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
		cmbCate.setModel(new DefaultComboBoxModel(new String[] {"선택", "전체", "상호명", "대표명", "전화번호", "담당직원"}));
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
	private JPopupMenu createPopupMenu() {
		JPopupMenu popMenu = new JPopupMenu();
		
		JMenuItem updateItem = new JMenuItem("수정");
		updateItem.addActionListener(myPopupMenuListener);
		popMenu.add(updateItem);
		
		JMenuItem deleteItem = new JMenuItem("삭제");
		deleteItem.addActionListener(myPopupMenuListener);
		popMenu.add(deleteItem);
		
		return popMenu;
	}
	
	ActionListener myPopupMenuListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("수정")) {
				Client upclient = pCTblPanel.getSelectedItem();
				pCRPanel.setItem(upclient);
			}
			if(e.getActionCommand().equals("삭제")) {
				Client delclient = pCTblPanel.getSelectedItem();
				service.removeClient(delclient);
				pCTblPanel.removeRow();
			}
		}
	};
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnUpdate) {
			btnUpdateActionPerformed(e);
		}
		if (e.getSource() == btnPostNum) {
			btnPostNumActionPerformed(e);
		}
		if (e.getSource() == btnDel) {
			btnDelActionPerformed(e);
		}
		if (e.getSource() == btnDplCheck) {
			btnDplCheckActionPerformed(e);
		}
	}
	protected void btnDplCheckActionPerformed(ActionEvent e) {
		if(pCRPanel.getName().equals("")) {
			JOptionPane.showMessageDialog(null, "수정할 고객사를 선택해주세요.");
		}else {
			Client overlapClient = pCRPanel.getItem();
			Client client = service.overlapClient(overlapClient);
			if(client == null) {
				JOptionPane.showMessageDialog(null, "수정 가능한 상호입니다.");
			}else {
				JOptionPane.showMessageDialog(null, "이미 존재하는 상호입니다.");
			}
		}
	}
	protected void btnDelActionPerformed(ActionEvent e) {
		pCRPanel.clearTf();
		pCRPanel.setNum(service.lastClient());
	}
	protected void btnPostNumActionPerformed(ActionEvent e) {
		if(zipcodeFrame == null) {
			zipcodeFrame = new JFrame();
			zipcodeFrame.setBounds(100, 100, 810, 350);
			zipcodeFrame.setTitle("주소 검색");
			ZipCodePanel zc = new ZipCodePanel();
			zipcodeFrame.getContentPane().add(zc);
			zipcodeFrame.setVisible(true);
		}else {
			if(zipcodeFrame.isVisible()) {
				return;
			}
			zipcodeFrame.setVisible(true);
		}
	}
	protected void btnUpdateActionPerformed(ActionEvent e) {
		if(pCRPanel.getName().equals("")) {
			JOptionPane.showMessageDialog(null, "수정할 고객사를 선택해주세요.");
			return;
		}else {
			Client upClient = pCRPanel.getItem();
			service.modifyClient(upClient);
			pCTblPanel.updateRow(upClient, pCTblPanel.getSelectedRowIdx());
			pCRPanel.clearTf();
			pCRPanel.setNum(service.lastClient());
		}
	}
}
