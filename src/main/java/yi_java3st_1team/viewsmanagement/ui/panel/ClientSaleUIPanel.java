package yi_java3st_1team.viewsmanagement.ui.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import yi_java3st_1team.viewsmanagement.dto.ClientSale;
import yi_java3st_1team.viewsmanagement.ui.content.TotalAmountPanel;
import yi_java3st_1team.viewsmanagement.ui.list.ClientSaleTblPanel;
import yi_java3st_1team.viewsmanagement.ui.service.ClientSaleUIService;

@SuppressWarnings("serial")
public class ClientSaleUIPanel extends JPanel {
	private ClientSaleUIService service;
	private JPanel pTitle;
	private JTextField textField;
	private JLabel lblTitle;
	private JPanel pTop;
	private JPanel pSearch;
	private JLabel lblCName;
	private JButton btnSearch;
	private JCheckBox cbTotal;
	private JPanel pList;
	private ClientSaleTblPanel pClientList;
	private JPanel pAmount;
	private TotalAmountPanel pTotalAmount;

	
	public ClientSaleUIPanel() {
		service = new ClientSaleUIService();
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
		
		lblTitle = new JLabel("\uACE0\uAC1D\uBCC4 \uD310\uB9E4\uD604\uD669 \uC870\uD68C");
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
		
		lblCName = new JLabel("고 객 상 호 명 ");
		lblCName.setPreferredSize(new Dimension(150, 30));
		lblCName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCName.setForeground(Color.BLACK);
		lblCName.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		pSearch.add(lblCName);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(130, 30));
		textField.setFont(new Font("굴림", Font.PLAIN, 16));
		textField.setColumns(15);
		pSearch.add(textField);
		
		btnSearch = new JButton("조회");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String CName = textField.getText();
				ClientSale cs = new ClientSale(CName);
				try {
					pClientList.loadDate(service.showClientSaleListByCName(cs));
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnSearch.setPreferredSize(new Dimension(70, 30));
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSearch.setBackground(new Color(70, 130, 180));
		pSearch.add(btnSearch);
		
		cbTotal = new JCheckBox(" 전체");
		cbTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pClientList.loadDate(service.showClientSaleList());
			}
		});
		cbTotal.setPreferredSize(new Dimension(80, 30));
		cbTotal.setHorizontalAlignment(SwingConstants.CENTER);
		cbTotal.setForeground(Color.BLACK);
		cbTotal.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		cbTotal.setBackground(SystemColor.inactiveCaption);
		pSearch.add(cbTotal);
		
		pList = new JPanel();
		pList.setBounds(100, 80, 1300, 658);
		pList.setBackground(SystemColor.inactiveCaptionBorder);
		pTop.add(pList);
		pList.setLayout(null);
		
		pClientList = new ClientSaleTblPanel();
		pClientList.setBounds(0, 0, 1300, 658);
		pClientList.setBackground(SystemColor.inactiveCaptionBorder);
		pClientList.loadDate(service.showClientSaleList());
		pList.add(pClientList);
		
		pAmount = new JPanel();
		pAmount.setBounds(100, 738, 1300, 40);
		pAmount.setBackground(SystemColor.inactiveCaption);
		pTop.add(pAmount);
		pAmount.setLayout(null);
		
		pTotalAmount = new TotalAmountPanel();
		pTotalAmount.setBounds(0, 0, 1300, 40);
		pAmount.add(pTotalAmount);
	}

}
