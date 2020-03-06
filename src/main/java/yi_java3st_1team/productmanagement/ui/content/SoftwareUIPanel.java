package yi_java3st_1team.productmanagement.ui.content;

import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import yi_java3st_1team.productmanagement.ui.panel.SWRegisterPanel;
import yi_java3st_1team.productmanagement.ui.service.ProductUIService;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.clientmanagement.dto.Supplier;
import yi_java3st_1team.clientmanagement.ui.service.SupplierUIService;
import yi_java3st_1team.exception.InvalidCheckException;
import yi_java3st_1team.productmanagement.dto.Category;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.productmanagement.ui.list.SWListTblPanel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

@SuppressWarnings("serial")
public class SoftwareUIPanel extends JPanel implements ActionListener, ItemListener {
	
	private JTextField tfSerch;
	private ProductUIService service;
	private SupplierUIService serviceSupplier;
	private SWRegisterPanel pSWRPanel;
	private JLabel lblSW;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnDel;
	public JButton btnGoMain;
	private JButton btnDplCheck;
	private JButton btnPSCheck;
	private JButton btnImgSearch;
	private JLabel lblNewLabel;
	private SWListTblPanel pSWTblPanel;
	private JLabel lblImg;
	private JLabel lblSWList;
	private JButton btnSerch;
	private JComboBox cmbCate;
	private String picPath;
	private String selectItem;

