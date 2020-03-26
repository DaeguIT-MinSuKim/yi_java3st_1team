package yi_java3st_1team.productmanagement.ui.content;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import yi_java3st_1team.exception.InvalidCheckException;
import yi_java3st_1team.main.employee.ui.EmployeeMainUIPanel;
import yi_java3st_1team.ordermanagement.dto.InventoryQuantity;
import yi_java3st_1team.ordermanagement.ui.service.IQUIService;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.productmanagement.dto.SupplierOrder;
import yi_java3st_1team.productmanagement.dto.SupplierPurchase;
import yi_java3st_1team.productmanagement.ui.list.SOListTblPanel;
import yi_java3st_1team.productmanagement.ui.list.SPListTblPanel;
import yi_java3st_1team.productmanagement.ui.panel.SPSORegisterPanel;
import yi_java3st_1team.productmanagement.ui.service.SOUIService;
import yi_java3st_1team.productmanagement.ui.service.SPUIService;
import yi_java3st_1team.productmanagement.ui.service.SWUIService;

@SuppressWarnings("serial")
public class SPSOUIPanel extends JPanel implements ActionListener {
	private SPSOUIPanel main;
	private SPSORegisterPanel pSPSOPanel;
	private JLabel lblSPSO;
	private JButton btnSPAdd;
	private JButton btnSPUp;
	private JButton btnDel;
	public JButton btnGoMain;
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
	private SWUIService sWService;
	private JButton btnSOAdd;
	private JButton btnSOUp;
	private JButton btnDel1;
	private EmployeeMainUIPanel emp;
	private IQUIService iqService;

	public SPSOUIPanel() {
		sPService = new SPUIService();
		sOService = new SOUIService();
		sWService = new SWUIService();
		iqService = new IQUIService();
		initializeSO();
	}

	private void initializeSP() {
		setPreferredSize(new Dimension(1270, 700));
		setLayout(new GridLayout(0, 2, 0, 0));

		JPanel pRegisterPanel = new JPanel();
		pRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pRegisterPanel);
		pRegisterPanel.setLayout(null);

		pSPSOPanel = new SPSORegisterPanel();
		pSPSOPanel.setBounds(55, 115, 400, 440);
		pSPSOPanel.setNum1(sPService.lastSP());
		pRegisterPanel.add(pSPSOPanel);
		pSPSOPanel.setLayout(null);

		lblSPSO = new JLabel("발주 & 매입 이력 관리");
		lblSPSO.setForeground(Color.BLACK);
		lblSPSO.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblSPSO.setHorizontalAlignment(SwingConstants.CENTER);
		lblSPSO.setBounds(0, 52, 635, 54);
		pRegisterPanel.add(lblSPSO);

		btnSPAdd = new JButton("매입등록");
		btnSPAdd.addActionListener(this);
		btnSPAdd.setFocusable(false);
		btnSPAdd.setBackground(new Color(135, 206, 250));
		btnSPAdd.setForeground(new Color(0, 102, 204));
		btnSPAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSPAdd.setBounds(66, 580, 100, 30);
		pRegisterPanel.add(btnSPAdd);

		btnSPUp = new JButton("매입수정");
		btnSPUp.addActionListener(this);
		btnSPUp.setFocusable(false);
		btnSPUp.setBackground(new Color(135, 206, 250));
		btnSPUp.setForeground(new Color(0, 102, 204));
		btnSPUp.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSPUp.setBounds(198, 580, 100, 30);
		pRegisterPanel.add(btnSPUp);

		btnDel = new JButton("취 소");
		btnDel.addActionListener(this);
		btnDel.setFocusable(false);
		btnDel.setBackground(new Color(135, 206, 250));
		btnDel.setForeground(new Color(0, 102, 204));
		btnDel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDel.setBounds(330, 580, 100, 30);
		pRegisterPanel.add(btnDel);

		btnGoMain = new JButton("메인화면");
		btnGoMain.addActionListener(this);
		btnGoMain.setFocusable(false);
		btnGoMain.setBackground(new Color(25, 25, 112));
		btnGoMain.setForeground(Color.WHITE);
		btnGoMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnGoMain.setBounds(465, 580, 100, 30);
		pRegisterPanel.add(btnGoMain);

		btnPSSearch = new JButton("조 회");
		btnPSSearch.addActionListener(this);
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
		rdbtnSP.setBounds(460, 70, 110, 20);
		pListPanel.add(rdbtnSP);

