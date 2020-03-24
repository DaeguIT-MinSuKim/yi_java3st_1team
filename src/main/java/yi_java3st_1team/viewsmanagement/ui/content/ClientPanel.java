package yi_java3st_1team.viewsmanagement.ui.content;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.text.SimpleDateFormat;

import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.logging.SimpleFormatter;
import java.util.Calendar;
import java.awt.Color;
import javax.swing.event.ChangeListener;

import yi_java3st_1team.viewsmanagement.ui.chart.ClientChartPanel;

import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ClientPanel extends JPanel implements ChangeListener, ActionListener {
	private JSpinner spYear;
	private JSpinner spMonth;
	public static String str;
	public static String str2;
	private ClientChartPanel ccp;
	private ClientChartPanel ccp2;
	private JButton btnStart;

	/**
	 * Create the panel.
	 */
	public ClientPanel() {

		initialize();
	}
	
	public String getStr() {
		return str;
	}

	public String getStr2() {
		return str2;
	}

	private void initialize() {
		setBackground(SystemColor.inactiveCaption);
		setSize(new Dimension(750, 40));
		
		Calendar calendar = Calendar.getInstance();
		Date value = calendar.getTime();
		
		SpinnerDateModel dateModel = new SpinnerDateModel(value, null, null, Calendar.YEAR);		
		spYear = new JSpinner(dateModel);
		spYear.addChangeListener(this);
		spYear.setEditor(new JSpinner.DateEditor(spYear, "yyyy"));
		spYear.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(631170000000L), null, Calendar.YEAR));
		spYear.setPreferredSize(new Dimension(120, 30));
		spYear.setFont(new Font("굴림", Font.BOLD, 18));
		add(spYear);
		
		JLabel lblYear = new JLabel("년도");
		lblYear.setPreferredSize(new Dimension(80, 30));
		lblYear.setHorizontalAlignment(SwingConstants.LEFT);
		lblYear.setFont(new Font("굴림", Font.BOLD, 16));
		add(lblYear);
		
		spMonth = new JSpinner(dateModel);
		spMonth.addChangeListener(this);
		spMonth.setEditor(new JSpinner.DateEditor(spMonth, "MM"));
		spMonth.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(-2208970800000L), null, Calendar.MONTH));
		spMonth.setPreferredSize(new Dimension(120, 30));
		spMonth.setFont(new Font("굴림", Font.BOLD, 18));
		add(spMonth);
		
		
		JLabel lblMonth = new JLabel("월");
		lblMonth.setPreferredSize(new Dimension(70, 30));
		lblMonth.setFont(new Font("굴림", Font.BOLD, 16));
		add(lblMonth);
		
		btnStart = new JButton("시작날짜선택");
		btnStart.addActionListener(this);
		btnStart.setBackground(new Color(65, 105, 225));
		btnStart.setForeground(Color.WHITE);
		btnStart.setPreferredSize(new Dimension(150, 30));
		btnStart.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		add(btnStart);
	}

	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == spMonth) {
			spMonthStateChanged(e);
		}
		if (e.getSource() == spYear) {
			spYearStateChanged(e);
		}
	}
	protected void spYearStateChanged(ChangeEvent e) {
		Object year = spYear.getValue();
		Date month = new Date();
		SimpleDateFormat sfm = new SimpleDateFormat("yyyy");
		SimpleDateFormat sfm2 = new SimpleDateFormat("MM");
		str = sfm.format(year);
		str2 = sfm2.format(month);
//		ccp = new ClientChartPanel();
//		ccp.newCreateScene(str, str2);
	}
	protected void spMonthStateChanged(ChangeEvent e) {
		Object month = spMonth.getValue();
		Date year = new Date();
		SimpleDateFormat sfm = new SimpleDateFormat("yyyy");
		SimpleDateFormat sfm2 = new SimpleDateFormat("MM");
		str = sfm.format(year);
		str2 = sfm2.format(month);
//		ccp2 = new ClientChartPanel();
//		ccp2.newCreateScene(str, str2);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnStart) {
			btnStartActionPerformed(e);
		}
	}
	protected void btnStartActionPerformed(ActionEvent e) {
		ccp = new ClientChartPanel();
		ccp.newCreateScene(str, str2);
		
		ccp2 = new ClientChartPanel();
		ccp2.newCreateScene(str, str2);
	}
}
