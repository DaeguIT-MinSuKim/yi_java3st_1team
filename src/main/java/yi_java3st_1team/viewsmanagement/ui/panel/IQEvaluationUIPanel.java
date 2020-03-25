package yi_java3st_1team.viewsmanagement.ui.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import yi_java3st_1team.viewsmanagement.dto.IQEvaluation;
import yi_java3st_1team.viewsmanagement.ui.list.IQEvaluationTblPanel;
import yi_java3st_1team.viewsmanagement.ui.service.IQEvaluationUIService;

@SuppressWarnings("serial")
public class IQEvaluationUIPanel extends JPanel {
	private IQEvaluationUIService service;
	private JPanel pTitle;
	private JLabel lblTitle;
	private JPanel pTop;
	private JPanel pSearch;
	private JPanel pList;
	private IQEvaluationTblPanel pIQList;
	private JLabel lblProduct;
	private JTextField textField;
	private JButton btnSearch;
	private JRadioButton rdbtnTotal;
	private JRadioButton rdbtn01;
	private JRadioButton rdbtn02;
	private JRadioButton rdbtn03;

	
	public IQEvaluationUIPanel() {
		service = new IQEvaluationUIService();
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
		
		lblTitle = new JLabel("재고현황 조회");
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
		
		lblProduct = new JLabel("품   목   명");
		lblProduct.setPreferredSize(new Dimension(130, 30));
		lblProduct.setHorizontalAlignment(SwingConstants.CENTER);
		lblProduct.setForeground(Color.BLACK);
		lblProduct.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		pSearch.add(lblProduct);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(130, 30));
		textField.setFont(new Font("굴림", Font.PLAIN, 16));
		textField.setColumns(15);
		pSearch.add(textField);
		
		btnSearch = new JButton("조회");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String PName = textField.getText();
				IQEvaluation iq = new IQEvaluation(PName);
				try {
					pIQList.loadDate(service.showIQEvaluationByPName(iq));
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnSearch.setPreferredSize(new Dimension(70, 30));
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		btnSearch.setFocusable(false);
		btnSearch.setBackground(new Color(70, 130, 180));
		pSearch.add(btnSearch);
		
		rdbtnTotal = new JRadioButton("전체");
		rdbtnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pIQList.loadDate(service.showIQEvalutionList());
			}
		});
		rdbtnTotal.setSelected(true);
		rdbtnTotal.setPreferredSize(new Dimension(90, 30));
		rdbtnTotal.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnTotal.setForeground(Color.BLACK);
		rdbtnTotal.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 16));
		rdbtnTotal.setBackground(SystemColor.inactiveCaption);
		pSearch.add(rdbtnTotal);
		
		rdbtn01 = new JRadioButton("재고과다");
		rdbtn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pIQList.loadDate(service.showIQExcessiveByIQQty());
			}
		});
		rdbtn01.setPreferredSize(new Dimension(110, 30));
		rdbtn01.setForeground(Color.BLUE);
		rdbtn01.setFont(new Font("굴림", Font.BOLD, 16));
		rdbtn01.setBackground(SystemColor.inactiveCaption);
		pSearch.add(rdbtn01);
		
		rdbtn02 = new JRadioButton("적정재고");
		rdbtn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pIQList.loadDate(service.showIQModerateByIQQty());
			}
		});
		rdbtn02.setPreferredSize(new Dimension(110, 30));
		rdbtn02.setForeground(Color.BLACK);
		rdbtn02.setFont(new Font("굴림", Font.BOLD, 16));
		rdbtn02.setBackground(SystemColor.inactiveCaption);
		pSearch.add(rdbtn02);
		
		rdbtn03 = new JRadioButton("재고부족");
		rdbtn03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pIQList.loadDate(service.showIQShortageByIQQty());
			}
		});
		rdbtn03.setPreferredSize(new Dimension(110, 30));
		rdbtn03.setForeground(Color.RED);
		rdbtn03.setFont(new Font("굴림", Font.BOLD, 16));
		rdbtn03.setBackground(SystemColor.inactiveCaption);
		pSearch.add(rdbtn03);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnTotal);
		group.add(rdbtn01);
		group.add(rdbtn02);
		group.add(rdbtn03);
		
		pList = new JPanel();
		pList.setBounds(100, 80, 1300, 698);
		pList.setBackground(SystemColor.inactiveCaptionBorder);
		pTop.add(pList);
		pList.setLayout(null);
		
		pIQList = new IQEvaluationTblPanel();
		pIQList.setBounds(0, 0, 1300, 698);
		pIQList.setBackground(SystemColor.inactiveCaptionBorder);
		pIQList.loadDate(service.showIQEvalutionList());
		pList.add(pIQList);
	}

}
