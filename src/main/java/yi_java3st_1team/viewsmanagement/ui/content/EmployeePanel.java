package yi_java3st_1team.viewsmanagement.ui.content;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;

@SuppressWarnings("serial")
public class EmployeePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public EmployeePanel() {

		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaption);
		setSize(new Dimension(750, 40));
		
		JLabel lblDept = new JLabel("영 업 부 서");
		lblDept.setPreferredSize(new Dimension(200, 30));
		lblDept.setHorizontalAlignment(SwingConstants.CENTER);
		lblDept.setFont(new Font("굴림", Font.BOLD, 18));
		add(lblDept);
		
		JComboBox cmbMonth = new JComboBox();
		cmbMonth.setModel(new DefaultComboBoxModel(new String[] {"1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"}));
		cmbMonth.setPreferredSize(new Dimension(200, 30));
		cmbMonth.setFont(new Font("굴림", Font.PLAIN, 16));
		add(cmbMonth);
		
		JCheckBox cbTotal = new JCheckBox("전체");
		cbTotal.setPreferredSize(new Dimension(170, 30));
		cbTotal.setHorizontalAlignment(SwingConstants.CENTER);
		cbTotal.setFont(new Font("굴림", Font.PLAIN, 16));
		cbTotal.setBackground(SystemColor.inactiveCaption);
		add(cbTotal);
	}

}
