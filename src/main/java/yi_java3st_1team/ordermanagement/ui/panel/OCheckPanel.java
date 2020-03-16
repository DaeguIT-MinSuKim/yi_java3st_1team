package yi_java3st_1team.ordermanagement.ui.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;

import yi_java3st_1team.ordermanagement.dto.Order;
import yi_java3st_1team.ordermanagement.ui.list.OCheckTblPanel;
import yi_java3st_1team.ordermanagement.ui.service.OrderUIService;
import yi_java3st_1team.productmanagement.dto.ClientDelivery;
import yi_java3st_1team.productmanagement.ui.service.CDUIService;

@SuppressWarnings("serial")
public class OCheckPanel extends JPanel implements ActionListener {

	private JLabel lblO;
	private JPanel pList;
	public JButton btnGoMain;
	private OCheckTblPanel pOCheckList;
	private OrderUIService odService;
	private JButton btnConfirm;
	private CDUIService cdService;
	
	
	public OCheckPanel() {
		cdService = new CDUIService();
		odService = new OrderUIService();
		initialize();
	}
	private void initialize() {
		setBounds(new Rectangle(0, 0, 1270, 700));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setBounds(new Rectangle(0, 0, 1270, 700));
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setLayout(null);
		
		lblO = new JLabel("주문 확인 & 처리");
		lblO.setForeground(Color.BLACK);
		lblO.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 40));
		lblO.setHorizontalAlignment(SwingConstants.LEFT);
		lblO.setBounds(122, 42, 390, 60);
		panel.add(lblO);
		
		pList = new JPanel();
		pList.setBounds(81, 122, 1100, 524);
		panel.add(pList);
		pList.setLayout(new BorderLayout(0, 0));
		
		pOCheckList = new OCheckTblPanel(); //테이블
		pOCheckList.loadDateCheck(odService.showOrderList());
		pOCheckList.setPopupMenu(createPopupMenu());
		pList.add(pOCheckList,BorderLayout.CENTER);
		
		
		btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(this);
		btnConfirm.setBackground(new Color(135, 206, 250));
		btnConfirm.setForeground(Color.WHITE);
		btnConfirm.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnConfirm.setBounds(947, 65, 111, 33);
		panel.add(btnConfirm);
		
		btnGoMain = new JButton("메인화면");
		btnGoMain.setBackground(new Color(25, 25, 112));
		btnGoMain.setForeground(Color.WHITE);
		btnGoMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnGoMain.setBounds(1070, 65, 111, 33);
		panel.add(btnGoMain);
		
	}
	private JPopupMenu createPopupMenu() {
		JPopupMenu popMenu = new JPopupMenu();
		
		JMenuItem updateItem = new JMenuItem("주문수정");
		updateItem.addActionListener(myPopupMenuListener);
		popMenu.add(updateItem);
		
		JMenuItem deleteItem = new JMenuItem("주문취소");
		deleteItem.addActionListener(myPopupMenuListener);
		popMenu.add(deleteItem);
		return popMenu;
	}
	
	//팝업메뉴 기능
	ActionListener myPopupMenuListener = new ActionListener() {
		
		private JButton btnModify;
		private OrderModify om;
		private JFrame modify;

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("주문수정")) {
				modify = new JFrame();
				modify.setTitle("주문 수정");
				modify.setSize(500,500);
				om = new OrderModify();
				Order order = pOCheckList.getSelectedItem();
				om.setItem(order);
				modify.setLocationRelativeTo(null);
				modify.setResizable(false);
				modify.getContentPane().add(om);
				
				btnModify = new JButton("수 정");
				btnModify.addActionListener(this);
				btnModify.setForeground(Color.WHITE);
				btnModify.setBackground(new Color(135, 206, 235));
				btnModify.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
				om.panel.add(btnModify);
				
				modify.setVisible(true);
			}
			if (e.getSource() == btnModify) {
				btnModifyActionPerformed(e);
			}
						
			if(e.getActionCommand().equals("주문취소")) {
				Order delOrder = pOCheckList.getSelectedItem();
				ClientDelivery cd = new ClientDelivery(delOrder, new Date());
            	cdService.removeClientDeliveryByOno(cd);
				odService.removeOrder(delOrder);
				pOCheckList.loadDateCheck(odService.showOrderList());
				
			}			
		}
		protected void btnModifyActionPerformed(ActionEvent e) {
			odService.modifyOrder(om.getItem());
			pOCheckList.loadDateCheck(odService.showOrderList());
			modify.dispose();
		}
	};


	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConfirm) {
			btnConfirmActionPerformed(e);
		}
	}
	protected void btnConfirmActionPerformed(ActionEvent e) {
		for(int i=0; i<pOCheckList.table.getRowCount(); i++) {
            Boolean checkCdt = (Boolean) pOCheckList.table.getValueAt(i, 6);
            if(checkCdt == true) {
            	Order order = odService.showOrderByNo(i+1);
            	if(cdService.showClientDeliveryByOno(order) == null) {
            		ClientDelivery cd = new ClientDelivery(order, new Date());
                	cdService.addClientDelivery(cd);
                	odService.modifyTrue(order);
            	}
            }else {
            	Order order = odService.showOrderByNo(i+1);
            	if(cdService.showClientDeliveryByOno(order) != null) {
            		ClientDelivery cd = new ClientDelivery(order, new Date());
                	cdService.removeClientDeliveryByOno(cd);
                	odService.modifyFalse(order);
            	}
            }
		}
		pOCheckList.loadDateCheck(odService.showOrderList());
	}
}
