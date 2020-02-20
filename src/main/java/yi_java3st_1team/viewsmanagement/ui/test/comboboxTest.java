package yi_java3st_1team.viewsmanagement.ui.test;

import java.time.Month;
import java.util.concurrent.TimeUnit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

@SuppressWarnings("serial")
public class comboboxTest extends JPanel {

	/**
	 * Create the panel.
	 */
	public comboboxTest() {

		initialize();
	}
	private void initialize() {
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Month.values()));
		comboBox.setBounds(28, 41, 112, 21);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(Month.values()));
		comboBox_1.setBounds(167, 41, 112, 21);
		add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(TimeUnit.values()));
		comboBox_2.setBounds(305, 41, 104, 21);
		add(comboBox_2);
		
		JButton btnStart = new JButton("시작");
		btnStart.setBounds(312, 159, 97, 23);
		add(btnStart);
		
		JButton btnEnd = new JButton("종료");
		btnEnd.setBounds(312, 200, 97, 23);
		add(btnEnd);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(2020), null, null, new Integer(1)));
		spinner.setBounds(51, 160, 71, 22);
		add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Integer(2), null, null, new Integer(1)));
		spinner_1.setBounds(134, 160, 65, 22);
		add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Integer(20), null, null, new Integer(1)));
		spinner_2.setBounds(222, 160, 65, 22);
		add(spinner_2);
	}
}
