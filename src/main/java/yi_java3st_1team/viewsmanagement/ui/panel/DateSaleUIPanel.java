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
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import yi_java3st_1team.viewsmanagement.ui.content.DateSalePanel;
import yi_java3st_1team.viewsmanagement.ui.content.TotalAmountPanel;
import yi_java3st_1team.viewsmanagement.ui.list.DateSaleTblPanel;
import java.awt.Color;

@SuppressWarnings("serial")
public class DateSaleUIPanel extends JPanel {
	private JPanel pTitle;

	/**
	 * Create the panel.
	 */
	public DateSaleUIPanel() {

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
		
		JLabel lblTitle = new JLabel("날짜별 판매현황 조회");
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setBounds(0, 30, 1500, 42);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 32));
		pTitle.add(lblTitle);
		
		JPanel pTop = new JPanel();
		pTop.setBounds(0, 72, 1500, 828);
		pTop.setBackground(SystemColor.inactiveCaption);
		pTop.setBorder(new EmptyBorder(40, 100, 50, 100));
		pTitle.add(pTop);
		pTop.setLayout(null);
		
		JPanel pSearch = new JPanel();
		pSearch.setBounds(100, 40, 1300, 80);
		pSearch.setPreferredSize(new Dimension(1300, 80));
		pSearch.setBackground(SystemColor.inactiveCaption);
		pTop.add(pSearch);
		pSearch.setLayout(null);
		
		DateSalePanel pDateSale = new DateSalePanel();
		pDateSale.setBounds(0, 0, 1300, 80);
		pDateSale.setPreferredSize(new Dimension(1300, 80));
		pSearch.add(pDateSale);
		
		JPanel pList = new JPanel();
		pList.setBounds(100, 120, 1300, 618);
		pList.setBackground(SystemColor.inactiveCaptionBorder);
		pTop.add(pList);
		pList.setLayout(null);
		
		DateSaleTblPanel pDateSaleList = new DateSaleTblPanel();
		pDateSaleList.setBounds(0, 0, 1300, 618);
		pDateSaleList.setBackground(SystemColor.inactiveCaptionBorder);
		pList.add(pDateSaleList);
		
		JPanel pAmount = new JPanel();
		pAmount.setBounds(100, 738, 1300, 40);
		pAmount.setBackground(SystemColor.inactiveCaption);
		pTop.add(pAmount);
		pAmount.setLayout(null);
		
		TotalAmountPanel pTotalAmount = new TotalAmountPanel();
		pTotalAmount.setBounds(0, 0, 1300, 40);
		pAmount.add(pTotalAmount);
	}

}
