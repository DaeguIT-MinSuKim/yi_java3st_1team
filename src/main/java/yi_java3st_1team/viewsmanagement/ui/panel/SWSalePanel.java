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
public class SWSalePanel extends JPanel {
	private JPanel pTitle;
	private JTextField tfC_name;
	private JTextField tfSP;
	private JTextField tfUCM;

	/**
	 * Create the panel.
	 */
	public SWSalePanel() {

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
		
		JLabel lblTitle = new JLabel("S/W별 판매현황 조회");
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
		tfC_name.setPreferredSize(new Dimension(150, 30));
		pSearch.add(tfC_name);
		tfC_name.setColumns(15);
		
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
		
		JLabel lblSP = new JLabel("총 판매금액");
		lblSP.setPreferredSize(new Dimension(130, 30));
		lblSP.setHorizontalAlignment(SwingConstants.CENTER);
		lblSP.setFont(new Font("Dialog", Font.BOLD, 18));
		pResult.add(lblSP);
		
		tfSP = new JTextField();
		tfSP.setPreferredSize(new Dimension(200, 30));
		pResult.add(tfSP);
		tfSP.setColumns(15);
		
		JLabel lblUCM = new JLabel(" 총 판매이윤");
		lblUCM.setPreferredSize(new Dimension(130, 30));
		lblUCM.setHorizontalAlignment(SwingConstants.CENTER);
		lblUCM.setFont(new Font("Dialog", Font.BOLD, 18));
		pResult.add(lblUCM);
		
		tfUCM = new JTextField();
		tfUCM.setPreferredSize(new Dimension(200, 30));
		pResult.add(tfUCM);
		tfUCM.setColumns(15);
	}

}
