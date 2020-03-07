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
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import yi_java3st_1team.viewsmanagement.ui.content.DateSalePanel;
import yi_java3st_1team.viewsmanagement.ui.content.TotalAmountPanel;
import yi_java3st_1team.viewsmanagement.ui.list.DateSaleTblPanel;
import java.awt.Color;
import javax.swing.SpinnerModel;
import com.toedter.calendar.JDateChooser;

import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("serial")
public class DateSaleUIPanel2 extends JPanel {
	private JPanel pTitle;
	private JDateChooser tfHireDate;

	/**
	 * Create the panel.
	 */
	public DateSaleUIPanel2() {

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
		pSearch.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblStart = new JLabel("시   작");
		lblStart.setPreferredSize(new Dimension(140, 30));
		lblStart.setHorizontalAlignment(SwingConstants.LEFT);
		lblStart.setForeground(Color.BLACK);
		lblStart.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		pSearch.add(lblStart);
		
		Calendar calendar = Calendar.getInstance();
		Date value = calendar.getTime();
		
		SpinnerDateModel dateModel = new SpinnerDateModel(value, null, null, Calendar.YEAR);		
		JSpinner spStartY = new JSpinner(dateModel);
		spStartY.setEditor(new JSpinner.DateEditor(spStartY, "yyyy"));
		spStartY.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(631170000000L), null, Calendar.YEAR));
		spStartY.setPreferredSize(new Dimension(160, 30));
		spStartY.setFont(new Font("굴림", Font.BOLD, 18));
		pSearch.add(spStartY);
		
		JLabel lblStartY = new JLabel("년도");
		lblStartY.setPreferredSize(new Dimension(90, 20));
		lblStartY.setHorizontalAlignment(SwingConstants.LEFT);
		lblStartY.setFont(new Font("굴림", Font.BOLD, 12));
		pSearch.add(lblStartY);
		
		JSpinner spStartM = new JSpinner(dateModel);
		spStartM.setEditor(new JSpinner.DateEditor(spStartM, "MM"));
		spStartM.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(-2208970800000L), null, Calendar.MONTH));
		spStartM.setPreferredSize(new Dimension(160, 30));
		spStartM.setFont(new Font("굴림", Font.BOLD, 18));
		pSearch.add(spStartM);
		
		JLabel lblStartM = new JLabel("월");
		lblStartM.setPreferredSize(new Dimension(90, 20));
		lblStartM.setFont(new Font("굴림", Font.BOLD, 12));
		pSearch.add(lblStartM);
		
		JSpinner spStartD = new JSpinner(dateModel);
		spStartD.setEditor(new JSpinner.DateEditor(spStartD, "dd"));
		spStartD.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(-2208970800000L), null, Calendar.MONTH));
		spStartD.setPreferredSize(new Dimension(160, 30));
		spStartD.setFont(new Font("굴림", Font.BOLD, 18));
		pSearch.add(spStartD);
		
		JLabel lblStartD = new JLabel("일");
		lblStartD.setPreferredSize(new Dimension(90, 20));
		lblStartD.setFont(new Font("굴림", Font.BOLD, 12));
		pSearch.add(lblStartD);
		
		tfHireDate = new JDateChooser(new Date(), "yyyy-MM-dd");
		tfHireDate.getCalendarButton().setFont(new Font("맑은 고딕", Font.BOLD, 16));
		tfHireDate.getCalendarButton().setPreferredSize(new Dimension(80, 30));
		tfHireDate.getCalendarButton().setFocusable(false);
		tfHireDate.getCalendarButton().setBackground(SystemColor.controlHighlight);
		tfHireDate.getCalendarButton().setForeground(Color.BLACK);
		pSearch.add(tfHireDate);
		
		JButton btnSearch = new JButton("검색");
		btnSearch.setPreferredSize(new Dimension(100, 30));
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSearch.setFocusable(false);
		btnSearch.setBackground(new Color(70, 130, 180));
		pSearch.add(btnSearch);
		
		JLabel lblEnd = new JLabel("종   료");
		lblEnd.setPreferredSize(new Dimension(140, 30));
		lblEnd.setHorizontalAlignment(SwingConstants.LEFT);
		lblEnd.setForeground(Color.BLACK);
		lblEnd.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		pSearch.add(lblEnd);
		
		JSpinner spEnd = new JSpinner(dateModel);
		spEnd.setEditor(new JSpinner.DateEditor(spEnd, "yyyy"));
		spEnd.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(631170000000L), null, Calendar.YEAR));
		spEnd.setPreferredSize(new Dimension(160, 30));
		spEnd.setFont(new Font("굴림", Font.BOLD, 18));
		pSearch.add(spEnd);
		
		JLabel lblEndY = new JLabel("년도");
		lblEndY.setPreferredSize(new Dimension(90, 20));
		lblEndY.setHorizontalAlignment(SwingConstants.LEFT);
		lblEndY.setFont(new Font("굴림", Font.BOLD, 12));
		pSearch.add(lblEndY);
		
		JSpinner spEndM = new JSpinner(dateModel);
		spEndM.setEditor(new JSpinner.DateEditor(spEndM, "MM"));
		spEndM.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(-2208970800000L), null, Calendar.MONTH));
		spEndM.setPreferredSize(new Dimension(160, 30));
		spEndM.setFont(new Font("굴림", Font.BOLD, 18));
		pSearch.add(spEndM);
		
		JLabel lblEndM = new JLabel("월");
		lblEndM.setPreferredSize(new Dimension(90, 20));
		lblEndM.setFont(new Font("굴림", Font.BOLD, 12));
		pSearch.add(lblEndM);
		
		JSpinner spEndD = new JSpinner(dateModel);
		spEndD.setEditor(new JSpinner.DateEditor(spEndD, "dd"));
		spEndD.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(-2208970800000L), null, Calendar.DAY_OF_YEAR));
		spEndD.setPreferredSize(new Dimension(160, 30));
		spEndD.setFont(new Font("굴림", Font.BOLD, 18));
		pSearch.add(spEndD);
		
		JLabel lblEndD = new JLabel("일");
		lblEndD.setPreferredSize(new Dimension(90, 20));
		lblEndD.setFont(new Font("굴림", Font.BOLD, 12));
		pSearch.add(lblEndD);
		
		tfHireDate = new JDateChooser(new Date(), "yyyy-MM-dd");
		tfHireDate.getCalendarButton().setFont(new Font("맑은 고딕", Font.BOLD, 16));
		tfHireDate.getCalendarButton().setPreferredSize(new Dimension(80, 30));
		tfHireDate.getCalendarButton().setText("종료");
		tfHireDate.getCalendarButton().setFocusable(false);
		tfHireDate.getCalendarButton().setBackground(SystemColor.controlHighlight);
		tfHireDate.getCalendarButton().setForeground(Color.BLACK);
		pSearch.add(tfHireDate);
		
		JButton btnMain = new JButton("메인화면");
		btnMain.setPreferredSize(new Dimension(100, 30));
		btnMain.setForeground(Color.WHITE);
		btnMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnMain.setFocusable(false);
		btnMain.setBackground(new Color(25, 25, 112));
		pSearch.add(btnMain);
		
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
