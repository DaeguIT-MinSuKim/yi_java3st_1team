package yi_java3st_1team.productmanagement.ui.list;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;

import yi_java3st_1team.productmanagement.ui.service.CDUIService;

import java.awt.Color;

@SuppressWarnings("serial")
public class CDListPanel extends JPanel {

	private JLabel lblImg;
	private JLabel lblCDList;
	private JPanel pList;
	private CDListTblPanel pCDList;
	
	private CDUIService cdService;
	public CDListPanel() {
		cdService = new CDUIService();
		initialize();
	}
	private void initialize() {
		setBounds(new Rectangle(0, 0, 635, 700));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pCDListPanel = new JPanel();
		pCDListPanel.setBounds(new Rectangle(0, 0, 635, 700));
		add(pCDListPanel, BorderLayout.CENTER);
		pCDListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pCDListPanel.setLayout(null);
		
		lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\etc\\list.png"));
		lblImg.setBounds(22, 60, 40, 40);
		pCDListPanel.add(lblImg);
		
		lblCDList = new JLabel("출고 LIST");
		lblCDList.setForeground(Color.BLACK);
		lblCDList.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		lblCDList.setHorizontalAlignment(SwingConstants.CENTER);
		lblCDList.setBounds(72, 60, 120, 40);
		pCDListPanel.add(lblCDList);
		
		pList = new JPanel();
		pList.setBounds(22, 123, 590, 488);
		pCDListPanel.add(pList);
		
		pCDList = new CDListTblPanel();
		pCDList.loadDate(cdService.shpwClientDeliveryList());
		pList.setLayout(new BorderLayout(0, 0));
		pCDList.setPopupMenu(createPopupMenu());
		pList.add(pCDList);
	}
	private JPopupMenu createPopupMenu() {
		JPopupMenu popMenu = new JPopupMenu();
		
		JMenuItem updateItem = new JMenuItem("수정");
		updateItem.addActionListener(myPopupMenuListener);
		popMenu.add(updateItem);
		
		JMenuItem deleteItem = new JMenuItem("취소");
		deleteItem.addActionListener(myPopupMenuListener);
		popMenu.add(deleteItem);
		return popMenu;
	}
	
	
	//팝업메뉴 기능
	ActionListener myPopupMenuListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("수정")) {

			}
			
			
			if(e.getActionCommand().equals("주문취소")) {
			}			
			
			
		}
	};
}
