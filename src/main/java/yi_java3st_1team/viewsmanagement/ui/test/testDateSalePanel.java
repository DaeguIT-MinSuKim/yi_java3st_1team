package yi_java3st_1team.viewsmanagement.ui.test;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

@SuppressWarnings("serial")
public class testDateSalePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public testDateSalePanel() {

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
		lblStart.setPreferredSize(new Dimension(120, 30));
		lblStart.setHorizontalAlignment(SwingConstants.LEFT);
		lblStart.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(lblStart);
		
		Calendar calendar = Calendar.getInstance();
		Date value = calendar.getTime();
		
		SpinnerDateModel dateModel = new SpinnerDateModel(value, null, null, Calendar.YEAR);
		JSpinner spStartY = new JSpinner(dateModel);
		spStartY.setEditor(new JSpinner.DateEditor(spStartY, "yyyy"));
		spStartY.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(-2208970800000L), null, Calendar.YEAR));
		spStartY.setPreferredSize(new Dimension(180, 30));
		spStartY.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(spStartY);
		
		JLabel lblStartY = new JLabel("년도");
		lblStartY.setPreferredSize(new Dimension(100, 20));
		lblStartY.setHorizontalAlignment(SwingConstants.LEFT);
		lblStartY.setFont(new Font("굴림", Font.BOLD, 12));
		panel.add(lblStartY);
		
		JSpinner spStartM = new JSpinner();
		spStartM.setModel(new SpinnerNumberModel(2, 1, 12, 1));
		spStartM.setPreferredSize(new Dimension(180, 30));
		spStartM.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(spStartM);
		
		JLabel lblStartM = new JLabel("월");
		lblStartM.setPreferredSize(new Dimension(100, 20));
		lblStartM.setFont(new Font("굴림", Font.BOLD, 12));
		panel.add(lblStartM);
		
		JSpinner spStartD = new JSpinner();
		spStartD.setModel(new SpinnerNumberModel(18, 1, 31, 1));
		spStartD.setPreferredSize(new Dimension(180, 30));
		spStartD.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(spStartD);
		
		JLabel lblStartD = new JLabel("일");
		lblStartD.setPreferredSize(new Dimension(100, 20));
		lblStartD.setFont(new Font("굴림", Font.BOLD, 12));
		panel.add(lblStartD);
		
		JButton btnStart = new JButton("시작");
		btnStart.setPreferredSize(new Dimension(80, 30));
		btnStart.setFont(new Font("굴림", Font.PLAIN, 16));
		panel.add(btnStart);
		
		JButton btnSearch = new JButton("검색");
		btnSearch.setPreferredSize(new Dimension(100, 30));
		btnSearch.setFont(new Font("굴림", Font.PLAIN, 16));
		panel.add(btnSearch);
		
		JLabel lblEnd = new JLabel("종   료");
		lblEnd.setPreferredSize(new Dimension(120, 30));
		lblEnd.setHorizontalAlignment(SwingConstants.LEFT);
		lblEnd.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(lblEnd);
		
		JSpinner spEnd = new JSpinner();
		spEnd.setModel(new SpinnerNumberModel(new Integer(2020), new Integer(2020), null, new Integer(1)));
		spEnd.setPreferredSize(new Dimension(180, 30));
		spEnd.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(spEnd);
		
		JLabel lblEndY = new JLabel("년도");
		lblEndY.setPreferredSize(new Dimension(100, 20));
		lblEndY.setHorizontalAlignment(SwingConstants.LEFT);
		lblEndY.setFont(new Font("굴림", Font.BOLD, 12));
		panel.add(lblEndY);
		
		JSpinner spEndM = new JSpinner();
		spEndM.setModel(new SpinnerNumberModel(2, 1, 12, 1));
		spEndM.setPreferredSize(new Dimension(180, 30));
		spEndM.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(spEndM);
		
		JLabel lblEndM = new JLabel("월");
		lblEndM.setPreferredSize(new Dimension(100, 20));
		lblEndM.setFont(new Font("굴림", Font.BOLD, 12));
		panel.add(lblEndM);
		
		JSpinner spEndD = new JSpinner();
		spEndD.setModel(new SpinnerNumberModel(18, 1, 31, 1));
		spEndD.setPreferredSize(new Dimension(180, 30));
		spEndD.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(spEndD);
		
		JLabel lblEndD = new JLabel("일");
		lblEndD.setPreferredSize(new Dimension(100, 20));
		lblEndD.setFont(new Font("굴림", Font.BOLD, 12));
		panel.add(lblEndD);
		
		JButton btnEnd = new JButton("종료");
		btnEnd.setPreferredSize(new Dimension(80, 30));
		btnEnd.setFont(new Font("굴림", Font.PLAIN, 16));
		panel.add(btnEnd);
		
		JButton btnMain = new JButton("메인화면");
		btnMain.setPreferredSize(new Dimension(100, 30));
		btnMain.setFont(new Font("굴림", Font.PLAIN, 16));
		panel.add(btnMain);
	}

}
