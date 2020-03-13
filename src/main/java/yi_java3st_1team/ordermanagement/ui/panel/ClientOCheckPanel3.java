package yi_java3st_1team.ordermanagement.ui.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.main.ui.ClientMainUIPanel;
import yi_java3st_1team.ordermanagement.ui.list.ClientOCheckTblPanel;
import yi_java3st_1team.ordermanagement.ui.service.OrderUIService;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ClientOCheckPanel3 extends JPanel implements ActionListener {

	private JLabel lblO;
	private ClientOCheckTblPanel pList;
	private JLabel lblStart;
	private JSpinner spSYear;
	private JLabel lblSYear;
	private JSpinner spSMonth;
	private JLabel lblSMonth;
	private JSpinner spSDay;
	private JLabel lblSDay;
	private JDateChooser btnStart;
	private JButton btnSearch;
	private JLabel lblEnd;
	private JSpinner spEYear;
	private JLabel lblEYear;
	private JSpinner spEMonth;
	private JLabel lblEMonth;
	private JSpinner spEDay;
	private JLabel lblEDay;
	private JDateChooser btnEnd;
	private JButton btnMain;
	private OrderUIService service;
	
	public ClientOCheckPanel3() {
		service = new OrderUIService();
		initialize();
	}
	private void initialize() {
		setBounds(new Rectangle(0, 0, 1530, 700));
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
		lblO.setBounds(0, 25, 1530, 60);
		panel.add(lblO);
		
		JPanel pDate = new JPanel();
		pDate.setBackground(Color.WHITE);
		pDate.setBounds(81, 99, 1370, 77);
		panel.add(pDate);
		pDate.setLayout(null);
		
		lblStart = new JLabel("시   작");
		lblStart.setBounds(145, 5, 65, 30);
		lblStart.setForeground(Color.BLACK);
		lblStart.setPreferredSize(new Dimension(110, 30));
		lblStart.setHorizontalAlignment(SwingConstants.LEFT);
		lblStart.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		pDate.add(lblStart);
		
		Calendar calendar = Calendar.getInstance();
		Date value = calendar.getTime();
		
		SpinnerDateModel dateModel = new SpinnerDateModel(value, null, null, Calendar.YEAR);		
		spSYear = new JSpinner(dateModel);
		spSYear.setBounds(290, 5, 150, 30);
		spSYear.setEditor(new JSpinner.DateEditor(spSYear, "yyyy"));
		spSYear.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(631170000000L), null, Calendar.YEAR));
		spSYear.setPreferredSize(new Dimension(150, 30));
		spSYear.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spSYear);
		
		lblSYear = new JLabel("년도");
		lblSYear.setBounds(445, 10, 30, 20);
		lblSYear.setPreferredSize(new Dimension(80, 20));
		lblSYear.setHorizontalAlignment(SwingConstants.LEFT);
		lblSYear.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(lblSYear);
		
		spSMonth = new JSpinner(dateModel);
		spSMonth.setBounds(496, 5, 150, 30);
		spSMonth.setEditor(new JSpinner.DateEditor(spSMonth, "MM"));
		spSMonth.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(-2208970800000L), null, Calendar.MONTH));
		spSMonth.setPreferredSize(new Dimension(150, 30));
		spSMonth.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spSMonth);
		
		lblSMonth = new JLabel("월");
		lblSMonth.setBounds(651, 10, 20, 20);
		lblSMonth.setPreferredSize(new Dimension(70, 20));
		lblSMonth.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(lblSMonth);
		
		spSDay = new JSpinner(dateModel);
		spSDay.setBounds(726, 5, 150, 30);
		spSDay.setEditor(new JSpinner.DateEditor(spSDay, "dd"));
		spSDay.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(-2208970800000L), null, Calendar.MONTH));
		spSDay.setPreferredSize(new Dimension(150, 30));
		spSDay.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spSDay);
		
		lblSDay = new JLabel("일");
		lblSDay.setBounds(881, 10, 20, 20);
		lblSDay.setPreferredSize(new Dimension(70, 20));
		lblSDay.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(lblSDay);
		
		btnStart = new JDateChooser(new Date(), "yyyy-MM-dd");
		btnStart.getCalendarButton().setText("시 작");
		btnStart.setBounds(932, 4, 158, 30);
		btnStart.setBackground(new Color(135, 206, 250));
		btnStart.setForeground(new Color(0, 102, 204));
		btnStart.setPreferredSize(new Dimension(80, 30));
		btnStart.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		pDate.add(btnStart);
		
		btnSearch = new JButton("검색");
		btnSearch.addActionListener(this);
		btnSearch.setBounds(1095, 5, 130, 30);
		btnSearch.setBackground(new Color(255, 204, 153));
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setPreferredSize(new Dimension(100, 30));
		btnSearch.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		pDate.add(btnSearch);
		
		lblEnd = new JLabel("종   료");
		lblEnd.setBounds(145, 40, 65, 30);
		lblEnd.setForeground(Color.BLACK);
		lblEnd.setPreferredSize(new Dimension(110, 30));
		lblEnd.setHorizontalAlignment(SwingConstants.LEFT);
		lblEnd.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		pDate.add(lblEnd);
		
		spEYear = new JSpinner(dateModel);
		spEYear.setBounds(290, 40, 150, 30);
		spEYear.setEditor(new JSpinner.DateEditor(spEYear, "yyyy"));
		spEYear.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(631170000000L), null, Calendar.YEAR));
		spEYear.setPreferredSize(new Dimension(150, 30));
		spEYear.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spEYear);
		
		lblEYear = new JLabel("년도");
		lblEYear.setBounds(445, 45, 30, 20);
		lblEYear.setPreferredSize(new Dimension(80, 20));
		lblEYear.setHorizontalAlignment(SwingConstants.LEFT);
		lblEYear.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(lblEYear);
		
		spEMonth = new JSpinner(dateModel);
		spEMonth.setBounds(496, 40, 150, 30);
		spEMonth.setEditor(new JSpinner.DateEditor(spEMonth, "MM"));
		spEMonth.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(-2208970800000L), null, Calendar.MONTH));
		spEMonth.setPreferredSize(new Dimension(150, 30));
		spEMonth.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spEMonth);
		
		lblEMonth = new JLabel("월");
		lblEMonth.setBounds(651, 45, 20, 20);
		lblEMonth.setPreferredSize(new Dimension(70, 20));
		lblEMonth.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(lblEMonth);
		
		spEDay = new JSpinner(dateModel);
		spEDay.setBounds(726, 40, 150, 30);
		spEDay.setEditor(new JSpinner.DateEditor(spEDay, "dd"));
		spEDay.setModel(new SpinnerDateModel(new Date(1582174800000L), new Date(-2208970800000L), null, Calendar.MONTH));
		spEDay.setPreferredSize(new Dimension(150, 30));
		spEDay.setFont(new Font("굴림", Font.BOLD, 18));
		pDate.add(spEDay);
		
		lblEDay = new JLabel("일");
		lblEDay.setBounds(881, 45, 20, 20);
		lblEDay.setPreferredSize(new Dimension(70, 20));
		lblEDay.setFont(new Font("굴림", Font.BOLD, 12));
		pDate.add(lblEDay);
		
		btnEnd = new JDateChooser(new Date(), "yyyy-MM-dd");
		btnEnd.getCalendarButton().setText("종 료");
		btnEnd.setBounds(932, 39, 158, 30);
		btnEnd.setBackground(new Color(135, 206, 250));
		btnEnd.setForeground(new Color(0, 102, 204));
		btnEnd.setPreferredSize(new Dimension(80, 30));
		btnEnd.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		pDate.add(btnEnd);
		
		btnMain = new JButton("메인화면");
		btnMain.setBounds(1095, 40, 130, 30);
		btnMain.setBackground(new Color(25, 25, 112));
		btnMain.setForeground(Color.WHITE);
		btnMain.setIcon(new ImageIcon("D:\\workspace\\workspace_gradle\\yi_java3st_1team\\images\\btns\\메인화면.png"));
		btnMain.setPreferredSize(new Dimension(100, 30));
		btnMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		pDate.add(btnMain);
		
		pList = new ClientOCheckTblPanel();
		pList.setBounds(80, 186, 1370, 460);
		Client info = ClientMainUIPanel.loginCl;
		pList.loadDate(service.showClientOrderList(info));
		panel.add(pList);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSearch) {
			btnSearchActionPerformed(e);
		}
	}
	protected void btnSearchActionPerformed(ActionEvent e) {
		pList.loadDate(service.showClientOrderList(ClientMainUIPanel.loginCl));
	}
}
