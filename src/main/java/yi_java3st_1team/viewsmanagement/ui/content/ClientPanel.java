package yi_java3st_1team.viewsmanagement.ui.content;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.Color;

@SuppressWarnings("serial")
public class ClientPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ClientPanel() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaption);
		setSize(new Dimension(750, 40));
		
		Calendar calendar = Calendar.getInstance();
		Date value = calendar.getTime();
		
		SpinnerDateModel dateModel = new SpinnerDateModel(value, null, null, Calendar.YEAR);		
		JSpinner spYear = new JSpinner(dateModel);
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
		
		JSpinner spMonth = new JSpinner(dateModel);
		spMonth.setEditor(new JSpinner.DateEditor(spMonth, "MM"));
		spMonth.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(-2208970800000L), null, Calendar.MONTH));
		spMonth.setPreferredSize(new Dimension(120, 30));
		spMonth.setFont(new Font("굴림", Font.BOLD, 18));
		add(spMonth);
		
		
		JLabel lblMonth = new JLabel("월");
		lblMonth.setPreferredSize(new Dimension(70, 30));
		lblMonth.setFont(new Font("굴림", Font.BOLD, 16));
		add(lblMonth);
		
		JButton btnStart = new JButton("시작날짜선택");
		btnStart.setBackground(new Color(70,130,180));
		btnStart.setForeground(Color.WHITE);
		btnStart.setPreferredSize(new Dimension(150, 30));
		btnStart.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		add(btnStart);
	}

}
