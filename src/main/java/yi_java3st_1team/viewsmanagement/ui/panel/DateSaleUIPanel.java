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
		setLayout(new GridLayout(0, 1, 0, 0));
		
		pTitle = new JPanel();
		pTitle.setBackground(SystemColor.inactiveCaption);
		pTitle.setBorder(new EmptyBorder(30, 0, 0, 0));
		add(pTitle);
		pTitle.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitle = new JLabel("날짜별 판매현황 조회");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("����", Font.BOLD, 30));
		pTitle.add(lblTitle, BorderLayout.NORTH);
		
		JPanel pTop = new JPanel();
		pTop.setBackground(SystemColor.inactiveCaption);
		pTop.setBorder(new EmptyBorder(40, 100, 50, 100));
		pTitle.add(pTop, BorderLayout.CENTER);
		pTop.setLayout(new BorderLayout(0, 0));
		
		JPanel pSearch = new JPanel();
		pSearch.setPreferredSize(new Dimension(1300, 80));
		pSearch.setBackground(SystemColor.inactiveCaption);
		pTop.add(pSearch, BorderLayout.NORTH);
		pSearch.setLayout(new GridLayout(0, 1, 0, 0));
		
		DateSalePanel pDateSale = new DateSalePanel();
		pDateSale.setPreferredSize(new Dimension(1300, 80));
		pSearch.add(pDateSale);
		
		JPanel pList = new JPanel();
		pList.setBackground(SystemColor.inactiveCaptionBorder);
		pTop.add(pList, BorderLayout.CENTER);
		pList.setLayout(new GridLayout(1, 0, 0, 0));
		
		DateSaleTblPanel pDateSaleList = new DateSaleTblPanel();
		pList.add(pDateSaleList);
		
		JPanel pAmount = new JPanel();
		pAmount.setBackground(SystemColor.inactiveCaption);
		pTop.add(pAmount, BorderLayout.SOUTH);
		pAmount.setLayout(new GridLayout(0, 1, 0, 0));
		
		TotalAmountPanel pTotalAmount = new TotalAmountPanel();
		pAmount.add(pTotalAmount);
	}

}
