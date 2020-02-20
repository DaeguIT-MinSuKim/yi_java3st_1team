package yi_java3st_1team.ordermanagement.ui.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ClientOCheckPanel extends JPanel {

	private JLabel lblO;
	private JPanel pList;
	private JLabel lblStart;
	private JSpinner spStart;
	private JLabel lblSYear;
	private JSpinner spSYear;
	private JLabel lblSMonth;
	private JSpinner spSMonth;
	private JLabel lblSDay;
	private JButton btnStart;
	private JButton btnSearch;
	private JLabel lblEnd;
	private JSpinner spEYear;
	private JLabel lblEYear;
	private JSpinner spEMonth;
	private JLabel lblEMonth;
	private JSpinner spEDay;
	private JLabel lblEDay;
	private JButton btnEnd;
	private JButton btnMain;
	public ClientOCheckPanel() {

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
		
		lblO = new JLabel("주문 현황 조회");
		lblO.setForeground(Color.BLACK);
		lblO.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 40));
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setBounds(0, 25, 1270, 60);
		panel.add(lblO);
		
		JPanel pDate = new JPanel();
		pDate.setBackground(Color.WHITE);
		pDate.setBounds(81, 99, 1100, 77);
		panel.add(pDate);
		
		lblStart = new JLabel("시   작");
		lblStart.setForeground(Color.BLACK);
		lblStart.setPreferredSize(new Dimension(110, 30));
		lblStart.setHorizontalAlignment(SwingConstants.LEFT);
		lblStart.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		pDate.add(lblStart);
		
		spStart = new JSpinner();
		spStart.setModel(new SpinnerNumberModel(new Integer(2020), null, null, new Integer(1)));
		spStart.setPreferredSize(new Dimension(150, 30));
		spStart.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spStart);
		
		lblSYear = new JLabel("년도");
		lblSYear.setPreferredSize(new Dimension(80, 20));
		lblSYear.setHorizontalAlignment(SwingConstants.LEFT);
		lblSYear.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(lblSYear);
		
		spSYear = new JSpinner();
		spSYear.setModel(new SpinnerNumberModel(new Integer(2), null, null, new Integer(1)));
		spSYear.setPreferredSize(new Dimension(150, 30));
		spSYear.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spSYear);
		
		lblSMonth = new JLabel("월");
		lblSMonth.setPreferredSize(new Dimension(70, 20));
		lblSMonth.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(lblSMonth);
		
		spSMonth = new JSpinner();
		spSMonth.setModel(new SpinnerNumberModel(new Integer(18), null, null, new Integer(1)));
		spSMonth.setPreferredSize(new Dimension(150, 30));
		spSMonth.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spSMonth);
		
		lblSDay = new JLabel("일");
		lblSDay.setPreferredSize(new Dimension(70, 20));
		lblSDay.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(lblSDay);
		
		btnStart = new JButton("시작");
		btnStart.setPreferredSize(new Dimension(80, 30));
		btnStart.setFont(new Font("굴림", Font.PLAIN, 16));
		pDate.add(btnStart);
		
		btnSearch = new JButton("검색");
		btnSearch.setPreferredSize(new Dimension(100, 30));
		btnSearch.setFont(new Font("굴림", Font.PLAIN, 16));
		pDate.add(btnSearch);
		
		lblEnd = new JLabel("종   료");
		lblEnd.setForeground(Color.BLACK);
		lblEnd.setPreferredSize(new Dimension(110, 30));
		lblEnd.setHorizontalAlignment(SwingConstants.LEFT);
		lblEnd.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		pDate.add(lblEnd);
		
		spEYear = new JSpinner();
		spEYear.setModel(new SpinnerNumberModel(new Integer(2020), null, null, new Integer(1)));
		spEYear.setPreferredSize(new Dimension(150, 30));
		spEYear.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spEYear);
		
		lblEYear = new JLabel("년도");
		lblEYear.setPreferredSize(new Dimension(80, 20));
		lblEYear.setHorizontalAlignment(SwingConstants.LEFT);
		lblEYear.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(lblEYear);
		
		spEMonth = new JSpinner();
		spEMonth.setModel(new SpinnerNumberModel(new Integer(2), null, null, new Integer(1)));
		spEMonth.setPreferredSize(new Dimension(150, 30));
		spEMonth.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spEMonth);
		
		lblEMonth = new JLabel("월");
		lblEMonth.setPreferredSize(new Dimension(70, 20));
		lblEMonth.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(lblEMonth);
		
		spEDay = new JSpinner();
		spEDay.setModel(new SpinnerNumberModel(new Integer(18), null, null, new Integer(1)));
		spEDay.setPreferredSize(new Dimension(150, 30));
		spEDay.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spEDay);
		
		lblEDay = new JLabel("일");
		lblEDay.setPreferredSize(new Dimension(70, 20));
		lblEDay.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(lblEDay);
		
		btnEnd = new JButton("종료");
		btnEnd.setPreferredSize(new Dimension(80, 30));
		btnEnd.setFont(new Font("굴림", Font.PLAIN, 16));
		pDate.add(btnEnd);
		
		btnMain = new JButton("");
		btnMain.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\btns\\메인화면.png"));
		btnMain.setPreferredSize(new Dimension(100, 30));
		btnMain.setFont(new Font("굴림", Font.PLAIN, 16));
		pDate.add(btnMain);
		
		pList = new JPanel();
		pList.setBounds(81, 186, 1100, 460);
		panel.add(pList);
		pList.setLayout(new BorderLayout(0, 0));
		
	}
}
