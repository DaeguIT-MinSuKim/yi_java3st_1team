package yi_java3st_1team.clientmanagement.ui.list;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import yi_java3st_1team.clientmanagement.ui.service.SupplierUIService;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class SCListPanel extends JPanel {

	private JLabel lblImg;
	private JLabel lblSCList;
	private JComboBox cmbCate;
	private JTextField tfSerch;
	private JButton btnSerch;
	private SCListTblPanel pList;
	private SupplierUIService service;
	public SCListPanel() {
		service = new SupplierUIService();
		initialize();
	}
	private void initialize() {
		setBounds(new Rectangle(0, 0, 635, 700));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pSCListPanel = new JPanel();
		pSCListPanel.setBounds(new Rectangle(0, 0, 635, 700));
		add(pSCListPanel, BorderLayout.CENTER);
		pSCListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pSCListPanel.setLayout(null);
		
		lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\etc\\list.png"));
		lblImg.setBounds(22, 60, 40, 40);
		pSCListPanel.add(lblImg);
		
		lblSCList = new JLabel("공급회사 LIST");
		lblSCList.setForeground(Color.BLACK);
		lblSCList.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		lblSCList.setHorizontalAlignment(SwingConstants.CENTER);
		lblSCList.setBounds(72, 60, 170, 40);
		pSCListPanel.add(lblSCList);
		
		cmbCate = new JComboBox();
		cmbCate.setBounds(252, 65, 120, 30);
		pSCListPanel.add(cmbCate);
		
		tfSerch = new JTextField();
		tfSerch.setColumns(10);
		tfSerch.setBounds(392, 65, 130, 30);
		pSCListPanel.add(tfSerch);
		
		btnSerch = new JButton("검색");
		btnSerch.setFocusable(false);
		btnSerch.setBackground(new Color(135, 206, 250));
		btnSerch.setForeground(Color.WHITE);
		btnSerch.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSerch.setBounds(542, 65, 70, 30);
		pSCListPanel.add(btnSerch);
		
		pList = new SCListTblPanel();
		pList.loadDate(service.showSupplierList());
		pList.setBounds(22, 123, 590, 500);
		pSCListPanel.add(pList);
	}

}
