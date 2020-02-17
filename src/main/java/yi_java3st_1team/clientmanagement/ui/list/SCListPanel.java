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

@SuppressWarnings("serial")
public class SCListPanel extends JPanel {

	private JLabel lblImg;
	private JLabel lblSCList;
	private JComboBox cmbCate;
	private JTextField tfSerch;
	private JButton btnSerch;
	private JPanel pList;
	public SCListPanel() {

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
		lblImg.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\list.png"));
		lblImg.setBounds(22, 60, 40, 40);
		pSCListPanel.add(lblImg);
		
		lblSCList = new JLabel("공급회사 LIST");
		lblSCList.setFont(new Font("굴림", Font.BOLD, 20));
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
		
		btnSerch = new JButton("검 색");
		btnSerch.setBounds(542, 65, 70, 30);
		pSCListPanel.add(btnSerch);
		
		pList = new JPanel();
		pList.setBounds(22, 123, 590, 488);
		pSCListPanel.add(pList);
	}

}
