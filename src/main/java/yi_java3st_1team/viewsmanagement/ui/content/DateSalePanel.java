package yi_java3st_1team.viewsmanagement.ui.content;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SpinnerNumberModel;

@SuppressWarnings("serial")
public class DateSalePanel extends JPanel {

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
		lblStart.setPreferredSize(new Dimension(120, 30));
		lblStart.setHorizontalAlignment(SwingConstants.LEFT);
		lblStart.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(lblStart);
		
		JSpinner spStartY = new JSpinner();
		spStartY.setModel(new SpinnerNumberModel(new Integer(2020), null, null, new Integer(1)));
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
		
		JLabel lblExit = new JLabel("종   료");
		lblExit.setPreferredSize(new Dimension(120, 30));
		lblExit.setHorizontalAlignment(SwingConstants.LEFT);
		lblExit.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(lblExit);
		
		JSpinner spExitY = new JSpinner();
		spExitY.setModel(new SpinnerNumberModel(new Integer(2020), null, null, new Integer(1)));
		spExitY.setPreferredSize(new Dimension(180, 30));
		spExitY.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(spExitY);
		
		JLabel lblExitY = new JLabel("년도");
		lblExitY.setPreferredSize(new Dimension(100, 20));
		lblExitY.setHorizontalAlignment(SwingConstants.LEFT);
		lblExitY.setFont(new Font("굴림", Font.BOLD, 12));
		panel.add(lblExitY);
		
		JSpinner spExitM = new JSpinner();
		spExitM.setModel(new SpinnerNumberModel(2, 1, 12, 1));
		spExitM.setPreferredSize(new Dimension(180, 30));
		spExitM.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(spExitM);
		
		JLabel lblExitM = new JLabel("월");
		lblExitM.setPreferredSize(new Dimension(100, 20));
		lblExitM.setFont(new Font("굴림", Font.BOLD, 12));
		panel.add(lblExitM);
		
		JSpinner spExitD = new JSpinner();
		spExitD.setModel(new SpinnerNumberModel(18, 1, 31, 1));
		spExitD.setPreferredSize(new Dimension(180, 30));
		spExitD.setFont(new Font("굴림", Font.BOLD, 18));
		panel.add(spExitD);
		
		JLabel lblExitD = new JLabel("일");
		lblExitD.setPreferredSize(new Dimension(100, 20));
		lblExitD.setFont(new Font("굴림", Font.BOLD, 12));
		panel.add(lblExitD);
		
		JButton btnExit = new JButton("종료");
		btnExit.setPreferredSize(new Dimension(80, 30));
		btnExit.setFont(new Font("굴림", Font.PLAIN, 16));
		panel.add(btnExit);
		
		JButton btnMain = new JButton("메인화면");
		btnMain.setPreferredSize(new Dimension(100, 30));
		btnMain.setFont(new Font("굴림", Font.PLAIN, 16));
		panel.add(btnMain);
	}

}
