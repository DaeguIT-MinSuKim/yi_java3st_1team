package yi_java3st_1team.productmanagement.ui.content;

import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import yi_java3st_1team.productmanagement.ui.panel.SWRegisterPanel;
import yi_java3st_1team.productmanagement.ui.service.ProductUIService;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.productmanagement.dto.Product;
import yi_java3st_1team.productmanagement.ui.list.SWListTblPanel;

@SuppressWarnings("serial")
public class SoftwareUIPanel extends JPanel {
	
	private JTextField tfSerch;
	private ProductUIService service;
	private SWRegisterPanel pSWRegisterPanel;
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

	public SoftwareUIPanel() {
		service = new ProductUIService();;
		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(1270, 700));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pRegisterPanel = new JPanel();
		pRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pRegisterPanel);
		pRegisterPanel.setLayout(null);
		
		pSWRegisterPanel = new SWRegisterPanel();
		pSWRegisterPanel.setBounds(55, 115, 400, 440);
		pSWRegisterPanel.setNum(service.lastProduct());
		pSWRegisterPanel.setService(service);
		pRegisterPanel.add(pSWRegisterPanel);
		
		lblSW = new JLabel("소프트웨어 제품등록");
		lblSW.setForeground(Color.BLACK);
		lblSW.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblSW.setHorizontalAlignment(SwingConstants.CENTER);
		lblSW.setBounds(0, 52, 635, 54);
		pRegisterPanel.add(lblSW);
		
		btnAdd = new JButton("등 록");
		btnAdd.setFocusable(false);
		btnAdd.setBackground(new Color(135, 206, 250));
		btnAdd.setForeground(new Color(0, 102, 204));
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnAdd.setBounds(66, 580, 100, 30);
		pRegisterPanel.add(btnAdd);
		
		btnUpdate = new JButton("수 정");
		btnUpdate.setFocusable(false);
		btnUpdate.setBackground(new Color(135, 206, 250));
		btnUpdate.setForeground(new Color(0, 102, 204));
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnUpdate.setBounds(198, 580, 100, 30);
		pRegisterPanel.add(btnUpdate);
		
		btnDel = new JButton("삭 제");
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
		btnDplCheck.setFocusable(false);
		btnDplCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDplCheck.setForeground(Color.WHITE);
		btnDplCheck.setBackground(new Color(240, 128, 128));
		btnDplCheck.setBounds(465, 220, 100, 30);
		pRegisterPanel.add(btnDplCheck);
		
		btnPSCheck = new JButton("조 회");
		btnPSCheck.setFocusable(false);
		btnPSCheck.setBackground(SystemColor.activeCaptionBorder);
		btnPSCheck.setForeground(Color.WHITE);
		btnPSCheck.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnPSCheck.setBounds(465, 370, 100, 30);
		pRegisterPanel.add(btnPSCheck);
		
		btnImgSearch = new JButton("검 색");
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
		
		JComboBox cmbCate = new JComboBox();
		cmbCate.setBounds(252, 65, 120, 30);
		pListPanel.add(cmbCate);
		
		tfSerch = new JTextField();
		tfSerch.setColumns(10);
		tfSerch.setBounds(392, 65, 130, 30);
		pListPanel.add(tfSerch);
		
		btnSerch = new JButton("검색");
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
				System.out.println(upProduct);
				pSWRegisterPanel.setItem(upProduct);
			}
			if(e.getActionCommand().equals("삭제")) {
				Product delProduct = pSWTblPanel.getSelectedItem();
				service.removeProduct(delProduct);
				pSWTblPanel.removeRow();
			}
			
		}
	};
}
