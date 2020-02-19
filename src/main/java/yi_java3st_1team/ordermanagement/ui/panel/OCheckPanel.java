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
		lblO.setFont(new Font("굴림", Font.BOLD, 38));
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setBounds(425, 25, 407, 60);
		panel.add(lblO);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(81, 86, 1100, 119);
		panel.add(panel_1);
		
		pList = new JPanel();
		pList.setBounds(81, 215, 1100, 427);
		panel.add(pList);
		pList.setLayout(new BorderLayout(0, 0));
		
	}
}
