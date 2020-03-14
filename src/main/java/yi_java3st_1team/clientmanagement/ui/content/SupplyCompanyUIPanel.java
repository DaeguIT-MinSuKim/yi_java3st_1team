package yi_java3st_1team.clientmanagement.ui.content;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;

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

import yi_java3st_1team.clientmanagement.dto.Supplier;
import yi_java3st_1team.clientmanagement.ui.ZipCodePanel;
import yi_java3st_1team.clientmanagement.ui.list.SCListTblPanel;
import yi_java3st_1team.clientmanagement.ui.panel.SCRegisterPanel;
import yi_java3st_1team.clientmanagement.ui.service.SupplierUIService;
import yi_java3st_1team.exception.InvalidCheckException;

@SuppressWarnings("serial")
public class SupplyCompanyUIPanel extends JPanel implements ActionListener, ItemListener {

	private SupplierUIService service;
	private JLabel lblSC;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnDel;
	public JButton btnGoMain;
	private JButton btnDplCheck;
	private JButton btnPostNum;
	private JLabel lblNewLabel;
	private JLabel lblImg;
	private JLabel lblSCList;
	private JComboBox cmbCate;
	private JTextField tfSerch;
	private JButton btnSerch;
	private SCListTblPanel pSCTblPanel;
	private SCRegisterPanel pSCRPanel;
	private JFrame zipcodeFrame;
	private String selectItem;
	private JButton btnZip;
	private ZipCodePanel zipPanel;
	private String total;

	public SupplyCompanyUIPanel() {
		service = new SupplierUIService();
		initialize();
	}

	private void initialize() {
		setPreferredSize(new Dimension(1270, 700));
		setLayout(new GridLayout(0, 2, 0, 0));

		JPanel pRegisterPanel = new JPanel();
		pRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pRegisterPanel);
		pRegisterPanel.setLayout(null);

		pSCRPanel = new SCRegisterPanel();
		pSCRPanel.setBounds(55, 115, 400, 430);
		pSCRPanel.setNum(service.lastSupplier());
		pRegisterPanel.add(pSCRPanel);

