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

@SuppressWarnings("serial")
public class DateSalePanel extends JPanel {
	private JPanel pTitle;
	private JTextField tfLTotal;
	private JTextField tfRTotal;

	/**
	 * Create the panel.
	 */
	public DateSalePanel() {

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
		pSearch.setPreferredSize(new Dimension(1500, 80));
		pSearch.setBackground(SystemColor.inactiveCaption);
		pTop.add(pSearch, BorderLayout.NORTH);
		pSearch.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblStart = new JLabel("시   작");
		lblStart.setHorizontalAlignment(SwingConstants.LEFT);
		lblStart.setPreferredSize(new Dimension(150, 30));
		lblStart.setFont(new Font("굴림", Font.BOLD, 18));
		pSearch.add(lblStart);
		
		JSpinner spYear = new JSpinner();
		spYear.setFont(new Font("굴림", Font.BOLD, 18));
		spYear.setPreferredSize(new Dimension(200, 30));
		spYear.setModel(new SpinnerNumberModel(new Integer(2020), null, null, new Integer(1)));
		pSearch.add(spYear);
		
		JLabel lblYear = new JLabel("년도");
		lblYear.setHorizontalAlignment(SwingConstants.LEFT);
		lblYear.setFont(new Font("굴림", Font.BOLD, 12));
		lblYear.setPreferredSize(new Dimension(100, 20));
		pSearch.add(lblYear);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("굴림", Font.BOLD, 18));
		spinner_1.setPreferredSize(new Dimension(200, 30));
		spinner_1.setModel(new SpinnerNumberModel(new Integer(2), null, null, new Integer(1)));
		pSearch.add(spinner_1);
		
		JLabel lblMonth = new JLabel("월");
		lblMonth.setFont(new Font("굴림", Font.BOLD, 12));
		lblMonth.setPreferredSize(new Dimension(100, 20));
		pSearch.add(lblMonth);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setFont(new Font("굴림", Font.BOLD, 18));
		spinner_2.setModel(new SpinnerNumberModel(new Integer(18), null, null, new Integer(1)));
		spinner_2.setPreferredSize(new Dimension(200, 30));
		pSearch.add(spinner_2);
		
		JLabel lblDay = new JLabel("일");
		lblDay.setFont(new Font("굴림", Font.BOLD, 12));
		lblDay.setPreferredSize(new Dimension(100, 20));
		pSearch.add(lblDay);
		
		JButton btnStart = new JButton("시작");
		btnStart.setFont(new Font("굴림", Font.PLAIN, 16));
		btnStart.setPreferredSize(new Dimension(80, 30));
		pSearch.add(btnStart);
		
		JLabel label = new JLabel("종   료");
		label.setPreferredSize(new Dimension(150, 30));
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("굴림", Font.BOLD, 18));
		pSearch.add(label);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(2020), null, null, new Integer(1)));
		spinner.setPreferredSize(new Dimension(200, 30));
		spinner.setFont(new Font("굴림", Font.BOLD, 18));
		pSearch.add(spinner);
		
		JLabel label_1 = new JLabel("년도");
		label_1.setPreferredSize(new Dimension(100, 20));
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("굴림", Font.BOLD, 12));
		pSearch.add(label_1);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(new Integer(2), null, null, new Integer(1)));
		spinner_3.setPreferredSize(new Dimension(200, 30));
		spinner_3.setFont(new Font("굴림", Font.BOLD, 18));
		pSearch.add(spinner_3);
		
		JLabel label_2 = new JLabel("월");
		label_2.setPreferredSize(new Dimension(100, 20));
		label_2.setFont(new Font("굴림", Font.BOLD, 12));
		pSearch.add(label_2);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(new Integer(18), null, null, new Integer(1)));
		spinner_4.setPreferredSize(new Dimension(200, 30));
		spinner_4.setFont(new Font("굴림", Font.BOLD, 18));
		pSearch.add(spinner_4);
		
		JLabel label_3 = new JLabel("일");
		label_3.setPreferredSize(new Dimension(100, 20));
		label_3.setFont(new Font("굴림", Font.BOLD, 12));
		pSearch.add(label_3);
		
		JButton btnWhdfy = new JButton("종료");
		btnWhdfy.setFont(new Font("굴림", Font.PLAIN, 16));
		btnWhdfy.setPreferredSize(new Dimension(80, 30));
		pSearch.add(btnWhdfy);
		
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
