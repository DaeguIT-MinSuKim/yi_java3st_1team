package yi_java3st_1team.productmanagement.ui.list;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Color;

@SuppressWarnings("serial")
public class SPSOListPanel extends JPanel {

	private JLabel lblImg;
	private JLabel lblSWList;
	private JPanel pList;
	public SPSOListPanel() {

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
		
		lblSWList = new JLabel("매입&발주 LIST");
		lblSWList.setForeground(Color.BLACK);
		lblSWList.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		lblSWList.setHorizontalAlignment(SwingConstants.CENTER);
		lblSWList.setBounds(72, 60, 170, 40);
		pSWListPanel.add(lblSWList);
		
		pList = new JPanel();
		pList.setBounds(22, 123, 590, 488);
		pSWListPanel.add(pList);
		
		JRadioButton rdbtnSC = new JRadioButton("  매입 이력");
		rdbtnSC.setForeground(Color.BLACK);
		rdbtnSC.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnSC.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		rdbtnSC.setBounds(320, 70, 110, 20);
		pSWListPanel.add(rdbtnSC);
		
		JRadioButton rdbtnSO = new JRadioButton("  발주 이력");
		rdbtnSO.setForeground(Color.BLACK);
		rdbtnSO.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnSO.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		rdbtnSO.setBounds(460, 70, 110, 20);
		pSWListPanel.add(rdbtnSO);
	}
}
