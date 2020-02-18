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

@SuppressWarnings("serial")
public class IQPanel extends JPanel {
	private JPanel pTitle;
	private JTextField tfC_name;

	/**
	 * Create the panel.
	 */
	public IQPanel() {

		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(1500, 900));
		setLayout(new GridLayout(0, 1, 0, 0));
		
		pTitle = new JPanel();
		pTitle.setBackground(SystemColor.inactiveCaption);
		pTitle.setBorder(new EmptyBorder(30, 0, 0, 0));
		add(pTitle);
		pTitle.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitle = new JLabel("재고현황 조회");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("����", Font.BOLD, 30));
		pTitle.add(lblTitle, BorderLayout.NORTH);
		
		JPanel pTop = new JPanel();
		pTop.setBackground(SystemColor.inactiveCaption);
		pTop.setBorder(new EmptyBorder(40, 100, 50, 100));
		pTitle.add(pTop, BorderLayout.CENTER);
		pTop.setLayout(new BorderLayout(0, 0));
		
		JPanel pSearch = new JPanel();
		pSearch.setBackground(SystemColor.inactiveCaption);
		pTop.add(pSearch, BorderLayout.NORTH);
		pSearch.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblC_name = new JLabel("품   목   명");
		lblC_name.setHorizontalAlignment(SwingConstants.CENTER);
		lblC_name.setPreferredSize(new Dimension(130, 30));
		lblC_name.setFont(new Font("Dialog", Font.BOLD, 18));
		pSearch.add(lblC_name);
		
		tfC_name = new JTextField();
		tfC_name.setPreferredSize(new Dimension(130, 30));
		pSearch.add(tfC_name);
		tfC_name.setColumns(15);
		
		JButton btnSearch = new JButton("\uC870\uD68C");
		btnSearch.setFont(new Font("굴림", Font.PLAIN, 12));
		btnSearch.setPreferredSize(new Dimension(60, 30));
		pSearch.add(btnSearch);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("전체");
		rdbtnNewRadioButton.setFont(new Font("굴림", Font.PLAIN, 16));
		rdbtnNewRadioButton.setBackground(SystemColor.inactiveCaption);
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setPreferredSize(new Dimension(90, 30));
		pSearch.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("재고과다");
		rdbtnNewRadioButton_1.setFont(new Font("굴림", Font.PLAIN, 16));
		rdbtnNewRadioButton_1.setBackground(SystemColor.inactiveCaption);
		rdbtnNewRadioButton_1.setPreferredSize(new Dimension(110, 30));
		pSearch.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("적정재고");
		rdbtnNewRadioButton_2.setFont(new Font("굴림", Font.PLAIN, 16));
		rdbtnNewRadioButton_2.setBackground(SystemColor.inactiveCaption);
		rdbtnNewRadioButton_2.setPreferredSize(new Dimension(110, 30));
		pSearch.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("재고부족");
		rdbtnNewRadioButton_3.setFont(new Font("굴림", Font.PLAIN, 16));
		rdbtnNewRadioButton_3.setBackground(SystemColor.inactiveCaption);
		rdbtnNewRadioButton_3.setPreferredSize(new Dimension(110, 30));
		pSearch.add(rdbtnNewRadioButton_3);
		
		JPanel pList = new JPanel();
		pList.setBackground(SystemColor.inactiveCaptionBorder);
		pTop.add(pList, BorderLayout.CENTER);
		pList.setLayout(new GridLayout(1, 0, 0, 0));
	}

}
