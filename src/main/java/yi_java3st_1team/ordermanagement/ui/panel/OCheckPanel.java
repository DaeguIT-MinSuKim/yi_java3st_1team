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

@SuppressWarnings("serial")
public class OCheckPanel extends JPanel {

	private JLabel lblO;
	private JButton btnCheck;
	private JButton btnGoMain;
	private JPanel pList;
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
		lblO.setFont(new Font("굴림", Font.BOLD, 38));
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setBounds(101, 50, 407, 60);
		panel.add(lblO);
		
		btnCheck = new JButton("확 인");
		btnCheck.setBounds(900, 60, 130, 30);
		panel.add(btnCheck);
		
		btnGoMain = new JButton("메 인 화 면");
		btnGoMain.setBounds(1080, 60, 130, 30);
		panel.add(btnGoMain);
		
		pList = new JPanel();
		pList.setBounds(111, 130, 1100, 510);
		panel.add(pList);
		pList.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		pList.add(scrollPane, BorderLayout.CENTER);
		
		JPanel pCheckList = new JPanel();
		scrollPane.setViewportView(pCheckList);
		
	}
}
