package yi_java3st_1team.viewsmanagement.ui.panel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import yi_java3st_1team.viewsmanagement.ui.content.IQPanel;
import yi_java3st_1team.viewsmanagement.ui.list.IQTblPanel;

@SuppressWarnings("serial")
public class IQUIPanel extends JPanel {
	private JPanel pTitle;

	/**
	 * Create the panel.
	 */
	public IQUIPanel() {

		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(1500, 900));
		setLayout(null);
		
		pTitle = new JPanel();
		pTitle.setBounds(0, 0, 1500, 900);
		pTitle.setBackground(SystemColor.inactiveCaption);
		pTitle.setBorder(new EmptyBorder(30, 0, 0, 0));
		add(pTitle);
		pTitle.setLayout(null);
		
		JLabel lblTitle = new JLabel("재고현황 조회");
		lblTitle.setBounds(0, 30, 1500, 42);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("����", Font.BOLD, 30));
		pTitle.add(lblTitle);
		
		JPanel pTop = new JPanel();
		pTop.setBounds(0, 72, 1500, 828);
		pTop.setBackground(SystemColor.inactiveCaption);
		pTop.setBorder(new EmptyBorder(40, 100, 50, 100));
		pTitle.add(pTop);
		pTop.setLayout(null);
		
		JPanel pSearch = new JPanel();
		pSearch.setBounds(100, 40, 1300, 40);
		pSearch.setPreferredSize(new Dimension(1300, 40));
		pSearch.setBackground(SystemColor.inactiveCaption);
		pTop.add(pSearch);
		pSearch.setLayout(null);
		
		IQPanel pIQ = new IQPanel();
		pIQ.setBounds(0, 0, 1300, 40);
		pSearch.add(pIQ);
		
		JPanel pList = new JPanel();
		pList.setBounds(100, 80, 1300, 698);
		pList.setBackground(SystemColor.inactiveCaptionBorder);
		pTop.add(pList);
		pList.setLayout(null);
		
		IQTblPanel pIQList = new IQTblPanel();
		pIQList.setBounds(0, 0, 1300, 698);
		pIQList.setBackground(SystemColor.inactiveCaptionBorder);
		pList.add(pIQList);
	}

}