		rdbtnSO = new JRadioButton("  발주 이력");
		rdbtnSO.addActionListener(this);
		rdbtnSO.setForeground(Color.BLACK);
		rdbtnSO.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnSO.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		rdbtnSO.setBounds(320, 70, 110, 20);
		pListPanel.add(rdbtnSO);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnSP);
		bg.add(rdbtnSO);

		rdbtnSP.setSelected(true);

		pSPTblPanel = new SPListTblPanel();
		pSPTblPanel.setBounds(22, 125, 590, 510);
		pSPTblPanel.loadDate(sPService.showSupplierPurchaseList());
		pSPTblPanel.setPopupMenu(createPopupMenuSP());
		pListPanel.add(pSPTblPanel);

	}

	private JPopupMenu createPopupMenuSP() {
		JPopupMenu popMenu = new JPopupMenu();

		JMenuItem updateItem = new JMenuItem("수정");
		updateItem.addActionListener(myPopupMenuListener1);
		popMenu.add(updateItem);

		JMenuItem deleteItem = new JMenuItem("삭제");
		deleteItem.addActionListener(myPopupMenuListener1);
		popMenu.add(deleteItem);

		return popMenu;
	}

	ActionListener myPopupMenuListener1 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("수정")) {
				SupplierPurchase upSupPur = pSPTblPanel.getSelectedItem();
				pSPSOPanel.setItem(upSupPur);
			}
			if (e.getActionCommand().equals("삭제")) {
				int choice = JOptionPane.showConfirmDialog(main,"정말 삭제하시겠습니까?", "삭제", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if(choice == 0) {
					SupplierPurchase delSupPur = pSPTblPanel.getSelectedItem();
					int nowQty = iqService.showQty(delSupPur.getSpPno());
					int totalQty = nowQty - delSupPur.getSpQty();
					InventoryQuantity upIQ = new InventoryQuantity(delSupPur.getSpPno(), totalQty);
					iqService.motifyIQ(upIQ);
					sPService.removeSupplierPurchase(delSupPur);
					pSPTblPanel.removeRow();
					pSPTblPanel.loadDate(sPService.showSupplierPurchaseList());
				}	
			}
		}
	};

	private void initializeSO() {
		setPreferredSize(new Dimension(1270, 700));
		setLayout(new GridLayout(0, 2, 0, 0));

		JPanel pRegisterPanel = new JPanel();
		pRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pRegisterPanel);
		pRegisterPanel.setLayout(null);

		pSPSOPanel = new SPSORegisterPanel();
		pSPSOPanel.setBounds(55, 115, 400, 440);
		pSPSOPanel.setNum2(sOService.lastSO());
		pRegisterPanel.add(pSPSOPanel);
		pSPSOPanel.setLayout(null);

		lblSPSO = new JLabel("발주 & 매입 이력 관리");
		lblSPSO.setForeground(Color.BLACK);
		lblSPSO.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblSPSO.setHorizontalAlignment(SwingConstants.CENTER);
		lblSPSO.setBounds(0, 52, 635, 54);
		pRegisterPanel.add(lblSPSO);

		btnSOAdd = new JButton("발주등록");
		btnSOAdd.addActionListener(this);
		btnSOAdd.setFocusable(false);
		btnSOAdd.setBackground(new Color(135, 206, 250));
		btnSOAdd.setForeground(new Color(0, 102, 204));
		btnSOAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSOAdd.setBounds(66, 580, 100, 30);
		pRegisterPanel.add(btnSOAdd);

		btnSOUp = new JButton("발주수정");
		btnSOUp.addActionListener(this);
		btnSOUp.setFocusable(false);
		btnSOUp.setBackground(new Color(135, 206, 250));
		btnSOUp.setForeground(new Color(0, 102, 204));
		btnSOUp.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSOUp.setBounds(198, 580, 100, 30);
		pRegisterPanel.add(btnSOUp);

		btnDel1 = new JButton("취 소");
		btnDel1.addActionListener(this);
		btnDel1.setFocusable(false);
		btnDel1.setBackground(new Color(135, 206, 250));
		btnDel1.setForeground(new Color(0, 102, 204));
		btnDel1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDel1.setBounds(330, 580, 100, 30);
		pRegisterPanel.add(btnDel1);

		btnGoMain = new JButton("메인화면");
		btnGoMain.setFocusable(false);
		btnGoMain.setBackground(new Color(25, 25, 112));
		btnGoMain.setForeground(Color.WHITE);
		btnGoMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnGoMain.setBounds(465, 580, 100, 30);
		pRegisterPanel.add(btnGoMain);

		btnPSSearch = new JButton("조 회");
		btnPSSearch.addActionListener(this);
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
		rdbtnSP.setBounds(460, 70, 110, 20);
		pListPanel.add(rdbtnSP);

		rdbtnSO = new JRadioButton("  발주 이력");
		rdbtnSO.addActionListener(this);
		rdbtnSO.setForeground(Color.BLACK);
		rdbtnSO.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnSO.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		rdbtnSO.setBounds(320, 70, 110, 20);
		pListPanel.add(rdbtnSO);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnSP);
		bg.add(rdbtnSO);

		rdbtnSO.setSelected(true);

		pSOTblPanel = new SOListTblPanel();
		pSOTblPanel.setBounds(22, 125, 590, 510);
		pSOTblPanel.loadDate(sOService.showSupplierOrderList());
		pSOTblPanel.setPopupMenu(createPopupMenuSO());
		pListPanel.add(pSOTblPanel);

	}

	private JPopupMenu createPopupMenuSO() {
		JPopupMenu popMenu = new JPopupMenu();

		JMenuItem updateItem = new JMenuItem("수정");
		updateItem.addActionListener(myPopupMenuListener2);
		popMenu.add(updateItem);

		JMenuItem deleteItem = new JMenuItem("삭제");
		deleteItem.addActionListener(myPopupMenuListener2);
		popMenu.add(deleteItem);

		return popMenu;
	}

	ActionListener myPopupMenuListener2 = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("수정")) {
				SupplierOrder upSupOr = pSOTblPanel.getSelectedItem();
				pSPSOPanel.setSOItem(upSupOr);
			}
			if (e.getActionCommand().equals("삭제")) {
				int choice = JOptionPane.showConfirmDialog(main,"정말 삭제하시겠습니까?", "삭제", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if(choice == 0) {
					SupplierOrder delSupOr = pSOTblPanel.getSelectedItem();
					sOService.removeSupplierOrder(delSupOr);
					pSOTblPanel.removeRow();
					pSOTblPanel.loadDate(sOService.showSupplierOrderList());
				}	
			}
		}
	};

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnSPUp) {
			btnSPUpActionPerformed(e);
		}
		if (e.getSource() == btnSOUp) {
			btnSOUpActionPerformed(e);
		}
		if (e.getSource() == btnDel) {
			btnDelActionPerformed(e);
		}
		if (e.getSource() == btnDel1) {
			btnDel1ActionPerformed(e);
		}
		if (e.getSource() == btnSPAdd) {
			btnSPAddActionPerformed(e);
		}
		if (e.getSource() == btnSOAdd) {
			btnSOAddActionPerformed(e);
		}
		if (e.getSource() == btnPSSearch) {
			btnPSSearchActionPerformed(e);
		}
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
		initializeSO();
		revalidate();
		repaint();
	}

	protected void rdbtnSPActionPerformed(ActionEvent e) {
		removeAll();
		revalidate();
		repaint();
		initializeSP();
		revalidate();
		repaint();
	}

	protected void btnPSSearchActionPerformed(ActionEvent e) {
		String pName = pSPSOPanel.getTfSPSOPName().getText().trim();
		if (pName.equals("")) {
			JOptionPane.showMessageDialog(null, "품목명을 입력해주세요.");
		} else {
			Product product = new Product();
			product.setpName(pName);
			String supName = sWService.showSupplierName(product);
			if(supName == null) {
				JOptionPane.showMessageDialog(null, "제품을 등록해주세요.");
				pSPSOPanel.tfSPSOPName.setText("");
			}else {
				int supCost = sWService.showProductCost(product);
				pSPSOPanel.tfSPSOSName.setText(supName);
				pSPSOPanel.tfSPSOCost.setText(supCost + "");
			}
		}
	}

	protected void btnSPAddActionPerformed(ActionEvent e) {
		try {
			if (pSPSOPanel.tfSPSOPName.getText().equals("") || pSPSOPanel.tfSPSOCost.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "품목명, 공급회사명, 가격, 수량은 필수입력사항입니다.");
				return;
			} else {
				SupplierPurchase newSupPur = pSPSOPanel.getItem();
				sPService.addSupplierPurchase(newSupPur);
				int nowQty = iqService.showQty(newSupPur.getSpPno());
				if(nowQty == 0) {
					int iqNo = iqService.lastIQ().getIqNo()+1;
					System.out.println(iqNo);
					InventoryQuantity newIQ = new InventoryQuantity(iqNo, newSupPur.getSpPno(), newSupPur.getSpQty());
					iqService.addIQ(newIQ);
				}else {
					int totalQty = nowQty + newSupPur.getSpQty();
					InventoryQuantity upIQ = new InventoryQuantity(newSupPur.getSpPno(), totalQty);
					iqService.motifyIQ(upIQ);
				}
				
				pSPTblPanel.addItem(newSupPur);
				pSPTblPanel.loadDate(sPService.showSupplierPurchaseList());
				pSPSOPanel.clearTf();
				pSPSOPanel.setNum1(newSupPur);
				JOptionPane.showMessageDialog(null, "매입이력이 등록되었습니다.");
			}
		} catch (InvalidCheckException e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
		} catch (Exception e1) {
			SQLException e2 = (SQLException) e1;
			if (e2.getErrorCode() == 1062) {
				JOptionPane.showMessageDialog(null, "번호가 중복");
				System.err.println(e2.getMessage());
				return;
			}
			e1.printStackTrace();
		}
	}

	protected void btnSOAddActionPerformed(ActionEvent e) {
		try {
			if (pSPSOPanel.tfSPSOPName.getText().equals("") || pSPSOPanel.tfSPSOCost.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "품목명, 공급회사명, 가격, 수량은 필수입력사항입니다.");
				return;
			} else {
				SupplierOrder newSupOr = pSPSOPanel.getSOItem();
				sOService.addSupplierOrder(newSupOr);
				pSOTblPanel.addItem(newSupOr);
				pSOTblPanel.loadDate(sOService.showSupplierOrderList());
				pSPSOPanel.clearSOTf();
				pSPSOPanel.setNum2(newSupOr);
				JOptionPane.showMessageDialog(null, "발주이력이 등록되었습니다.");
			}
		} catch (InvalidCheckException e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
		} catch (Exception e1) {
			SQLException e2 = (SQLException) e1;
			if (e2.getErrorCode() == 1062) {
				JOptionPane.showMessageDialog(null, "번호가 중복");
				System.err.println(e2.getMessage());
				return;
			}
			e1.printStackTrace();
		}

	}

	protected void btnDelActionPerformed(ActionEvent e) {
		pSPSOPanel.clearTf();
		pSPSOPanel.setNum1(sPService.lastSP());
	}

	protected void btnDel1ActionPerformed(ActionEvent e) {
		pSPSOPanel.clearSOTf();
		pSPSOPanel.setNum2(sOService.lastSO());
	}

	protected void btnSPUpActionPerformed(ActionEvent e) {
		if (pSPSOPanel.tfSPSOPName.getText().equals("") || pSPSOPanel.tfSPSOCost.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "품목명, 공급회사명, 가격, 수량은 필수입력사항입니다.");
			return;
		} else {
			SupplierPurchase upSupPur = pSPSOPanel.getItem();
			sPService.modifySupplierPurchase(upSupPur);
			pSPTblPanel.updateRow(upSupPur, pSPTblPanel.getSelectedRowIdx());
			pSPTblPanel.loadDate(sPService.showSupplierPurchaseList());
			pSPSOPanel.clearTf();
			pSPSOPanel.setNum1(sPService.lastSP());
			JOptionPane.showMessageDialog(null, "매입이력이 수정되었습니다.");
		}
	}

	protected void btnSOUpActionPerformed(ActionEvent e) {
		if (pSPSOPanel.tfSPSOPName.getText().equals("") || pSPSOPanel.tfSPSOCost.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "품목명, 공급회사명, 가격, 수량은 필수입력사항입니다.");
			return;
		}else {
			SupplierOrder upSupOr = pSPSOPanel.getSOItem();
			sOService.modifySupplierOrder(upSupOr);
			pSOTblPanel.updateRow(upSupOr, pSOTblPanel.getSelectedRowIdx());
			pSOTblPanel.loadDate(sOService.showSupplierOrderList());
			pSPSOPanel.clearSOTf();
			pSPSOPanel.setNum2(sOService.lastSO());
			JOptionPane.showMessageDialog(null, "발주이력이 수정되었습니다.");
		}
	}
}
