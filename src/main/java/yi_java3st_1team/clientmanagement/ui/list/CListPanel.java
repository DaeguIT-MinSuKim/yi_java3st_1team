package yi_java3st_1team.clientmanagement.ui.list;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.Color;

@SuppressWarnings("serial")
public class CListPanel extends JPanel {

	private JLabel lblImg;
	private JLabel lblCList;
	private JComboBox cmbCate;
	private JTextField tfSerch;
	private JButton btnSerch;
	private JPanel pList;
	public CListPanel() {

		initialize();
	}
	private void initialize() {
		setBounds(new Rectangle(0, 0, 635, 700));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pCListPanel = new JPanel();
		pCListPanel.setBounds(new Rectangle(0, 0, 635, 700));
		add(pCListPanel, BorderLayout.CENTER);
		pCListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pCListPanel.setLayout(null);
		
		lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\etc\\list.png"));
		lblImg.setBounds(22, 60, 40, 40);
		pCListPanel.add(lblImg);
		
		lblCList = new JLabel("고 객 사 LIST");
		lblCList.setForeground(Color.BLACK);
		lblCList.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		lblCList.setHorizontalAlignment(SwingConstants.CENTER);
		lblCList.setBounds(72, 60, 170, 40);
		pCListPanel.add(lblCList);
		
		cmbCate = new JComboBox();
		cmbCate.setBounds(252, 65, 120, 30);
		pCListPanel.add(cmbCate);
		
		tfSerch = new JTextField();
		tfSerch.setColumns(10);
		tfSerch.setBounds(392, 65, 130, 30);
		pCListPanel.add(tfSerch);
		
		btnSerch = new JButton("");
		btnSerch.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\test\\검색.png"));
		btnSerch.setBounds(542, 65, 70, 30);
		pCListPanel.add(btnSerch);
		
		pList = new JPanel();
		pList.setBounds(22, 123, 590, 488);
		pCListPanel.add(pList);
	}

}
