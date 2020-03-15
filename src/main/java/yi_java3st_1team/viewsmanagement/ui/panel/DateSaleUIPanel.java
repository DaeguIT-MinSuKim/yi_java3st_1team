package yi_java3st_1team.viewsmanagement.ui.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import yi_java3st_1team.viewsmanagement.dto.DateSale;
import yi_java3st_1team.viewsmanagement.ui.list.DateSaleTblPanel;
import yi_java3st_1team.viewsmanagement.ui.service.DateSaleUIService;

@SuppressWarnings("serial")
public class DateSaleUIPanel extends JPanel {
	private DateSaleUIService service;
	private JPanel pTitle;
	private JLabel lblTitle;
	private JPanel pTop;
	private JPanel pSearch;
	private JPanel pList;
	private DateSaleTblPanel pDateSaleList;
	private JLabel lblStart;
	private JDateChooser dcStart;
	private JDateChooser dcEnd;
	private JButton btnSearch;
	private JButton btnTotal;

	
	public DateSaleUIPanel() {
		service = new DateSaleUIService();
		initialize();
	}
	private void initialize() {
		setPreferredSize(new Dimension(1500, 900));
		setLayout(null);
		
		pTitle = new JPanel();
		pTitle.setBounds(0, 0, 1500, 900);
		pTitle.setBackground(SystemColor.inactiveCaption);
		pTitle.setBorder(new EmptyBorder(30, 0, 0, 0));
		add(pTitle);
		pTitle.setLayout(null);
		
		lblTitle = new JLabel("날짜별 판매현황 조회");
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setBounds(0, 30, 1500, 42);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 32));
		pTitle.add(lblTitle);
		
		pTop = new JPanel();
		pTop.setBounds(0, 72, 1500, 828);
		pTop.setBackground(SystemColor.inactiveCaption);
		pTop.setBorder(new EmptyBorder(40, 100, 50, 100));
		pTitle.add(pTop);
		pTop.setLayout(null);
		
		pSearch = new JPanel();
		pSearch.setBounds(100, 40, 1300, 40);
		pSearch.setPreferredSize(new Dimension(1300, 40));
		pSearch.setBackground(SystemColor.inactiveCaption);
		pTop.add(pSearch);
		pSearch.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		lblStart = new JLabel("조  회  기  간");
		lblStart.setPreferredSize(new Dimension(140, 30));
		lblStart.setHorizontalAlignment(SwingConstants.CENTER);
		lblStart.setForeground(Color.BLACK);
		lblStart.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		pSearch.add(lblStart);
		
		dcStart = new JDateChooser(new Date(), "yyyy-MM-dd");
		dcStart.getCalendarButton().setPreferredSize(new Dimension(70, 30));
		dcStart.getCalendarButton().setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		dcStart.getCalendarButton().setText("시작");
		dcStart.setPreferredSize(new Dimension(165, 30));
		dcStart.setForeground(new Color(0, 102, 204));
		dcStart.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		dcStart.setBackground(new Color(135, 206, 250));
		dcStart.setBounds(124, 10, 145, 30);
		pSearch.add(dcStart);
		
		JLabel lblNewLabel = new JLabel("~");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setPreferredSize(new Dimension(30, 30));
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		pSearch.add(lblNewLabel);
		
		dcEnd = new JDateChooser(new Date(), "yyyy-MM-dd");
		dcEnd.getCalendarButton().setPreferredSize(new Dimension(70, 30));
		dcEnd.getCalendarButton().setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		dcEnd.getCalendarButton().setText("종료");
		dcEnd.setPreferredSize(new Dimension(165, 30));
		dcEnd.setForeground(new Color(0, 102, 204));
		dcEnd.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		dcEnd.setBackground(new Color(135, 206, 250));
		dcEnd.setBounds(301, 10, 145, 30);
		pSearch.add(dcEnd);
		
		btnSearch = new JButton("검색");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				java.util.Date uSDate = dcStart.getDate();
				java.sql.Date startDate = new java.sql.Date(uSDate.getTime());
				java.util.Date uEDate = dcEnd.getDate();
				java.sql.Date endDate = new java.sql.Date(uEDate.getTime());
				DateSale ds = new DateSale(startDate, endDate);
				try {
					pDateSaleList.loadDate(service.showDateSaleListByDate(ds));
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnSearch.setPreferredSize(new Dimension(80, 30));
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSearch.setFocusable(false);
		btnSearch.setBackground(new Color(70, 130, 180));
		pSearch.add(btnSearch);
		
		btnTotal = new JButton("전체");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pDateSaleList.loadDate(service.showDateSaleList());
			}
		});
		btnTotal.setPreferredSize(new Dimension(80, 30));
		btnTotal.setForeground(Color.WHITE);
		btnTotal.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnTotal.setFocusable(false);
		btnTotal.setBackground(new Color(70, 130, 180));
		pSearch.add(btnTotal);
		
		pList = new JPanel();
		pList.setBounds(100, 80, 1300, 698);
		pList.setBackground(SystemColor.inactiveCaptionBorder);
		pTop.add(pList);
		pList.setLayout(null);
		
		pDateSaleList = new DateSaleTblPanel();
		pDateSaleList.setBounds(0, 0, 1300, 698);
		pDateSaleList.setBackground(SystemColor.inactiveCaptionBorder);
		pDateSaleList.loadDate(service.showDateSaleList());
		pList.add(pDateSaleList);
	}
}
