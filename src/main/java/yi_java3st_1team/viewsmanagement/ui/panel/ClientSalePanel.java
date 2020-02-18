package yi_java3st_1team.viewsmanagement.ui.panel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ClientSalePanel extends JPanel {
	private JPanel pTitle;
	private JTextField tfName;
	private JTextField tfLTotal;
	private JTextField tfRTotal;

	/**
	 * Create the panel.
	 */
	public ClientSalePanel() {

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
		
		JLabel lblTitle = new JLabel("\uACE0\uAC1D\uBCC4 \uD310\uB9E4\uD604\uD669 \uC870\uD68C");
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
		
		JLabel lblName = new JLabel("\uACE0 \uAC1D \uC0C1 \uD638 \uBA85 ");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setPreferredSize(new Dimension(150, 30));
		lblName.setFont(new Font("Dialog", Font.BOLD, 18));
		pSearch.add(lblName);
		
		tfName = new JTextField();
		tfName.setPreferredSize(new Dimension(130, 30));
		pSearch.add(tfName);
		tfName.setColumns(15);
		
		JButton btnSearch = new JButton("\uC870\uD68C");
		btnSearch.setPreferredSize(new Dimension(60, 30));
		pSearch.add(btnSearch);
		
		JCheckBox cbTotal = new JCheckBox(" \uC804\uCCB4");
		cbTotal.setHorizontalAlignment(SwingConstants.CENTER);
		cbTotal.setFont(new Font("굴림", Font.PLAIN, 16));
		cbTotal.setPreferredSize(new Dimension(80, 30));
		cbTotal.setBackground(SystemColor.inactiveCaption);
		pSearch.add(cbTotal);
		
		JPanel pList = new JPanel();
		pList.setBackground(SystemColor.inactiveCaptionBorder);
		pTop.add(pList, BorderLayout.CENTER);
		pList.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel pResult = new JPanel();
		pResult.setBackground(SystemColor.inactiveCaption);
		FlowLayout fl_pResult = (FlowLayout) pResult.getLayout();
		fl_pResult.setAlignment(FlowLayout.RIGHT);
		pTop.add(pResult, BorderLayout.SOUTH);
		
		JLabel lblLTotal = new JLabel("\uCD1D \uB9E4\uCD9C\uAE08");
		lblLTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblLTotal.setPreferredSize(new Dimension(130, 30));
		lblLTotal.setFont(new Font("Dialog", Font.BOLD, 18));
		pResult.add(lblLTotal);
		
		tfLTotal = new JTextField();
		tfLTotal.setPreferredSize(new Dimension(200, 30));
		pResult.add(tfLTotal);
		tfLTotal.setColumns(15);
		
		JLabel lblRTotal = new JLabel(" \uCD1D \uBBF8\uC218\uAE08 ");
		lblRTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblRTotal.setPreferredSize(new Dimension(130, 30));
		lblRTotal.setFont(new Font("Dialog", Font.BOLD, 18));
		pResult.add(lblRTotal);
		
		tfRTotal = new JTextField();
		tfRTotal.setPreferredSize(new Dimension(200, 30));
		pResult.add(tfRTotal);
		tfRTotal.setColumns(15);
	}

}
