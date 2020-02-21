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
public class OCheckPanel extends JPanel {

	private JLabel lblO;
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
		lblO.setForeground(Color.BLACK);
		lblO.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 40));
		lblO.setHorizontalAlignment(SwingConstants.LEFT);
		lblO.setBounds(122, 42, 390, 60);
		panel.add(lblO);
		
		pList = new JPanel();
		pList.setBounds(81, 122, 1100, 524);
		panel.add(pList);
		pList.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnNewButton.setBounds(947, 65, 111, 33);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("메인화면");
		btnNewButton_1.setBackground(new Color(25, 25, 112));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnNewButton_1.setBounds(1070, 65, 111, 33);
		panel.add(btnNewButton_1);
		
	}
}
