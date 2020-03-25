package yi_java3st_1team.viewsmanagement.ui.content;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javafx.application.Platform;
import yi_java3st_1team.viewsmanagement.ui.chart.ClientChartPanel;
import yi_java3st_1team.viewsmanagement.ui.chart.NewClientChartPanel;
import yi_java3st_1team.viewsmanagement.ui.panel.GraphUIPanel;

@SuppressWarnings("serial")
public class ClientPanel extends JPanel implements ChangeListener, ActionListener {
	private JSpinner spYear;
	private JSpinner spMonth;
	public static String str;
	public static String str2;
	private NewClientChartPanel ccp;
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
		

		btnStart = new JButton("조 회");
		btnStart.addActionListener(this);
		btnStart.setBackground(new Color(65, 105, 225));
		btnStart.setForeground(Color.WHITE);
		btnStart.setPreferredSize(new Dimension(100, 30));
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
		SimpleDateFormat sfm = new SimpleDateFormat("yyyy");
		str = sfm.format(year);
	}
	protected void spMonthStateChanged(ChangeEvent e) {
		Object month = spMonth.getValue();
		SimpleDateFormat sfm = new SimpleDateFormat("MM");
		str2 = sfm.format(month);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnStart) {
			btnStartActionPerformed(e);
		}
	}
	protected void btnStartActionPerformed(ActionEvent e) {
		if(str == null) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
			Date nowYear = new Date();
			str = sdf.format(nowYear);
		}
		if(str2 == null) {
			SimpleDateFormat sdf = new SimpleDateFormat("MM");
			Date nowMonth = new Date();
			str2 = sdf.format(nowMonth);
		}
		ccp = new NewClientChartPanel();
		ccp.setNewYear(Integer.parseInt(str));
		ccp.setNewMonth(Integer.parseInt(str2));
		
		GraphUIPanel.pLLChart.removeAll();
		GraphUIPanel.pLLChart.revalidate();
		GraphUIPanel.pLLChart.repaint();
		GraphUIPanel.pLLChart.add(ccp);
		
		Platform.runLater(() -> GraphUIPanel.initFX(ccp));
		
		GraphUIPanel.pLLChart.revalidate();
		GraphUIPanel.pLLChart.repaint();
		
		
	}
	
}
