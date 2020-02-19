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
		
		JSpinner spYear = new JSpinner();
		spYear.setModel(new SpinnerNumberModel(new Integer(2020), null, null, new Integer(1)));
		spYear.setPreferredSize(new Dimension(120, 30));
		spYear.setFont(new Font("굴림", Font.PLAIN, 18));
		add(spYear);
		
		JLabel lblYear = new JLabel("년도");
		lblYear.setPreferredSize(new Dimension(80, 30));
		lblYear.setHorizontalAlignment(SwingConstants.LEFT);
		lblYear.setFont(new Font("굴림", Font.BOLD, 16));
		add(lblYear);
		
		JSpinner spMonth = new JSpinner();
		spMonth.setModel(new SpinnerNumberModel(new Integer(2), null, null, new Integer(1)));
		spMonth.setPreferredSize(new Dimension(120, 30));
		spMonth.setFont(new Font("굴림", Font.PLAIN, 18));
		add(spMonth);
		
		JLabel lblMonth = new JLabel("월");
		lblMonth.setPreferredSize(new Dimension(70, 30));
		lblMonth.setFont(new Font("굴림", Font.BOLD, 16));
		add(lblMonth);
		
		JButton btnStart = new JButton("시작날짜선택");
		btnStart.setPreferredSize(new Dimension(150, 30));
		btnStart.setFont(new Font("굴림", Font.BOLD, 16));
		add(btnStart);
	}

}
