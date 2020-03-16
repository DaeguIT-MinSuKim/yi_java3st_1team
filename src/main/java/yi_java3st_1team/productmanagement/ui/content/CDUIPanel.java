package yi_java3st_1team.productmanagement.ui.content;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;

import yi_java3st_1team.productmanagement.dto.ClientDelivery;
import yi_java3st_1team.productmanagement.ui.list.CDListTblPanel;
import yi_java3st_1team.productmanagement.ui.panel.CDRegisterPanel;
import yi_java3st_1team.productmanagement.ui.service.CDUIService;
import yi_java3st_1team.productmanagement.ui.service.SWUIService;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class CDUIPanel extends JPanel implements ActionListener {

	private JLabel lblCD;
	private CDRegisterPanel pCDregiPanel;

	private CDUIService cdService;
	private JButton btnUpdate;
	private JButton btnDel;
	public JButton btnGoMain;
	private JPanel pListPanel;
	private CDListTblPanel pCDTblPanel;
	
	public CDUIPanel() {
		cdService = new CDUIService();
		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(1270, 700));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pRegisterPanel = new JPanel();
		pRegisterPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pRegisterPanel);
		pRegisterPanel.setLayout(null);
		
		pCDregiPanel = new CDRegisterPanel();
		pCDregiPanel.setBackground(Color.WHITE);
		pCDregiPanel.setBounds(54, 116, 525, 440);
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
		
		btnUpdate = new JButton("수 정");
		btnUpdate.addActionListener(this);
		btnUpdate.setBackground(new Color(135, 206, 250));
		btnUpdate.setForeground(new Color(0, 102, 204));
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnUpdate.setFocusable(false);
		btnUpdate.setBounds(66, 580, 100, 30);
		pRegisterPanel.add(btnUpdate);
		
		btnDel = new JButton("취 소");
		btnDel.addActionListener(this);
		btnDel.setBackground(new Color(135, 206, 250));
		btnDel.setForeground(new Color(0, 102, 204));
		btnDel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnDel.setFocusable(false);
		btnDel.setBounds(270, 580, 100, 30);
		pRegisterPanel.add(btnDel);
		
		btnGoMain = new JButton("메인화면");
		btnGoMain.setBackground(new Color(25, 25, 112));
		btnGoMain.setForeground(Color.WHITE);
		btnGoMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnGoMain.setFocusable(false);
		btnGoMain.setBounds(465, 580, 100, 30);
		pRegisterPanel.add(btnGoMain);
		
		pListPanel = new JPanel();
		pListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		add(pListPanel);
		pListPanel.setLayout(null);
		
		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\etc\\list.png"));
		lblImg.setBounds(22, 60, 40, 40);
		pListPanel.add(lblImg);
		
		JLabel lblCDList = new JLabel("출고 LIST");
		lblCDList.setForeground(Color.BLACK);
		lblCDList.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		lblCDList.setHorizontalAlignment(SwingConstants.CENTER);
		lblCDList.setBounds(72, 60, 120, 40);
		pListPanel.add(lblCDList);
		
		pCDTblPanel = new CDListTblPanel();
		pCDTblPanel.setBounds(22, 125, 590, 510);
		pCDTblPanel.loadDate(cdService.showClientDeliveryList());
		pListPanel.add(pCDTblPanel);
		pCDTblPanel.setPopupMenu(createPopupMenu());
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
	
	//팝업메뉴 기능
	ActionListener myPopupMenuListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("수정")) {
				ClientDelivery upCD = pCDTblPanel.getSelectedItem();
				pCDregiPanel.setItem(upCD);
			}
			
			
			if(e.getActionCommand().equals("삭제")) {
				ClientDelivery delCD = pCDTblPanel.getSelectedItem();
				cdService.removeClientDelivery(delCD);
				pCDTblPanel.removeRow();
				pCDTblPanel.loadDate(cdService.showClientDeliveryList());
			}			
			
			
		}
	};
	
	//수정, 취소
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnUpdate) {
			actionPerformedBtnUpdate(e);
		}
		
		if (e.getSource() == btnDel) {
			actionPerformedBtnDel(e);
		}
	}
	
	//수정
	protected void actionPerformedBtnUpdate(ActionEvent e) {
		if(pCDregiPanel.tfSCName.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "수정할 품목을 오른쪽 리스트에서 선택해주세요.");
			return;
		} else {
			ClientDelivery upCD = new ClientDelivery();
			cdService.modifyClientDelivery(upCD);
			pCDTblPanel.updateRow(upCD, pCDTblPanel.getSelectedRowIdx());
			pCDTblPanel.loadDate(cdService.showClientDeliveryList());
			pCDregiPanel.clearTf();
			pCDregiPanel.setCDNum(cdService.showlastNum());
		}

	}
	
	//취소
	protected void actionPerformedBtnDel(ActionEvent e) {
		pCDregiPanel.clearTf();
		pCDregiPanel.setCDNum(cdService.showlastNum());
	}
}
