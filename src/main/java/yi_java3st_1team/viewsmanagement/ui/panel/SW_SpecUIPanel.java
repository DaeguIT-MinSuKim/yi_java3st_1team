package yi_java3st_1team.viewsmanagement.ui.panel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import yi_java3st_1team.viewsmanagement.ui.list.SWTotalTblPanel;
import yi_java3st_1team.viewsmanagement.ui.list.SpecTblPanel;

@SuppressWarnings("serial")
public class SW_SpecUIPanel extends JPanel {
	private JPanel pTitle;
	private JTextField tfLTotal;
	private JTextField tfRTotal;

	/**
	 * Create the panel.
	 */
	public SW_SpecUIPanel() {

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
		
		JLabel lblTitle = new JLabel("전체 판매 현황 / 거래명세서");
		lblTitle.setBounds(0, 30, 1500, 42);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("����", Font.BOLD, 30));
		pTitle.add(lblTitle);
		
		JPanel pLeft = new JPanel();
		pLeft.setBounds(0, 72, 1500, 828);
		pTitle.add(pLeft);
		pLeft.setLayout(null);
		
		JPanel pSW = new JPanel();
		pSW.setBounds(0, 0, 750, 828);
		pLeft.add(pSW);
		pSW.setLayout(null);
		
		JPanel pLeftTop = new JPanel();
		pLeftTop.setBounds(0, 0, 750, 75);
		pLeftTop.setBackground(SystemColor.inactiveCaption);
		pLeftTop.setBorder(new EmptyBorder(30, 50, 5, 5));
		pSW.add(pLeftTop);
		pLeftTop.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JRadioButton rdbtnSW = new JRadioButton(" S/W 전체 판매현황");
		rdbtnSW.setPreferredSize(new Dimension(230, 30));
		rdbtnSW.setBackground(SystemColor.inactiveCaption);
		rdbtnSW.setFont(new Font("굴림", Font.BOLD, 18));
		rdbtnSW.setHorizontalAlignment(SwingConstants.CENTER);
		pLeftTop.add(rdbtnSW);
		
		JPanel pLeftList = new JPanel();
		pLeftList.setBounds(0, 75, 750, 658);
		pLeftList.setBackground(SystemColor.inactiveCaption);
		pLeftList.setBorder(new EmptyBorder(5, 55, 5, 35));
		pSW.add(pLeftList);
		pLeftList.setLayout(new GridLayout(0, 1, 0, 0));
		
		SWTotalTblPanel pSWList = new SWTotalTblPanel();
		pSWList.setBackground(SystemColor.inactiveCaptionBorder);
		pLeftList.add(pSWList);
		
		JPanel pLeftResult = new JPanel();
		pLeftResult.setBounds(0, 733, 750, 95);
		pLeftResult.setBackground(SystemColor.inactiveCaption);
		pLeftResult.setBorder(new EmptyBorder(5, 5, 50, 30));
		FlowLayout fl_pLeftResult = (FlowLayout) pLeftResult.getLayout();
		fl_pLeftResult.setAlignment(FlowLayout.RIGHT);
		pSW.add(pLeftResult);
		
		JLabel lblLTotal = new JLabel("총 판매금액");
		lblLTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblLTotal.setPreferredSize(new Dimension(130, 30));
		lblLTotal.setFont(new Font("굴림", Font.BOLD, 18));
		pLeftResult.add(lblLTotal);
		
		tfLTotal = new JTextField();
		tfLTotal.setFont(new Font("굴림", Font.PLAIN, 16));
		tfLTotal.setPreferredSize(new Dimension(200, 30));
		pLeftResult.add(tfLTotal);
		tfLTotal.setColumns(15);
		
		JPanel pRight = new JPanel();
		pRight.setBounds(750, 0, 750, 828);
		pLeft.add(pRight);
		pRight.setLayout(null);
		
		JPanel pSpec = new JPanel();
		pSpec.setBounds(0, 0, 750, 75);
		pSpec.setBackground(SystemColor.inactiveCaption);
		pSpec.setBorder(new EmptyBorder(30, 35, 5, 5));
		FlowLayout fl_pSpec = (FlowLayout) pSpec.getLayout();
		fl_pSpec.setAlignment(FlowLayout.LEFT);
		pRight.add(pSpec);
		
		JRadioButton rdbtnTS = new JRadioButton(" 거래명세서");
		rdbtnTS.setPreferredSize(new Dimension(150, 30));
		rdbtnTS.setBackground(SystemColor.inactiveCaption);
		rdbtnTS.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnTS.setFont(new Font("굴림", Font.BOLD, 18));
		pSpec.add(rdbtnTS);
		
		JPanel pRightList = new JPanel();
		pRightList.setBounds(0, 75, 750, 658);
		pRightList.setBackground(SystemColor.inactiveCaption);
		pRightList.setBorder(new EmptyBorder(5, 35, 5, 55));
		pRight.add(pRightList);
		pRightList.setLayout(new GridLayout(0, 1, 0, 0));
		
		SpecTblPanel pSpecList = new SpecTblPanel();
		pSpecList.setBackground(SystemColor.inactiveCaptionBorder);
		pRightList.add(pSpecList);
		
		JPanel pRightResult = new JPanel();
		pRightResult.setBounds(0, 733, 750, 95);
		pRightResult.setBackground(SystemColor.inactiveCaption);
		FlowLayout fl_pRightResult = (FlowLayout) pRightResult.getLayout();
		fl_pRightResult.setAlignment(FlowLayout.RIGHT);
		pRightResult.setBorder(new EmptyBorder(5, 5, 50, 50));
		pRight.add(pRightResult);
		
		JLabel lblRTotal = new JLabel("총 납품금액");
		lblRTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblRTotal.setPreferredSize(new Dimension(130, 30));
		lblRTotal.setFont(new Font("굴림", Font.BOLD, 18));
		pRightResult.add(lblRTotal);
		
		tfRTotal = new JTextField();
		tfRTotal.setFont(new Font("굴림", Font.PLAIN, 16));
		tfRTotal.setPreferredSize(new Dimension(200, 30));
		tfRTotal.setColumns(15);
		pRightResult.add(tfRTotal);
	}

}
