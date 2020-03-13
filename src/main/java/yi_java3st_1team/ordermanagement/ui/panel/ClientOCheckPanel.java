package yi_java3st_1team.ordermanagement.ui.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.main.ui.ClientMainUIPanel;
import yi_java3st_1team.ordermanagement.ui.list.ClientOCheckTblPanel;
import yi_java3st_1team.ordermanagement.ui.service.OrderUIService;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class ClientOCheckPanel extends JPanel implements ActionListener {

	private JLabel lblO;
	private ClientOCheckTblPanel pList;
	private OrderUIService service;
	private JPanel pSearch;
	private JButton btnAll;
	private JDateChooser dcStart;
	private JDateChooser dcEnd;
	private JButton btnSearch;
	private JButton btnGoMain;
	private Client info;
	
	public ClientOCheckPanel() {
		service = new OrderUIService();
		initialize();
	}
	private void initialize() {
		setBounds(new Rectangle(0, 0, 1530, 700));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pCOCheck = new JPanel();
		add(pCOCheck, BorderLayout.CENTER);
		pCOCheck.setBounds(new Rectangle(0, 0, 1270, 700));
		pCOCheck.setBackground(SystemColor.inactiveCaptionBorder);
		pCOCheck.setLayout(null);
		
		lblO = new JLabel("주문 현황 조회");
		lblO.setForeground(Color.BLACK);
		lblO.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 40));
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setBounds(0, 25, 1530, 60);
		pCOCheck.add(lblO);
		
		pList = new ClientOCheckTblPanel();
		pList.setBounds(80, 186, 1370, 460);
		info = ClientMainUIPanel.loginCl;
		pList.loadDate(service.showClientOrderList(info));
		pCOCheck.add(pList);
		
		pSearch = new JPanel();
		pSearch.setBackground(Color.WHITE);
		pSearch.setBounds(80, 128, 638, 48);
		pCOCheck.add(pSearch);
		pSearch.setLayout(null);
		
		JLabel label = new JLabel("조 회 기 간");
		label.setPreferredSize(new Dimension(110, 30));
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		label.setBounds(12, 10, 100, 30);
		pSearch.add(label);
		
		dcStart = new JDateChooser(new Date(), "yyyy-MM-dd");
		dcStart.getCalendarButton().setText("시 작");
		dcStart.setPreferredSize(new Dimension(80, 30));
		dcStart.setForeground(new Color(0, 102, 204));
		dcStart.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		dcStart.setBackground(new Color(135, 206, 250));
		dcStart.setBounds(124, 10, 145, 30);
		pSearch.add(dcStart);
		
		dcEnd = new JDateChooser(new Date(), "yyyy-MM-dd");
		dcEnd.getCalendarButton().setText("종 료");
		dcEnd.setPreferredSize(new Dimension(80, 30));
		dcEnd.setForeground(new Color(0, 102, 204));
		dcEnd.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		dcEnd.setBackground(new Color(135, 206, 250));
		dcEnd.setBounds(301, 10, 145, 30);
		pSearch.add(dcEnd);
		
		btnSearch = new JButton("검색");
		btnSearch.addActionListener(this);
		btnSearch.setFocusable(false);
		btnSearch.setPreferredSize(new Dimension(100, 30));
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSearch.setBackground(new Color(255, 204, 153));
		btnSearch.setBounds(458, 9, 80, 30);
		pSearch.add(btnSearch);
		
		JLabel lblNewLabel = new JLabel("~");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(270, 11, 30, 30);
		pSearch.add(lblNewLabel);
		
		btnAll = new JButton("전체");
		btnAll.addActionListener(this);
		btnAll.setFocusable(false);
		btnAll.setBounds(550, 9, 80, 30);
		pSearch.add(btnAll);
		btnAll.setPreferredSize(new Dimension(100, 30));
		btnAll.setForeground(Color.WHITE);
		btnAll.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnAll.setBackground(new Color(255, 204, 153));
		
		btnGoMain = new JButton("메인화면");
		btnGoMain.setFocusable(false);
		btnGoMain.setBounds(1320, 138, 130, 30);
		pCOCheck.add(btnGoMain);
		btnGoMain.setPreferredSize(new Dimension(100, 30));
		btnGoMain.setForeground(Color.WHITE);
		btnGoMain.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnGoMain.setBackground(new Color(25, 25, 112));
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSearch) {
			btnSearchActionPerformed(e);
		}
		if (e.getSource() == btnAll) {
			btnAllActionPerformed(e);
		}
	}
	protected void btnAllActionPerformed(ActionEvent e) {
		pList.loadDate(service.showClientOrderList(info));
	}
	protected void btnSearchActionPerformed(ActionEvent e) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String startDate = sdf.format(dcStart.getDate());
		String endDate = sdf.format(dcEnd.getDate());
		pList.loadDate(service.showOrderListByCal(startDate, endDate));
	}
}
