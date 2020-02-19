package yi_java3st_1team.productmanagement.ui.list;

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
public class SWListPanel extends JPanel {

	private JLabel lblImg;
	private JLabel lblSWList;
	private JComboBox cmbCate;
	private JTextField tfSerch;
	private JButton btnSerch;
	private JPanel pList;
	public SWListPanel() {

		initialize();
	}
	private void initialize() {
		setBounds(new Rectangle(0, 0, 635, 700));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pSWListPanel = new JPanel();
		pSWListPanel.setBounds(new Rectangle(0, 0, 635, 700));
		add(pSWListPanel, BorderLayout.CENTER);
		pSWListPanel.setBackground(SystemColor.inactiveCaptionBorder);
		pSWListPanel.setLayout(null);
		
		lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\etc\\list.png"));
		lblImg.setBounds(22, 60, 40, 40);
		pSWListPanel.add(lblImg);
		
		lblSWList = new JLabel("소프트웨어 LIST");
		lblSWList.setForeground(Color.BLACK);
		lblSWList.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		lblSWList.setHorizontalAlignment(SwingConstants.CENTER);
		lblSWList.setBounds(72, 60, 170, 40);
		pSWListPanel.add(lblSWList);
		
		cmbCate = new JComboBox();
		cmbCate.setBounds(252, 65, 120, 30);
		pSWListPanel.add(cmbCate);
		
		tfSerch = new JTextField();
		tfSerch.setColumns(10);
		tfSerch.setBounds(392, 65, 130, 30);
		pSWListPanel.add(tfSerch);
		
		btnSerch = new JButton("");
		btnSerch.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\btns\\검색.png"));
		btnSerch.setBounds(542, 65, 70, 30);
		pSWListPanel.add(btnSerch);
		
		pList = new JPanel();
		pList.setBounds(22, 123, 590, 488);
		pSWListPanel.add(pList);
	}

}
