package yi_java3st_1team.ordermanagement.ui.panel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class OCheckPanel extends JPanel {

	private JLabel lblO;
	private JPanel pList;
	private JLabel label;
	private JSpinner spinner;
	private JLabel label_1;
	private JSpinner spinner_1;
	private JLabel label_2;
	private JSpinner spinner_2;
	private JLabel label_3;
	private JButton button;
	private JButton button_1;
	private JLabel label_4;
	private JSpinner spinner_3;
	private JLabel label_5;
	private JSpinner spinner_4;
	private JLabel label_6;
	private JSpinner spinner_5;
	private JLabel label_7;
	private JButton button_2;
	private JButton button_3;
	public OCheckPanel() {

		initialize();
	}
	private void initialize() {
		setBounds(new Rectangle(0, 0, 1270, 700));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setBounds(new Rectangle(0, 0, 1270, 700));
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setLayout(null);
		
		lblO = new JLabel("주문 확인 & 처리");
		lblO.setForeground(Color.BLACK);
		lblO.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 40));
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setBounds(0, 25, 1270, 60);
		panel.add(lblO);
		
		JPanel pDate = new JPanel();
		pDate.setBackground(Color.WHITE);
		pDate.setBounds(81, 99, 1100, 77);
		panel.add(pDate);
		
		label = new JLabel("시   작");
		label.setForeground(Color.BLACK);
		label.setPreferredSize(new Dimension(110, 30));
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		pDate.add(label);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(2020), null, null, new Integer(1)));
		spinner.setPreferredSize(new Dimension(150, 30));
		spinner.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spinner);
		
		label_1 = new JLabel("년도");
		label_1.setPreferredSize(new Dimension(80, 20));
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(label_1);
		
		spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Integer(2), null, null, new Integer(1)));
		spinner_1.setPreferredSize(new Dimension(150, 30));
		spinner_1.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spinner_1);
		
		label_2 = new JLabel("월");
		label_2.setPreferredSize(new Dimension(70, 20));
		label_2.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(label_2);
		
		spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(new Integer(18), null, null, new Integer(1)));
		spinner_2.setPreferredSize(new Dimension(150, 30));
		spinner_2.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spinner_2);
		
		label_3 = new JLabel("일");
		label_3.setPreferredSize(new Dimension(70, 20));
		label_3.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(label_3);
		
		button = new JButton("시작");
		button.setPreferredSize(new Dimension(80, 30));
		button.setFont(new Font("굴림", Font.PLAIN, 16));
		pDate.add(button);
		
		button_1 = new JButton("검색");
		button_1.setPreferredSize(new Dimension(100, 30));
		button_1.setFont(new Font("굴림", Font.PLAIN, 16));
		pDate.add(button_1);
		
		label_4 = new JLabel("종   료");
		label_4.setForeground(Color.BLACK);
		label_4.setPreferredSize(new Dimension(110, 30));
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		pDate.add(label_4);
		
		spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(new Integer(2020), null, null, new Integer(1)));
		spinner_3.setPreferredSize(new Dimension(150, 30));
		spinner_3.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spinner_3);
		
		label_5 = new JLabel("년도");
		label_5.setPreferredSize(new Dimension(80, 20));
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(label_5);
		
		spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(new Integer(2), null, null, new Integer(1)));
		spinner_4.setPreferredSize(new Dimension(150, 30));
		spinner_4.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spinner_4);
		
		label_6 = new JLabel("월");
		label_6.setPreferredSize(new Dimension(70, 20));
		label_6.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(label_6);
		
		spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(new Integer(18), null, null, new Integer(1)));
		spinner_5.setPreferredSize(new Dimension(150, 30));
		spinner_5.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spinner_5);
		
		label_7 = new JLabel("일");
		label_7.setPreferredSize(new Dimension(70, 20));
		label_7.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(label_7);
		
		button_2 = new JButton("종료");
		button_2.setPreferredSize(new Dimension(80, 30));
		button_2.setFont(new Font("굴림", Font.PLAIN, 16));
		pDate.add(button_2);
		
		button_3 = new JButton("");
		button_3.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\btns\\메인화면.png"));
		button_3.setPreferredSize(new Dimension(100, 30));
		button_3.setFont(new Font("굴림", Font.PLAIN, 16));
		pDate.add(button_3);
		
		pList = new JPanel();
		pList.setBounds(81, 186, 1100, 460);
		panel.add(pList);
		pList.setLayout(new BorderLayout(0, 0));
		
	}
}
