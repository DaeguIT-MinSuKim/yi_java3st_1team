package yi_java3st_1team.ordermanagement.ui.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;

import yi_java3st_1team.ordermanagement.ui.list.OCheckTblPanel;
import yi_java3st_1team.ordermanagement.ui.service.OrderUIService;

@SuppressWarnings("serial")
public class OCheckPanel extends JPanel {

	private JLabel lblO;
	private JPanel pList;
	public JButton mainBtn;
	private OCheckTblPanel pOCheckList;
	
	private OrderUIService odService;
	
	public OCheckPanel() {
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
		
		pOCheckList = new OCheckTblPanel();
		pOCheckList.loadDate(odService.showOrderList());
		pOCheckList.setPopupMenu(createPopupMenu());
		pList.add(pOCheckList,BorderLayout.CENTER);
		
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnNewButton.setBounds(947, 65, 111, 33);
		panel.add(btnNewButton);
		
		mainBtn = new JButton("메인화면");
		mainBtn.setBackground(new Color(25, 25, 112));
		mainBtn.setForeground(Color.WHITE);
		mainBtn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		mainBtn.setBounds(1070, 65, 111, 33);
		panel.add(mainBtn);
		
	}
	private JPopupMenu createPopupMenu() {
		JPopupMenu popMenu = new JPopupMenu();
		
		JMenuItem updateItem = new JMenuItem("수정");
		updateItem.addActionListener(myPopupMenuListener);
		popMenu.add(updateItem);
		
		JMenuItem deleteItem = new JMenuItem("주문취소");
		deleteItem.addActionListener(myPopupMenuListener);
		popMenu.add(deleteItem);
		return popMenu;
	}
	
	//팝업메뉴 기능
	ActionListener myPopupMenuListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("수정")) {
				JFrame modify = new JFrame();
				modify.setTitle("주문 수정");
				modify.setSize(500,500);
				OrderModify om = new OrderModify();
				
				modify.setLocationRelativeTo(null);
				modify.setResizable(false);
				modify.getContentPane().add(om);
				modify.setVisible(true);
			}
			
			
			if(e.getActionCommand().equals("주문취소")) {
			}			
			
			
		}
	};
}
