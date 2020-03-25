package yi_java3st_1team.viewsmanagement.ui.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import yi_java3st_1team.viewsmanagement.dto.SWSale;
import yi_java3st_1team.viewsmanagement.dto.Total;
import yi_java3st_1team.viewsmanagement.ui.content.SWSaleAmountPanel;
import yi_java3st_1team.viewsmanagement.ui.list.SWSaleTblPanel;
import yi_java3st_1team.viewsmanagement.ui.service.SWSaleUIService;
import yi_java3st_1team.viewsmanagement.ui.service.TotalUIService;

@SuppressWarnings("serial")
public class SWSaleUIPanel extends JPanel {
	private SWSaleUIService service;
	private TotalUIService service2;
	private JPanel pTitle;
	private JTextField textField;
	private JLabel lblTitle;
	private JPanel pTop;
	private JPanel pSearch;
	private JLabel lblProduct;
	private JButton btnSearch;
	private JCheckBox cbTotal;
	private JPanel pList;
	private SWSaleTblPanel pSWSaleList;
	private JPanel pAmount;
	private JLabel label;
	private JTextField textField_1;
	private JLabel label_1;
	private JTextField textField_2;


	public SWSaleUIPanel() {
		service = new SWSaleUIService();
		service2 = new TotalUIService();
		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(1500, 900));
		setLayout(new GridLayout(0, 1, 0, 0));
		
		pTitle = new JPanel();
		pTitle.setBackground(SystemColor.inactiveCaption);
		pTitle.setBorder(new EmptyBorder(30, 0, 0, 0));
		add(pTitle);
		pTitle.setLayout(null);
		
		lblTitle = new JLabel("S/W별 판매현황 조회");
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setBounds(0, 30, 1500, 42);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 32));
		pTitle.add(lblTitle);
		
		pTop = new JPanel();
		pTop.setBounds(0, 72, 1500, 828);
		pTop.setBackground(SystemColor.inactiveCaption);
		pTop.setBorder(new EmptyBorder(40, 100, 50, 100));
		pTitle.add(pTop);
		pTop.setLayout(null);
		
		pSearch = new JPanel();
		pSearch.setBounds(100, 40, 1300, 40);
		pSearch.setPreferredSize(new Dimension(1300, 40));
		pSearch.setBackground(SystemColor.inactiveCaption);
		pTop.add(pSearch);
		pSearch.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		lblProduct = new JLabel("품   목   명");
		lblProduct.setPreferredSize(new Dimension(130, 30));
		lblProduct.setHorizontalAlignment(SwingConstants.CENTER);
		lblProduct.setForeground(Color.BLACK);
		lblProduct.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		pSearch.add(lblProduct);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(150, 30));
		textField.setFont(new Font("굴림", Font.PLAIN, 16));
		textField.setColumns(15);
		pSearch.add(textField);
		
		btnSearch = new JButton("조회");
		btnSearch.setFocusable(false);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String PName = textField.getText();
				SWSale sw = new SWSale(PName);
				try {
					pSWSaleList.loadDate(service.showSWSaleListByPName(sw));
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnSearch.setPreferredSize(new Dimension(70, 30));
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSearch.setBackground(new Color(70, 130, 180));
		pSearch.add(btnSearch);
		
		cbTotal = new JCheckBox(" 전체");
		cbTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pSWSaleList.loadDate(service.showSWSaleList());
			}
		});
		cbTotal.setPreferredSize(new Dimension(80, 30));
		cbTotal.setHorizontalAlignment(SwingConstants.CENTER);
		cbTotal.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		cbTotal.setBackground(SystemColor.inactiveCaption);
		pSearch.add(cbTotal);
		
		pList = new JPanel();
		pList.setBounds(100, 80, 1300, 658);
		pList.setBackground(SystemColor.inactiveCaptionBorder);
		pTop.add(pList);
		pList.setLayout(null);
		
		pSWSaleList = new SWSaleTblPanel();
		pSWSaleList.setBounds(0, 0, 1300, 658);
		pSWSaleList.setBackground(SystemColor.inactiveCaptionBorder);
		pSWSaleList.loadDate(service.showSWSaleList());
		pList.add(pSWSaleList);
		
		pAmount = new JPanel();
		pAmount.setBounds(100, 738, 1300, 40);
		pAmount.setPreferredSize(new Dimension(1300, 40));
		pAmount.setBackground(SystemColor.inactiveCaption);
		pTop.add(pAmount);
		pAmount.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		label = new JLabel("총 판매금액");
		label.setPreferredSize(new Dimension(130, 30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		pAmount.add(label);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setPreferredSize(new Dimension(200, 30));
		textField_1.setFont(new Font("굴림", Font.BOLD, 16));
		textField_1.setColumns(15);
		Total total = service2.showTotalSales();
		String ts = String.format("%s", String.valueOf(total));
		textField_1.setText(ts);
		pAmount.add(textField_1);
		
		label_1 = new JLabel(" 총 판매이윤");
		label_1.setPreferredSize(new Dimension(130, 30));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		pAmount.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setForeground(Color.BLACK);
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setPreferredSize(new Dimension(200, 30));
		textField_2.setFont(new Font("굴림", Font.BOLD, 16));
		textField_2.setColumns(15);
		Total profit = service2.showSalesProfit();
		String sp = String.format("%s", String.valueOf(profit));
		textField_2.setText(sp);
		pAmount.add(textField_2);
	}

}
