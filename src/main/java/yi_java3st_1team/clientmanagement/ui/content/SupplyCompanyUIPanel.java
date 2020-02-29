package yi_java3st_1team.clientmanagement.ui.content;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.dto.Supplier;
import yi_java3st_1team.clientmanagement.ui.list.SCListTblPanel;
import yi_java3st_1team.clientmanagement.ui.panel.SCRegisterPanel;
import yi_java3st_1team.clientmanagement.ui.service.SupplierUIService;

@SuppressWarnings("serial")
public class SupplyCompanyUIPanel extends JPanel {

	private SupplierUIService service;
	private JLabel lblSC;
	private JButton btnAdd;
	private JButton btnUpdate;
	private JButton btnDel;
	private JButton btnGoMain;
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
		pRegisterPanel.add(pSCRPanel);

		lblSC = new JLabel("공급회사 등록");
		lblSC.setForeground(Color.BLACK);
		lblSC.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 40));
		lblSC.setHorizontalAlignment(SwingConstants.CENTER);
		lblSC.setBounds(0, 52, 635, 54);
		pRegisterPanel.add(lblSC);

		btnAdd = new JButton("등 록");
		btnAdd.setFocusable(false);
		btnAdd.setForeground(new Color(0, 102, 204));
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnAdd.setBackground(new Color(135, 206, 250));
		btnAdd.setBounds(66, 580, 100, 30);
		pRegisterPanel.add(btnAdd);

		btnUpdate = new JButton("수 정");
		btnUpdate.setFocusable(false);
		btnUpdate.setForeground(new Color(0, 102, 204));
		btnUpdate.setBackground(new Color(135, 206, 250));
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnUpdate.setBounds(198, 580, 100, 30);
		pRegisterPanel.add(btnUpdate);

		btnDel = new JButton("삭 제");
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
		btnDplCheck.setFocusable(false);
		btnDplCheck.setBackground(new Color(240, 128, 128));
		btnDplCheck.setForeground(Color.WHITE);
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
		lblNewLabel.setBounds(448, 115, 134, 430);
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
			if(e.getActionCommand().equals("수정")) {
				Supplier upsupp = pSCTblPanel.getSelectedItem();
				pSCRPanel.setItem(upsupp);
				btnAdd.setText("수정");
			}
			if(e.getActionCommand().equals("삭제")) {
				Supplier delsupp = pSCTblPanel.getSelectedItem();
				service.removeSupplier(delsupp);
				pSCTblPanel.removeRow();
			}
		}
	};

}
