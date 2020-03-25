package yi_java3st_1team.viewsmanagement.ui.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import yi_java3st_1team.viewsmanagement.dto.Total;
import yi_java3st_1team.viewsmanagement.ui.list.SWTotalSaleTblPanel;
import yi_java3st_1team.viewsmanagement.ui.list.TSTblPanel;
import yi_java3st_1team.viewsmanagement.ui.service.SW_TSUISerivce;
import yi_java3st_1team.viewsmanagement.ui.service.TotalUIService;

@SuppressWarnings("serial")
public class SW_TSUIPanel extends JPanel {
	private SW_TSUISerivce service;
	private TotalUIService service2;
	private JPanel pTitle;
	private JTextField tfLTotal;
	private JTextField tfRTotal;
	private JLabel lblTitle;
	private JPanel pLeft;
	private JPanel pSW;
	private JPanel pLeftTop;
	private JPanel pLeftList;
	private SWTotalSaleTblPanel pSWList;
	private JPanel pLeftResult;
	private JLabel lblLTotal;
	private JPanel pRight;
	private JPanel pTS;
	private JPanel pRightList;
	private TSTblPanel pTSList;
	private JPanel pRightResult;
	private JLabel lblRTotal;
	private JLabel lblTS;
	private JLabel lblSW;

	
	public SW_TSUIPanel() {
		service = new SW_TSUISerivce();
		service2 = new TotalUIService();
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
		
		lblTitle = new JLabel("전체 판매 현황 / 거래명세");
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setBounds(0, 30, 1500, 42);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 32));
		pTitle.add(lblTitle);
		
		pLeft = new JPanel();
		pLeft.setBounds(0, 72, 1500, 828);
		pTitle.add(pLeft);
		pLeft.setLayout(null);
		
		pSW = new JPanel();
		pSW.setBounds(0, 0, 750, 828);
		pLeft.add(pSW);
		pSW.setLayout(null);
		
		pLeftTop = new JPanel();
		pLeftTop.setBounds(0, 0, 750, 75);
		pLeftTop.setBackground(SystemColor.inactiveCaption);
		pLeftTop.setBorder(new EmptyBorder(30, 50, 5, 5));
		pSW.add(pLeftTop);
		pLeftTop.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		lblSW = new JLabel(" SW 전체 판매 현황");
		lblSW.setPreferredSize(new Dimension(230, 30));
		lblSW.setBackground(SystemColor.inactiveCaption);
		lblSW.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		lblSW.setHorizontalAlignment(SwingConstants.LEFT);
		pLeftTop.add(lblSW);
		
		pLeftList = new JPanel();
		pLeftList.setBounds(0, 75, 750, 658);
		pLeftList.setBackground(SystemColor.inactiveCaption);
		pLeftList.setBorder(new EmptyBorder(5, 55, 5, 35));
		pSW.add(pLeftList);
		pLeftList.setLayout(new GridLayout(0, 1, 0, 0));
		
		pSWList = new SWTotalSaleTblPanel();
		pSWList.setBackground(SystemColor.inactiveCaptionBorder);
		pSWList.loadDate(service.showSWTotalSaleList());
		pLeftList.add(pSWList);
		
		pLeftResult = new JPanel();
		pLeftResult.setBounds(0, 733, 750, 95);
		pLeftResult.setBackground(SystemColor.inactiveCaption);
		pLeftResult.setBorder(new EmptyBorder(5, 5, 50, 30));
		FlowLayout fl_pLeftResult = (FlowLayout) pLeftResult.getLayout();
		fl_pLeftResult.setAlignment(FlowLayout.RIGHT);
		pSW.add(pLeftResult);
		
		lblLTotal = new JLabel("총 판매금액");
		lblLTotal.setForeground(Color.BLACK);
		lblLTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblLTotal.setPreferredSize(new Dimension(130, 30));
		lblLTotal.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		pLeftResult.add(lblLTotal);
		
		tfLTotal = new JTextField();
		tfLTotal.setForeground(Color.BLACK);
		tfLTotal.setEditable(false);
		tfLTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		tfLTotal.setFont(new Font("굴림", Font.BOLD, 16));
		tfLTotal.setPreferredSize(new Dimension(200, 30));
		Total total = service2.showTotalSales();
		String ts = String.format("%s", String.valueOf(total));
		tfLTotal.setText(ts);
		pLeftResult.add(tfLTotal);
		tfLTotal.setColumns(15);
		
		pRight = new JPanel();
		pRight.setBounds(750, 0, 750, 828);
		pLeft.add(pRight);
		pRight.setLayout(null);
		
		pTS = new JPanel();
		pTS.setBounds(0, 0, 750, 75);
		pTS.setBackground(SystemColor.inactiveCaption);
		pTS.setBorder(new EmptyBorder(30, 35, 5, 5));
		FlowLayout fl_pSpec = (FlowLayout) pTS.getLayout();
		fl_pSpec.setAlignment(FlowLayout.LEFT);
		pRight.add(pTS);
		
		lblTS = new JLabel(" 거래명세");
		lblTS.setPreferredSize(new Dimension(230, 30));
		lblTS.setBackground(SystemColor.inactiveCaption);
		lblTS.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		lblTS.setHorizontalAlignment(SwingConstants.LEFT);
		pTS.add(lblTS);
		
		pRightList = new JPanel();
		pRightList.setBounds(0, 75, 750, 658);
		pRightList.setBackground(SystemColor.inactiveCaption);
		pRightList.setBorder(new EmptyBorder(5, 35, 5, 55));
		pRight.add(pRightList);
		pRightList.setLayout(new GridLayout(0, 1, 0, 0));
		
		pTSList = new TSTblPanel();
		pTSList.setBackground(SystemColor.inactiveCaptionBorder);
		pTSList.loadDate(service.showTSList());
		pRightList.add(pTSList);
		
		pRightResult = new JPanel();
		pRightResult.setBounds(0, 733, 750, 95);
		pRightResult.setBackground(SystemColor.inactiveCaption);
		FlowLayout fl_pRightResult = (FlowLayout) pRightResult.getLayout();
		fl_pRightResult.setAlignment(FlowLayout.RIGHT);
		pRightResult.setBorder(new EmptyBorder(5, 5, 50, 50));
		pRight.add(pRightResult);
		
		lblRTotal = new JLabel("총 납품금액");
		lblRTotal.setForeground(Color.BLACK);
		lblRTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblRTotal.setPreferredSize(new Dimension(130, 30));
		lblRTotal.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		pRightResult.add(lblRTotal);
		
		tfRTotal = new JTextField();
		tfRTotal.setForeground(Color.BLACK);
		tfRTotal.setEditable(false);
		tfRTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		tfRTotal.setFont(new Font("굴림", Font.BOLD, 16));
		tfRTotal.setPreferredSize(new Dimension(200, 30));
		tfRTotal.setColumns(15);
		Total delivery = service2.showDeliveryAmount();
		String da = String.format("%s", String.valueOf(delivery));
		tfRTotal.setText(da);
		pRightResult.add(tfRTotal);
	}

}