	public SoftwareUIPanel() {
		service = new ProductUIService();
		serviceSupplier = new SupplierUIService();
		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(1270, 700));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pRegisterPanel = new JPanel();
		pRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pRegisterPanel);
		pRegisterPanel.setLayout(null);
		
		pSWRPanel = new SWRegisterPanel();
		pSWRPanel.setBounds(55, 115, 400, 440);
		pSWRPanel.setNum(service.lastProduct());
		pSWRPanel.setService(service);
		pRegisterPanel.add(pSWRPanel);
		
		lblSW = new JLabel("소프트웨어 제품등록");
		lblSW.setForeground(Color.BLACK);
		lblSW.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblSW.setHorizontalAlignment(SwingConstants.CENTER);
		lblSW.setBounds(0, 52, 635, 54);
		pRegisterPanel.add(lblSW);
		
		btnAdd = new JButton("등 록");
		btnAdd.addActionListener(this);
		btnAdd.setFocusable(false);
		btnAdd.setBackground(new Color(135, 206, 250));
		btnAdd.setForeground(new Color(0, 102, 204));
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnAdd.setBounds(66, 580, 100, 30);
		pRegisterPanel.add(btnAdd);
		
		btnUpdate = new JButton("수 정");
		btnUpdate.addActionListener(this);
		btnUpdate.setFocusable(false);
		btnUpdate.setBackground(new Color(135, 206, 250));
		btnUpdate.setForeground(new Color(0, 102, 204));
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnUpdate.setBounds(198, 580, 100, 30);
		pRegisterPanel.add(btnUpdate);
		
		btnDel = new JButton("취 소");
		btnDel.addActionListener(this);
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
		
		btnDplCheck = new JButton("중복확인");
		btnDplCheck.addActionListener(this);
		btnDplCheck.setFocusable(false);
		btnDplCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDplCheck.setForeground(Color.WHITE);
		btnDplCheck.setBackground(new Color(240, 128, 128));
		btnDplCheck.setBounds(465, 220, 100, 30);
		pRegisterPanel.add(btnDplCheck);
		
		btnPSCheck = new JButton("조 회");
		btnPSCheck.addActionListener(this);
		btnPSCheck.setFocusable(false);
		btnPSCheck.setBackground(SystemColor.activeCaptionBorder);
		btnPSCheck.setForeground(Color.WHITE);
		btnPSCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnPSCheck.setBounds(465, 370, 100, 30);
		pRegisterPanel.add(btnPSCheck);
		
		btnImgSearch = new JButton("검 색");
		btnImgSearch.addActionListener(this);
		btnImgSearch.setFocusable(false);
		btnImgSearch.setBackground(SystemColor.activeCaptionBorder);
		btnImgSearch.setForeground(Color.WHITE);
		btnImgSearch.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnImgSearch.setBounds(465, 520, 100, 30);
		pRegisterPanel.add(btnImgSearch);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(455, 115, 124, 440);
		pRegisterPanel.add(lblNewLabel);
		
		JPanel pListPanel = new JPanel();
		pListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pListPanel);
		pListPanel.setLayout(null);
		
		pSWTblPanel = new SWListTblPanel();
		pSWTblPanel.setBounds(22, 125, 590, 510);
		pSWTblPanel.loadDate(service.showProductList());
		pSWTblPanel.setPopupMenu(createPopupMenu());
		pListPanel.add(pSWTblPanel);
		
		lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\etc\\list.png"));
		lblImg.setBounds(22, 60, 40, 40);
		pListPanel.add(lblImg);
		
		lblSWList = new JLabel("소프트웨어 LIST");
		lblSWList.setForeground(Color.BLACK);
		lblSWList.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		lblSWList.setHorizontalAlignment(SwingConstants.CENTER);
		lblSWList.setBounds(72, 60, 170, 40);
		pListPanel.add(lblSWList);
		
		cmbCate = new JComboBox();
		cmbCate.addItemListener(this);
		cmbCate.setModel(new DefaultComboBoxModel(new String[] {"선택", "전체", "품목명", "분류명", "공급회사명"}));
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
				Product upProduct = pSWTblPanel.getSelectedItem();
				pSWRPanel.setItem(upProduct);
			}
			if(e.getActionCommand().equals("삭제")) {
				Product delProduct = pSWTblPanel.getSelectedItem();
				service.removeProduct(delProduct);
				pSWTblPanel.removeRow();
			}
			
		}
	};
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSerch) {
			btnSerchActionPerformed(e);
		}
		if (e.getSource() == btnUpdate) {
			btnUpdateActionPerformed(e);
		}
		if (e.getSource() == btnAdd) {
			btnAddActionPerformed(e);
		}
		if (e.getSource() == btnImgSearch) {
			btnImgSearchActionPerformed(e);
		}
		if (e.getSource() == btnPSCheck) {
			btnPSCheckActionPerformed(e);
		}
		if (e.getSource() == btnDel) {
			btnDelActionPerformed(e);
		}
		if (e.getSource() == btnDplCheck) {
			btnDplCheckActionPerformed(e);
		}
	}
	protected void btnDplCheckActionPerformed(ActionEvent e) {
		if(pSWRPanel.tfPName.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "품목명을 입력해주세요.");
		}else {
			Product overlapProduct = pSWRPanel.getItem1();
			Product product = service.overlapProduct(overlapProduct);
			if(product == null) {
				JOptionPane.showMessageDialog(null, "등록 가능한 상품명입니다.");
			}else {
				JOptionPane.showMessageDialog(null, "이미 존재하는 상품명입니다.");
			}
		}
	}
	protected void btnDelActionPerformed(ActionEvent e) {
		pSWRPanel.clearTf();
		pSWRPanel.setNum(service.lastProduct());
		
	}
	protected void btnPSCheckActionPerformed(ActionEvent e) {
		if(pSWRPanel.tfPSName.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "공급회사명을 입력해주세요.");
		}else {
			String supplierName = pSWRPanel.getTfPSName().getText().trim();
			Supplier supplier = new Supplier(supplierName, null, null);
			Supplier checkSupp = serviceSupplier.overlapSupplier(supplier);
			if(checkSupp == null) {
				JOptionPane.showMessageDialog(null, "공급회사 등록이 필요합니다.");
			}else {
				JOptionPane.showMessageDialog(null, "등록된 공급회사입니다.");
			}
		}
	}
	protected void btnImgSearchActionPerformed(ActionEvent e) {
		JFileChooser chooser = new JFileChooser(System.getProperty("user.dir")+"\\document\\sample_data\\software_images");
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG or PNG or GIF", "jpg","png","gif");
		chooser.setFileFilter(filter);
		
		int res = chooser.showOpenDialog(null);
		if(res != JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.","경고",JOptionPane.WARNING_MESSAGE);
			return;
		}
		picPath = chooser.getSelectedFile().getPath();
		pSWRPanel.tfImgSearch.setText(picPath);
	}
	protected void btnAddActionPerformed(ActionEvent e) {
		try {
			if(pSWRPanel.tfPName.getText().equals("") 
					|| pSWRPanel.tfPCost.getText().equals("") 
					|| pSWRPanel.tfPPrice.getText().equals("")
					|| pSWRPanel.tfPQty.getText().equals("")
					|| pSWRPanel.tfPDate.getDate()==null) {
				JOptionPane.showMessageDialog(null, "품목명, 공급가격, 판매가격, 최초재고수량, 최초등록일자는 필수입력사항입니다.");
				return;
			}else {
				Product newProduct = pSWRPanel.getItem();
				service.addProduct(newProduct);
				pSWTblPanel.addItem(newProduct);
				pSWTblPanel.loadDate(service.showProductList());
				pSWRPanel.clearTf();
				pSWRPanel.setNum(newProduct);
			}
		} catch (InvalidCheckException e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
		} catch (Exception e1) {
			SQLException e2 = (SQLException) e1;
			if(e2.getErrorCode() == 1062) {
				JOptionPane.showMessageDialog(null, "품목번호가 중복");
				System.err.println(e2.getMessage());
				return;
			}
			e1.printStackTrace();
		}
	}
	protected void btnUpdateActionPerformed(ActionEvent e) {
		if(pSWRPanel.tfPName.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "수정할 품목을 오른쪽 리스트에서 선택해주세요.");
			return;
		}else {
			Product upProduct = pSWRPanel.getItem();
			service.modifyProduct(upProduct);
			pSWTblPanel.updateRow(upProduct, pSWTblPanel.getSelectedRowIdx());
			pSWTblPanel.loadDate(service.showProductList());
			pSWRPanel.clearTf();
			pSWRPanel.setNum(service.lastProduct());
		}
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cmbCate) {
			cmbCateItemStateChanged(e);
		}
	}
	public String cmbCateItemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			selectItem = (String) cmbCate.getSelectedItem();
		}
		return null;
	}
	public void btnSerchActionPerformed(ActionEvent e) {
		if(selectItem == null) {
			return;
		}
		if(selectItem.equals("전체")) {
			pSWTblPanel.loadDate(service.showProductList());
		}
		if(selectItem.equals("품목명")) {
			String pName = tfSerch.getText().trim();
			Product product = new Product(null, pName, null);
			pSWTblPanel.loadDate(service.showProductListByName(product));
			tfSerch.setText("");
		}
		if(selectItem.equals("분류명")) {
			Category pCate = new Category(tfSerch.getText().trim());
			Product product = new Product(pCate, null, null);
			pSWTblPanel.loadDate(service.showProductListByCate(product));
			tfSerch.setText("");
		}
		if(selectItem.equals("공급회사명")) {
			Supplier pSno = new Supplier();
			pSno.setsName(tfSerch.getText().trim());
			Product product = new Product(null, null, pSno);
			pSWTblPanel.loadDate(service.showProductListBySupp(product));
			tfSerch.setText("");
		}
	}
}
