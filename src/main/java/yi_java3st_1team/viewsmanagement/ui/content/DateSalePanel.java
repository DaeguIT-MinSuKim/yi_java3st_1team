package yi_java3st_1team.viewsmanagement.ui.content;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import java.awt.Color;

@SuppressWarnings("serial")
public class DateSalePanel extends JPanel {

	private JDateChooser tfHireDate;
	/**
	 * Create the panel.
	 */
	public DateSalePanel() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaption);
		setSize(new Dimension(1300, 80));
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(1300, 80));
		panel.setBackground(SystemColor.inactiveCaption);
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblStart = new JLabel("시   작");
		lblStart.setForeground(Color.BLACK);
		lblStart.setPreferredSize(new Dimension(140, 30));
		lblStart.setHorizontalAlignment(SwingConstants.LEFT);
		lblStart.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		panel.add(lblStart);
		
		Calendar calendar = Calendar.getInstance();
		Date value = calendar.getTime();
		
		SpinnerDateModel dateModel = new SpinnerDateModel(value, null, null, Calendar.YEAR);		
		JSpinner spStartY = new JSpinner(dateModel);
		spStartY.setEditor(new JSpinner.DateEditor(spStartY, "yyyy"));
		spStartY.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(631170000000L), null, Calendar.YEAR));
		spStartY.setPreferredSize(new Dimension(160, 30));
		spStartY.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(spStartY);
		
		JLabel lblStartY = new JLabel("년도");
		lblStartY.setPreferredSize(new Dimension(90, 20));
		lblStartY.setHorizontalAlignment(SwingConstants.LEFT);
		lblStartY.setFont(new Font("굴림", Font.BOLD, 12));
		panel.add(lblStartY);
		
		JSpinner spStartM = new JSpinner(dateModel);
		spStartM.setEditor(new JSpinner.DateEditor(spStartM, "MM"));
		spStartM.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(-2208970800000L), null, Calendar.MONTH));
		spStartM.setPreferredSize(new Dimension(160, 30));
		spStartM.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(spStartM);
		
		JLabel lblStartM = new JLabel("월");
		lblStartM.setPreferredSize(new Dimension(90, 20));
		lblStartM.setFont(new Font("굴림", Font.BOLD, 12));
		panel.add(lblStartM);
		
		JSpinner spStartD = new JSpinner(dateModel);
		spStartD.setEditor(new JSpinner.DateEditor(spStartD, "dd"));
		spStartD.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(-2208970800000L), null, Calendar.MONTH));
		spStartD.setPreferredSize(new Dimension(160, 30));
		spStartD.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(spStartD);
		
		JLabel lblStartD = new JLabel("일");
		lblStartD.setPreferredSize(new Dimension(90, 20));
		lblStartD.setFont(new Font("굴림", Font.BOLD, 12));
		panel.add(lblStartD);
		
		tfHireDate = new JDateChooser(new Date(), "yyyy-MM-dd");
		tfHireDate.getCalendarButton().setFont(new Font("맑은 고딕", Font.BOLD, 16));
		tfHireDate.getCalendarButton().setPreferredSize(new Dimension(80, 30));
		tfHireDate.getCalendarButton().setText("시작");
		tfHireDate.getCalendarButton().setFocusable(false);
		tfHireDate.getCalendarButton().setBackground(SystemColor.controlHighlight);
		tfHireDate.getCalendarButton().setForeground(Color.BLACK);
		panel.add(tfHireDate);
		
		JButton btnSearch = new JButton("검색");
		btnSearch.setFocusable(false);
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setBackground(new Color(70, 130, 180));
		btnSearch.setPreferredSize(new Dimension(100, 30));
		btnSearch.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel.add(btnSearch);
		
		JLabel lblEnd = new JLabel("종   료");
		lblEnd.setForeground(Color.BLACK);
		lblEnd.setPreferredSize(new Dimension(140, 30));
		lblEnd.setHorizontalAlignment(SwingConstants.LEFT);
		lblEnd.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		panel.add(lblEnd);
		
		JSpinner spEnd = new JSpinner(dateModel);
		spEnd.setEditor(new JSpinner.DateEditor(spEnd, "yyyy"));
		spEnd.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(631170000000L), null, Calendar.YEAR));
		spEnd.setPreferredSize(new Dimension(160, 30));
		spEnd.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(spEnd);
		
		JLabel lblEndY = new JLabel("년도");
		lblEndY.setPreferredSize(new Dimension(90, 20));
		lblEndY.setHorizontalAlignment(SwingConstants.LEFT);
		lblEndY.setFont(new Font("굴림", Font.BOLD, 12));
		panel.add(lblEndY);
		
		JSpinner spEndM = new JSpinner(dateModel);
		spEndM.setEditor(new JSpinner.DateEditor(spEndM, "MM"));
		spEndM.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(-2208970800000L), null, Calendar.MONTH));
		spEndM.setPreferredSize(new Dimension(160, 30));
		spEndM.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(spEndM);
		
		JLabel lblEndM = new JLabel("월");
		lblEndM.setPreferredSize(new Dimension(90, 20));
		lblEndM.setFont(new Font("굴림", Font.BOLD, 12));
		panel.add(lblEndM);
		
		JSpinner spEndD = new JSpinner(dateModel);
		spEndD.setEditor(new JSpinner.DateEditor(spEndD, "dd"));
		spEndD.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(-2208970800000L), null, Calendar.DAY_OF_YEAR));
		spEndD.setPreferredSize(new Dimension(160, 30));
		spEndD.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(spEndD);
		
		JLabel lblEndD = new JLabel("일");
		lblEndD.setPreferredSize(new Dimension(90, 20));
		lblEndD.setFont(new Font("굴림", Font.BOLD, 12));
		panel.add(lblEndD);
		
		tfHireDate = new JDateChooser(new Date(), "yyyy-MM-dd");
		tfHireDate.getCalendarButton().setFont(new Font("맑은 고딕", Font.BOLD, 16));
		tfHireDate.getCalendarButton().setPreferredSize(new Dimension(80, 30));
		tfHireDate.getCalendarButton().setText("종료");
		tfHireDate.getCalendarButton().setFocusable(false);
		tfHireDate.getCalendarButton().setBackground(SystemColor.controlHighlight);
		tfHireDate.getCalendarButton().setForeground(Color.BLACK);
		panel.add(tfHireDate);
		
		JButton btnMain = new JButton("메인화면");
		btnMain.setFocusable(false);
		btnMain.setBackground(new Color(25, 25, 112));
		btnMain.setForeground(Color.WHITE);
		btnMain.setPreferredSize(new Dimension(100, 30));
		btnMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		panel.add(btnMain);
	}

}
