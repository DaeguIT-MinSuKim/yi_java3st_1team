package yi_java3st_1team.main.client.login;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.border.EmptyBorder;

import yi_java3st_1team.clientmanagement.dto.Client;
import yi_java3st_1team.clientmanagement.ui.service.ClientUIService;
import yi_java3st_1team.main.employee.login.MailService;
import yi_java3st_1team.main.ui.panel.JTextFieldHintUI;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ClientSearchPanel extends JPanel implements ActionListener, KeyListener {
	private JTextField tfNo;
	private JTextField tfName;
	private JTextField tfId;
	private JTextField tfMail;
	private JButton btnSearch;
	private JButton btnPass;
	private ClientUIService clService;
	private String cId;
	private String cMail;
	private int cNo;
	private String cName;


	public ClientSearchPanel() {
		clService = new ClientUIService();
		initialize();
	}
	private void initialize() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setPreferredSize(new Dimension(500, 500));
		setLayout(new GridLayout(0, 1, 10, 10));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("   - ID 찾기");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setPreferredSize(new Dimension(61, 80));
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		panel_1.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.add(panel_2, BorderLayout.SOUTH);
		
		btnSearch = new JButton("조회");
		btnSearch.addActionListener(this);
		btnSearch.setFocusable(false);
		btnSearch.setBackground(SystemColor.controlHighlight);
		btnSearch.setForeground(Color.BLACK);
		btnSearch.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		panel_2.add(btnSearch);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(20, 40, 20, 40));
		panel_4.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblNewLabel_2 = new JLabel("고 객 번 호");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(new Color(255, 255, 240));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_2);
		
		tfNo = new JTextField("C");
		tfNo.setForeground(Color.BLUE);
		tfNo.setFont(new Font("굴림", Font.BOLD, 15));
		panel_4.add(tfNo);
		tfNo.setColumns(10);
		tfNo.addKeyListener(this);
		
		JLabel lblNewLabel_3 = new JLabel("상  호  명");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(new Color(255, 255, 240));
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		panel_4.add(lblNewLabel_3);
		
		tfName = new JTextField();
		tfName.setForeground(Color.BLUE);
		tfName.setFont(new Font("굴림", Font.BOLD, 15));
		panel_4.add(tfName);
		tfName.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("   - PASSWORD 찾기");
		lblNewLabel_1.setPreferredSize(new Dimension(117, 80));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		panel.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel.add(panel_3, BorderLayout.SOUTH);
		
		btnPass = new JButton("임시 비밀번호 전송");
		btnPass.addActionListener(this);
		btnPass.setFocusable(false);
		btnPass.setBackground(SystemColor.controlHighlight);
		btnPass.setForeground(Color.BLACK);
		btnPass.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		panel_3.add(btnPass);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(20, 40, 20, 40));
		panel_5.setBackground(SystemColor.inactiveCaptionBorder);
		panel.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblNewLabel_4 = new JLabel("아 이 디");
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(new Color(255, 255, 240));
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		panel_5.add(lblNewLabel_4);
		
		tfId = new JTextField();
		tfId.setForeground(Color.BLACK);
		panel_5.add(tfId);
		tfId.setColumns(10);
		tfId.setEditable(false);
		tfId.setUI(new JTextFieldHintUI(">> 아이디 조회부터 먼저 해주세요.", Color.red));
		
		JLabel lblNewLabel_5 = new JLabel("이 메 일  주 소");
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBackground(new Color(255, 255, 240));
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_5);
		
		tfMail = new JTextField();
		tfMail.setForeground(Color.BLACK);
		panel_5.add(tfMail);
		tfMail.setColumns(10);
		tfMail.setUI(new JTextFieldHintUI(">> 가입당시 등록한 이메일", Color.red));
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnPass) {
			actionPerformedBtnPass(e);
		}
		if (e.getSource() == btnSearch) {
			actionPerformedBtnSearch(e);
		}
	}
	
	//조회
	protected void actionPerformedBtnSearch(ActionEvent e) {
		/*** 공백 & 일치하지 않는경우 & 고객번호 자리수 맞지 않는 경우 ***/
		if(tfNo.getText().equals("") || tfName.getText().equals("") || tfNo.getText().length() < 5 ){
			JOptionPane.showMessageDialog(null, "고객번호와 상호명을 정확히 입력해주세요.");
			clearTf();
		}
		
		/*** 고객번호 ***/
		String no = tfNo.getText(); // C0001
		tfNo.setText(no.toUpperCase()); //소문자입력시 대문자로
		try {
			String no1 = no.replaceAll("[C]", ""); // 0001
			cNo = Integer.parseInt(no1);
		}catch(NumberFormatException n) {
			
		}
		
		cName = tfName.getText(); 
		Client searchId = clService.lostID(new Client(cNo, cName));
		
		/*** 아이디 ***/
		if(searchId != null) {
			cId = searchId.getcId();
			JOptionPane.showMessageDialog(null, "아이디: " + cId);
			tfId.setText(cId);
		} else {
			JOptionPane.showMessageDialog(null, "사원번호와 이름이 일치하지 않습니다.");
			clearTf();
		}		
	}
	
	//임시비밀번호전송
	protected void actionPerformedBtnPass(ActionEvent e) {
		/*** 공백이 있을 경우 ***/
		if(tfId.getText().equals("")||tfMail.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "아이디와 이메일을 정확히 입력하세요.");
			clearTf();
		}
		
		/*** 메일 ***/
		cMail = tfMail.getText();
		Client test = clService.clientMail(new Client(cNo, cName, cId, cMail));
		
		String dbMail = test.getcMail();
		
		if(dbMail.equals(cMail)) {
			int acc = cMail.lastIndexOf("@");
			String mail = dbMail.substring(acc, 14);
			String email = dbMail;
			String title = "[Smart 소프트웨어(고객용)] 임시비밀번호 재발급 인증 메일입니다.";
			
			/*** 임시비밀번호 생성 ***/
			Random rnd = new Random();
			StringBuffer buf = new StringBuffer();
			for(int i=0;i<10;i++) {
				 if(rnd.nextBoolean()){
				        buf.append((char)((int)(rnd.nextInt(26))+97));
				    }else{

				        buf.append((rnd.nextInt(10)));
				    }
				}
			String cPw = String.format("%s", buf);
			String content = String.format("임시비밀번호는 %s 입니다. 해당 비밀번호로 로그인 해주세요.", cPw); 
			
			Client client = new Client(cNo, cName, cId, cPw, cMail);
			clService.resetClientPass(client);
			
			switch (mail) {
			case "@naver":
				// System.out.println("네이버");
				MailService.naverMailSend(email, title, content);
				break;

			case "@gmail":
				// System.out.println("지메일");
				MailService.gmailSend(email, title, content);
				break;
			}
			JOptionPane.showMessageDialog(null, "해당 주소로 임시비밀번호를 전송하였습니다.");
			clearTf();
		} else {
			JOptionPane.showMessageDialog(null, "가입 당시 등록한 이메일이 아닙니다.");
			clearTf();

		}
	}
	
	/*** 고객번호 자리수 제한 ***/
	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getSource() == tfNo) {
			tfNoKeyLength(e);
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 기능X
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// 기능X
		
	}
	
	//글자수 막기
	private void tfNoKeyLength(KeyEvent e) {
		if(tfNo.getText().length()>=5) {
			e.consume();
		}
	}
	
	//초기화
	private void clearTf() {
		tfNo.setText("C");
		tfName.setText("");
		tfId.setText("");
		tfMail.setText("");
	}
}