		lblSC = new JLabel("공급회사 등록");
		lblSC.setForeground(Color.BLACK);
		lblSC.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 40));
		lblSC.setHorizontalAlignment(SwingConstants.CENTER);
		lblSC.setBounds(0, 52, 635, 54);
		pRegisterPanel.add(lblSC);

		btnAdd = new JButton("등 록");
		btnAdd.addActionListener(this);
		btnAdd.setFocusable(false);
		btnAdd.setForeground(new Color(0, 102, 204));
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnAdd.setBackground(new Color(135, 206, 250));
		btnAdd.setBounds(66, 580, 100, 30);
		pRegisterPanel.add(btnAdd);

		btnUpdate = new JButton("수 정");
		btnUpdate.addActionListener(this);
		btnUpdate.setFocusable(false);
		btnUpdate.setForeground(new Color(0, 102, 204));
		btnUpdate.setBackground(new Color(135, 206, 250));
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnUpdate.setBounds(198, 580, 100, 30);
		pRegisterPanel.add(btnUpdate);

		btnDel = new JButton("취 소");
		btnDel.addActionListener(this);
		btnDel.setFocusable(false);
		btnDel.setForeground(new Color(0, 102, 204));
		btnDel.setBackground(new Color(135, 206, 250));
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

		btnDplCheck = new JButton("중복확인");
		btnDplCheck.addActionListener(this);
		btnDplCheck.setFocusable(false);
		btnDplCheck.setBackground(new Color(240, 128, 128));
		btnDplCheck.setForeground(Color.WHITE);
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

		lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\etc\\list.png"));
		lblImg.setBounds(22, 60, 40, 40);
		pListPanel.add(lblImg);

		lblSCList = new JLabel("공급회사 LIST");
		lblSCList.setForeground(Color.BLACK);
		lblSCList.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		lblSCList.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCList.setBounds(72, 60, 170, 40);
		pListPanel.add(lblSCList);

		cmbCate = new JComboBox();
		cmbCate.addItemListener(this);
		cmbCate.setModel(new DefaultComboBoxModel(new String[] { "선택", "전체", "회사명", "사업자등록번호", "전화번호" }));
		cmbCate.setBounds(252, 65, 120, 30);
		pListPanel.add(cmbCate);

		tfSerch = new JTextField();
		tfSerch.setColumns(10);
		tfSerch.setBounds(392, 65, 130, 30);
		pListPanel.add(tfSerch);

		btnSerch = new JButton("검색");
		btnSerch.addActionListener(this);
		btnSerch.setFocusable(false);
		btnSerch.setBackground(new Color(135, 206, 250));
		btnSerch.setForeground(Color.WHITE);
		btnSerch.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSerch.setBounds(542, 65, 70, 30);
		pListPanel.add(btnSerch);

		pSCTblPanel = new SCListTblPanel();
		pSCTblPanel.setBounds(22, 125, 590, 510);
		pSCTblPanel.loadDate(service.showSupplierList());
		pSCTblPanel.setPopupMenu(createPopupMenu());
		pListPanel.add(pSCTblPanel);
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
			if (e.getActionCommand().equals("수정")) {
				Supplier upsupp = pSCTblPanel.getSelectedItem();
				pSCRPanel.setItem(upsupp);
			}
			if (e.getActionCommand().equals("삭제")) {
				Supplier delsupp = pSCTblPanel.getSelectedItem();
				service.removeSupplier(delsupp);
				pSCTblPanel.removeRow();
				pSCTblPanel.loadDate(service.showSupplierList());
			}
		}
	};

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnPostNum) {
			btnPostNumActionPerformed(e);
		}
		if (e.getSource() == btnSerch) {
			btnSerchActionPerformed(e);
		}
		if (e.getSource() == btnDplCheck) {
			btnDplCheckActionPerformed(e);
		}
		if (e.getSource() == btnAdd) {
			btnAddActionPerformed(e);
		}
		if (e.getSource() == btnUpdate) {
			btnUpdateActionPerformed(e);
		}
		if (e.getSource() == btnDel) {
			btnDelActionPerformed(e);
		}
		if (e.getSource() == btnZip) {
			btnZipActionPerformed(e);
		}

	}

	private void btnUpdateActionPerformed(ActionEvent e) {
		if (pSCRPanel.getItem().getsName().equals("") || pSCRPanel.getItem().getsAddress().equals("")
				|| pSCRPanel.getItem().getsBln().equals("") || pSCRPanel.getItem().getsTel().equals("")) {
			JOptionPane.showMessageDialog(null, "수정할 회사를 오른쪽 리스트에서 선택해주세요.");
			return;
		} else {
			Supplier upSupp = pSCRPanel.getItem();
			service.modifySupplier(upSupp);
			pSCTblPanel.updateRow(upSupp, pSCTblPanel.getSelectedRowIdx());
			pSCTblPanel.loadDate(service.showSupplierList());
			pSCRPanel.clearTf();
			pSCRPanel.setNum(service.lastSupplier());
		}
	}

	private void btnAddActionPerformed(ActionEvent e) {
		try {
			if (pSCRPanel.getItem().getsName().equals("") || pSCRPanel.getItem().getsAddress().equals("")
					|| pSCRPanel.getItem().getsBln().equals("") || pSCRPanel.getItem().getsTel().equals("")) {
				JOptionPane.showMessageDialog(null, "회사명, 사업자등록번호, 회사주소, 전화번호는 필수입력사항입니다.");
				return;
			} else {
				Supplier newSupp = pSCRPanel.getItem();
				service.addSupplier(newSupp);
				pSCTblPanel.addItem(newSupp);
				pSCTblPanel.loadDate(service.showSupplierList());
				pSCRPanel.clearTf();
				pSCRPanel.setNum(newSupp);
			}
		} catch (InvalidCheckException e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
		} catch (Exception e1) {
			SQLException e2 = (SQLException) e1;
			if (e2.getErrorCode() == 1062) {
				JOptionPane.showMessageDialog(null, "부서번호가 중복");
				System.err.println(e2.getMessage());
				return;
			}
			e1.printStackTrace();
		}
	}

	private void btnDelActionPerformed(ActionEvent e) {
		pSCRPanel.clearTf();
		pSCRPanel.setNum(service.lastSupplier());
	}

	protected void btnDplCheckActionPerformed(ActionEvent e) {
		if (pSCRPanel.getItem().getsName().equals("")) {
			JOptionPane.showMessageDialog(null, "회사명을 입력해주세요.");
		} else {
			Supplier overlapSupp = pSCRPanel.getItem();
			Supplier supplier = service.overlapSupplier(overlapSupp);
			if (supplier == null) {
				JOptionPane.showMessageDialog(null, "등록 가능한 회사입니다.");
			} else {
				JOptionPane.showMessageDialog(null, "이미 존재하는 회사입니다.");
			}
		}
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cmbCate) {
			cmbCateItemStateChanged(e);
		}
	}

	public String cmbCateItemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			selectItem = (String) cmbCate.getSelectedItem();
		}
		return null;
	}

	public void btnSerchActionPerformed(ActionEvent e) {
		if (selectItem == null) {
			return;
		}
		if (selectItem.equals("전체")) {
			pSCTblPanel.loadDate(service.showSupplierList());
		}
		if (selectItem.equals("회사명")) {
			String sName = tfSerch.getText();
			Supplier supplier = new Supplier(sName, null, null);
			pSCTblPanel.loadDate(service.showSupplierListByName(supplier));
			tfSerch.setText("");
		}
		if (selectItem.equals("사업자등록번호")) {
			String sBln = tfSerch.getText();
			Supplier supplier = new Supplier(null, sBln, null);
			pSCTblPanel.loadDate(service.showSupplierListByBln(supplier));
			tfSerch.setText("");
		}
		if (selectItem.equals("전화번호")) {
			String sTel = tfSerch.getText();
			Supplier supplier = new Supplier(null, null, sTel);
			pSCTblPanel.loadDate(service.showSupplierListByTel(supplier));
			tfSerch.setText("");
		}
	}

	public void btnPostNumActionPerformed(ActionEvent e) {
		if (zipcodeFrame == null) {
			zipcodeFrame = new JFrame();
			zipcodeFrame.setBounds(100, 100, 810, 350);
			zipcodeFrame.setTitle("주소 검색");
			zipPanel = new ZipCodePanel();
			zipcodeFrame.getContentPane().add(zipPanel);

			btnZip = new JButton("등   록");
			btnZip.addActionListener(this);
			btnZip.setForeground(new Color(0, 102, 204));
			btnZip.setFont(new Font("맑은 고딕", Font.BOLD, 16));
			btnZip.setBackground(new Color(135, 206, 250));
			btnZip.setBounds(325, 250, 150, 32);
			zipPanel.add(btnZip);

			zipcodeFrame.setVisible(true);

		} else {
			if (zipcodeFrame.isVisible()) {
				return;
			}
			zipcodeFrame.setVisible(true);
		}
	}

	protected void btnZipActionPerformed(ActionEvent e) {
		String add1 = zipPanel.getTfAll().getText().trim();
		String add2 = zipPanel.getTfDetail().getText().trim();
		if (add2.equals("")) {
			total = add1;
		} else {
			total = add1 + " " + add2;
		}
		pSCRPanel.tfSCAddress.setText(total);
		zipcodeFrame.dispose();
	}
}
